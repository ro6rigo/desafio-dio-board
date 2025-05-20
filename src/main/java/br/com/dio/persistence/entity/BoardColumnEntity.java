package br.com.dio.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class BoardColumnEntity {
    private Long id;
    private String name;
    private int order;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BoardColumnKindEnum kind;

    public List<CardEntity> getCards() {
        return cards;
    }

    public void setCards(List<CardEntity> cards) {
        this.cards = cards;
    }

    private List<CardEntity> cards = new ArrayList<>();

    public BoardEntity getBoard() {
        return board;
    }

    public void setBoard(BoardEntity board) {
        this.board = board;
    }

    private BoardEntity board = new BoardEntity();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public BoardColumnKindEnum getKind() {
        return kind;
    }

    public void setKind(BoardColumnKindEnum kind) {
        this.kind = kind;
    }
}
