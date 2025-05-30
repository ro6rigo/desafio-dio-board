package br.com.dio.persistence.entity;

import lombok.Data;

import static br.com.dio.persistence.entity.BoardColumnKindEnum.INITIAL;

@Data
public class CardEntity {
    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();

    public BoardColumnEntity getBoardColumn() {
        return boardColumn;
    }

    public void setBoardColumn(BoardColumnEntity boardColumn) {
        this.boardColumn = boardColumn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
