package org.springframework.samples.petclinic.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object representing an question.
 *
 * @author Mike Wang
 */
@Entity
@Table(name = "question")
public class Question extends BaseEntity{

    @Column(name = "content")
    @NotEmpty
    private String address;

}
