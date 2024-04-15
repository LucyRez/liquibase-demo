package se.hse.liquibasedemo.model

import jakarta.persistence.*

@Entity
data class Song(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @Column(nullable = false)
    private val title: String,

    @ManyToOne
    private val artist: Artist
)