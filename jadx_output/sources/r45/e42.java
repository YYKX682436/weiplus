package r45;

/* loaded from: classes.dex */
public class e42 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public e42() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.g(4, "longitude"), com.tencent.mm.protobuf.i.g(5, "latitude"), com.tencent.mm.protobuf.i.r(6, "status", r45.dx0.class), com.tencent.mm.protobuf.i.r(7, "live_status", r45.rn1.class), com.tencent.mm.protobuf.i.i(8, "pull_type"), com.tencent.mm.protobuf.i.u(9, "theme_id"), com.tencent.mm.protobuf.i.r(10, "random_live_context", r45.r85.class));
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
