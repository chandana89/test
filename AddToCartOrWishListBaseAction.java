package com.konakart.actions;

public class AddToCartOrWishListBaseAction extends BaseAction{
  protected int prodId=-1;
  public int getProdId(){
    //get
    return prodId;
  }

  public void setProdId(int prodId){
    //comment added1234
    this.prodId=prodId;
  }
}
