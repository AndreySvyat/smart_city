package ru.krd.smc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "city_case")
@NoArgsConstructor
public class CityCase {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;

	private String location;
	private String description;

	@ElementCollection
	@CollectionTable(name = "files", joinColumns = @JoinColumn(name = "city_case_id"))
	@Column(name = "file_link")
	private List<String> files;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private User author;
}
