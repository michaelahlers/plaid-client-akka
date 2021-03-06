package plaid.client.models.response

import plaid.client.models.request.common.Product
import shapeless.tag._

/**
 * @see [[com.plaid.client.response.Institution]]
 *
 * @author <a href="michael@ahlers.consulting">Michael Ahlers</a>
 */
object Institution {

	object Tags {
		trait Id
		trait Name
		trait MultiFactorAuthentication

		type MFA = MultiFactorAuthentication
	}

	type Id = String @@ Tags.Id
	type Name = String @@ Tags.Name
	type MultiFactorAuthentication = String @@ Tags.MultiFactorAuthentication
	type MFA = MultiFactorAuthentication

	object Credential {

		object Tags {
			trait Label
			trait Name
			trait Type
		}

		type Label = String @@ Tags.Label
		type Name = String @@ Tags.Name
		type Type = String @@ Tags.Type

	}

	case class Credential(
		label: Credential.Label,
		name: Credential.Name,
		typ: Credential.Type
	)

}

case class Institution(
	id: Institution.Id,
	name: Institution.Name,
	credentials: List[Institution.Credential],
	hasMFA: Boolean,
	multiFactorAuthentications: List[Institution.MFA],
	products: List[Product]
)
