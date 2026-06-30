package r45;

/* loaded from: classes.dex */
public class y61 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public y61() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "anchorFinderUsername"), com.tencent.mm.protobuf.i.u(4, "anchor_export_finder_username"), com.tencent.mm.protobuf.i.u(5, "by_pass_session_buffer"), com.tencent.mm.protobuf.i.r(6, "client_status", r45.rn1.class));
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
