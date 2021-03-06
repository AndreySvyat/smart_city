package ru.krd.smc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import ru.krd.smc.model.enums.UserType;

import javax.persistence.*;

import java.io.Serializable;
import java.util.UUID;

import static javax.persistence.EnumType.STRING;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "app_user")
@NoArgsConstructor
public class User implements Serializable {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;

	@Enumerated(STRING)
	private UserType type;

	private String login;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
}
