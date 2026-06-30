package r45;

/* loaded from: classes.dex */
public class h42 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public h42() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "live_cookies"), com.tencent.mm.protobuf.i.r(4, "msg", r45.ch1.class), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.n(6, "object_id"), com.tencent.mm.protobuf.i.u(7, "object_nonce_id"), com.tencent.mm.protobuf.i.u(8, "session_id"), com.tencent.mm.protobuf.i.u(9, "anchor_finder_username"), com.tencent.mm.protobuf.i.r(10, "to_contact", r45.xn1.class));
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
