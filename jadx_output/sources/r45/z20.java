package r45;

/* loaded from: classes.dex */
public class z20 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public z20() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "check_result"), com.tencent.mm.protobuf.i.u(3, "check_result_text"));
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
