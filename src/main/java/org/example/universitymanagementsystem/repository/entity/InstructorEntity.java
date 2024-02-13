package org.example.universitymanagementsystem.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "instructor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstructorEntity {
    @Id
    private Long id;
    private String name;
    private String experience;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant modifiedAt;
}
