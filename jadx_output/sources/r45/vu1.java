package r45;

/* loaded from: classes.dex */
public class vu1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public vu1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "wish_list", r45.z94.class), com.tencent.mm.protobuf.i.n(3, "total_target_count"), com.tencent.mm.protobuf.i.n(4, "total_cur_count"), com.tencent.mm.protobuf.i.c(5, "is_achieved"), com.tencent.mm.protobuf.i.c(6, "is_active"), com.tencent.mm.protobuf.i.u(7, "wish_list_id"), com.tencent.mm.protobuf.i.s(8, "recommend_wish_list", r45.z94.class), com.tencent.mm.protobuf.i.c(9, "has_valid_recommend_wish"));
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
