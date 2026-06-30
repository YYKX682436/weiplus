package r45;

/* loaded from: classes5.dex */
public class ft1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ft1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "product_liteapp", r45.k74.class), com.tencent.mm.protobuf.i.l(3, "lottery_attend_type_list"), com.tencent.mm.protobuf.i.r(4, "prize_data", r45.vc5.class), com.tencent.mm.protobuf.i.s(5, "winner_cnt_limit_infos", r45.ae4.class));
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
