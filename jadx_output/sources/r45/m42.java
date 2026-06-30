package r45;

/* loaded from: classes2.dex */
public class m42 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public m42() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.i(4, "encash_scene"), com.tencent.mm.protobuf.i.u(5, "request_id"), com.tencent.mm.protobuf.i.n(6, "amount"), com.tencent.mm.protobuf.i.i(7, "biz_type"), com.tencent.mm.protobuf.i.u(8, "biz_acct_id"), com.tencent.mm.protobuf.i.u(101, "report_session_id"));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
