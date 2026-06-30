package r45;

/* loaded from: classes.dex */
public class jg1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public jg1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "promote_info_list", r45.z42.class), com.tencent.mm.protobuf.i.s(3, "available_items", r45.a52.class), com.tencent.mm.protobuf.i.i(4, "promotion_valid_time"), com.tencent.mm.protobuf.i.r(5, "promotion_jump_info", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class));
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
