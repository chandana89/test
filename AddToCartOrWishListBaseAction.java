package com.konakart.actions;

public class AddToCartOrWishListBaseAction extends BaseAction{
  protected int prodId=-1;
  public int getProdId(){
    prodId=100;
    return prodId;
  }

  public void setProdId(int prodId){
    this.prodId=prodId;
  }
  public void addToCart(){
   //commenting
     int num=90;
    if(num){
      num=0;
    }
    else{
      num=10;
    }
  }
}
