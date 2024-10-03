package Entidades;

import Anotacao.Table;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Daniel
 */

@Table(name = "tb_products")
public class Produto {

    private UUID id;
    private String nome;
    private String descricao;
    private double preco;
    private String barcode;

    public Produto() {
    }

    public Produto(String nome, String descricao, double preco, String barcode) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setBarcode(barcode);

    }

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public double getPreco() {return preco;}

    public void setPreco(double preco) {this.preco = preco;}

    public String getBarcode() {return barcode;}

    public void setBarcode(String barcode) {this.barcode = barcode;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(id, produto.id) && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao) && Objects.equals(barcode, produto.barcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, preco, barcode);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", barcode='" + barcode + '\'' +
                '}';
    }
}






