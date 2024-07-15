package  io.jmix.petclinic.security;
import io.jmix.petclinic.entity.User;
import io.jmix.petclinic.entity.owner.Owner;
import io.jmix.petclinic.entity.pet.Pet;
import io.jmix.petclinic.entity.pet.PetType;
import io.jmix.petclinic.entity.veterinarian.Specialty;
import io.jmix.petclinic.entity.veterinarian.Veterinarian;
import io.jmix.petclinic.entity.visit.Visit;
import io.jmix.petclinic.entity.visit.VisitType;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "AnonymousRestRole", code = AnonymousRestRole.CODE, scope = "API")
public interface AnonymousRestRole {

    String CODE = "anonymous-rest-role";

    @EntityAttributePolicy(entityClass = Pet.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = PetType.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Specialty.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = User.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityAttributePolicy(entityClass = Owner.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Visit.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Veterinarian.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Specialty.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Pet.class, actions = EntityPolicyAction.ALL)
    @EntityPolicy(entityClass = PetType.class, actions = EntityPolicyAction.ALL)
    @EntityPolicy(entityClass = Specialty.class, actions = EntityPolicyAction.ALL)
    @EntityPolicy(entityClass = User.class, actions = EntityPolicyAction.ALL)
    @EntityPolicy(entityClass = Owner.class, actions = EntityPolicyAction.ALL)
    @EntityPolicy(entityClass = Visit.class, actions = EntityPolicyAction.ALL)
    @EntityPolicy(entityClass = Veterinarian.class, actions = EntityPolicyAction.ALL)
    @EntityPolicy(entityClass = Specialty.class, actions = EntityPolicyAction.ALL)

    void country();
}
