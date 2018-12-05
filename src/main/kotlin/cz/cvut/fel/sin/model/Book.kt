package cz.cvut.fel.sin.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "book")
data class Book (
    @Id
    val id: Int
)
