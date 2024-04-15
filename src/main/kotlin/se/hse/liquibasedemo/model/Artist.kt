package se.hse.liquibasedemo.model

import jakarta.persistence.*

@Entity
data class Artist (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @Column(nullable = false)
    private val name: String,

    @Column(nullable = false)
    private val country: String,

    @Column(name = "test", nullable = false)
    private val test: String

)