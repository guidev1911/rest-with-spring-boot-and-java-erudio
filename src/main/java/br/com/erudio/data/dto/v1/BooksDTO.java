package br.com.erudio.data.dto.v1;

import org.springframework.hateoas.RepresentationModel;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class BooksDTO extends RepresentationModel<BooksDTO> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String author;
    private Date launchDate;
    private Double price;
    private String title;
    public BooksDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BooksDTO booksDTO = (BooksDTO) o;
        return Objects.equals(getId(), booksDTO.getId()) && Objects.equals(getAuthor(), booksDTO.getAuthor()) && Objects.equals(getLaunchDate(), booksDTO.getLaunchDate()) && Objects.equals(getPrice(), booksDTO.getPrice()) && Objects.equals(getTitle(), booksDTO.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getAuthor(), getLaunchDate(), getPrice(), getTitle());
    }
}
