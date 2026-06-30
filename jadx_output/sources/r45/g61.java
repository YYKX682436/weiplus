package r45;

/* loaded from: classes.dex */
public class g61 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public g61() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "help_promotion_infos", r45.eb1.class), com.tencent.mm.protobuf.i.u(3, "last_buff"), com.tencent.mm.protobuf.i.c(4, "continue_flag"), com.tencent.mm.protobuf.i.i(5, "total_count"));
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
