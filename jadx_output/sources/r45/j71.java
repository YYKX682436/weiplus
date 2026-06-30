package r45;

/* loaded from: classes.dex */
public class j71 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public j71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "items", r45.mw1.class), com.tencent.mm.protobuf.i.u(3, "tips"), com.tencent.mm.protobuf.i.c(4, "is_cocert_activate"), com.tencent.mm.protobuf.i.r(5, "announcement", r45.e8.class), com.tencent.mm.protobuf.i.c(6, "use_studio_new_style"));
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
