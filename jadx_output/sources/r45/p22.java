package r45;

/* loaded from: classes.dex */
public class p22 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public p22() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.a(4, "live_cookies"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.n(6, "live_id"), com.tencent.mm.protobuf.i.u(7, "target_finder_username"), com.tencent.mm.protobuf.i.a(8, "random_pk_buffer"), com.tencent.mm.protobuf.i.i(9, "apply_scene"), com.tencent.mm.protobuf.i.a(10, "scene_buffer"), com.tencent.mm.protobuf.i.u(11, "refer_mic_candidate_request_id"));
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
