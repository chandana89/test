public class AddToCartOrWishListBaseAction extends BaseAction{
  protected int prodId=-1
  public int getProdId(){
    return prodId;
  }

  public void setProdId(int prodId){
    //set
    this.prodId=prodId;
  }
}
