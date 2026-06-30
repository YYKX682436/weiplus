package r45;

/* loaded from: classes.dex */
public class yb2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public yb2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "anchor_finderusername"), com.tencent.mm.protobuf.i.u(4, "finder_username"), com.tencent.mm.protobuf.i.a(5, "live_cookies"), com.tencent.mm.protobuf.i.n(6, "object_id"), com.tencent.mm.protobuf.i.n(7, "live_id"), com.tencent.mm.protobuf.i.s(8, "sync_req_list", r45.hj6.class), com.tencent.mm.protobuf.i.u(9, "object_nonce_id"), com.tencent.mm.protobuf.i.a(10, "ux_info"), com.tencent.mm.protobuf.i.u(11, "ec_source"), com.tencent.mm.protobuf.i.r(12, "client_status", r45.rn1.class), com.tencent.mm.protobuf.i.a(13, "last_buffer"));
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
