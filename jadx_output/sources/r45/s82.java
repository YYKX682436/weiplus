package r45;

/* loaded from: classes5.dex */
public class s82 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public s82() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "game_user_info", r45.c73.class), com.tencent.mm.protobuf.i.c(3, "has_next"), com.tencent.mm.protobuf.i.u(4, "next_offset"));
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
