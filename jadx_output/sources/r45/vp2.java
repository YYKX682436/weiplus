package r45;

/* loaded from: classes5.dex */
public class vp2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public vp2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "liveCookies"), com.tencent.mm.protobuf.i.r(4, "msg", r45.t12.class), com.tencent.mm.protobuf.i.n(5, "liveId"), com.tencent.mm.protobuf.i.u(6, "clientMsgId"), com.tencent.mm.protobuf.i.n(7, "objectId"), com.tencent.mm.protobuf.i.u(8, "object_nonce_id"), com.tencent.mm.protobuf.i.u(9, "finder_username"), com.tencent.mm.protobuf.i.r(10, "report_info", r45.up2.class), com.tencent.mm.protobuf.i.r(11, "live_report_base_info", r45.o72.class));
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
