package r45;

/* loaded from: classes.dex */
public class h91 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public h91() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "objects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.u(3, "last_buffer"), com.tencent.mm.protobuf.i.i(4, "continue_flag"), com.tencent.mm.protobuf.i.i(6, "recent_n_days"), com.tencent.mm.protobuf.i.s(7, "items", r45.oo2.class));
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
