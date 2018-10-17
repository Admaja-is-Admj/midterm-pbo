/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author dhanifudin
 */
public class Transaction {
        private Item item;
        private DiscountItem discountItem;
        private PromoItem promoItem;

    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
        
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|"+item.nama+"\t\t|"+item.price+"\t|"+item.amount+"\t|"+item.getTotalPrice()+"\t|");
		System.out.println("|"+discountItem.nama+"\t\t|"+discountItem.price+"\t|"+discountItem.amount+"\t|"+discountItem.total()+"\t|");
                System.out.println("|"+discountItem+"\t\t| \t\t| \t\t| \t\t|");
                System.out.println("|"+promoItem.nama+"\t\t|"+promoItem.price+"\t|"+promoItem.amount+"\t|"+promoItem.total()+"\t|");
		System.out.println("|"+promoItem+"\t\t| \t\t| \t\t| \t\t|");
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
