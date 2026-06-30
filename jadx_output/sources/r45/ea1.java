package r45;

/* loaded from: classes.dex */
public class ea1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ea1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "product_info", r45.y23.class), com.tencent.mm.protobuf.i.i(3, "is_product_in_living_room"), com.tencent.mm.protobuf.i.i(4, "is_living"), com.tencent.mm.protobuf.i.u(5, "tag_url"), com.tencent.mm.protobuf.i.u(6, "shop_logo_url"), com.tencent.mm.protobuf.i.u(7, "living_finder_username"));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
