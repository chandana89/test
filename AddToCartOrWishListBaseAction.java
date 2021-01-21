package com.konakart.actions;

public class AddToCartOrWishListBaseAction extends BaseAction{
  protected int prodId=-1;
  public int getProdId(){
    //get
    //comment added
    prodId=100;
    return prodId;
  }

  public void setProdId(int prodId){
    this.prodId=prodId;
  }
  public void master(){
     int num=90;
  }
}
