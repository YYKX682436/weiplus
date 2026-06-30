package r45;

/* loaded from: classes.dex */
public class m04 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public m04() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "retcode"), com.tencent.mm.protobuf.i.u(3, "retmsg"), com.tencent.mm.protobuf.i.r(4, "client_comm_resp", r45.f40.class), com.tencent.mm.protobuf.i.r(5, "risk_aggr_resp_info", r45.it5.class), com.tencent.mm.protobuf.i.u(6, "context"));
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
