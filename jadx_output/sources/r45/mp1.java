package r45;

/* loaded from: classes.dex */
public class mp1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public mp1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.u(4, "object_nonce_id"), com.tencent.mm.protobuf.i.g(5, "longitude"), com.tencent.mm.protobuf.i.g(6, "latitude"), com.tencent.mm.protobuf.i.u(7, "session_buffer"), com.tencent.mm.protobuf.i.a(8, "live_cookies"), com.tencent.mm.protobuf.i.r(9, "status", r45.dx0.class), com.tencent.mm.protobuf.i.r(10, "live_status", r45.rn1.class), com.tencent.mm.protobuf.i.r(11, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.a(12, "last_buffer"));
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
