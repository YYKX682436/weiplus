package r45;

/* loaded from: classes.dex */
public class gr1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public gr1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, "source_type"), com.tencent.mm.protobuf.i.i(4, "live_identity"), com.tencent.mm.protobuf.i.u(5, "to_username"), com.tencent.mm.protobuf.i.u(6, "anchor_finder_username"), com.tencent.mm.protobuf.i.a(7, "live_cookies"), com.tencent.mm.protobuf.i.n(8, "live_id"), com.tencent.mm.protobuf.i.n(9, "object_id"));
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
