package r45;

/* loaded from: classes5.dex */
public class qa1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public qa1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "product_meta_list", r45.kv1.class), com.tencent.mm.protobuf.i.s(3, ya.b.ITEM_LIST, r45.n30.class), com.tencent.mm.protobuf.i.n(4, "consumed_wecoin_amount"), com.tencent.mm.protobuf.i.s(5, "level_config_list", r45.s64.class), com.tencent.mm.protobuf.i.n(6, "limit_consume_wecoin"), com.tencent.mm.protobuf.i.n(7, "limit_choose_product"));
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
