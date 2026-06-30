package r45;

/* loaded from: classes.dex */
public class n22 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public n22() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "live_cookies"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.u(6, "object_nonce_id"), com.tencent.mm.protobuf.i.u(7, "finder_username"), com.tencent.mm.protobuf.i.u(8, "refer_mic_session_id"), com.tencent.mm.protobuf.i.i(9, "battle_mode"), com.tencent.mm.protobuf.i.s(10, "battle_teams", r45.r22.class), com.tencent.mm.protobuf.i.u(11, "vroom_id"), com.tencent.mm.protobuf.i.u(12, "request_id"), com.tencent.mm.protobuf.i.i(13, "indicator_type"), com.tencent.mm.protobuf.i.a(14, "indicator_parameter"), com.tencent.mm.protobuf.i.i(15, "battle_scope"), com.tencent.mm.protobuf.i.i(16, "battle_duration"), com.tencent.mm.protobuf.i.i(17, "battle_layout"));
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
