package r45;

/* loaded from: classes.dex */
public class e71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public e71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.u(5, "object_nonce_id"), com.tencent.mm.protobuf.i.u(6, "finder_username"), com.tencent.mm.protobuf.i.a(7, "live_cookies"), com.tencent.mm.protobuf.i.i(8, "indicator_type"), com.tencent.mm.protobuf.i.u(9, "mic_vroom_id"), com.tencent.mm.protobuf.i.i(10, "battle_scene"));
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
