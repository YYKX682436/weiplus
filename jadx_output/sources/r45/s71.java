package r45;

/* loaded from: classes.dex */
public class s71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public s71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.u(4, "finder_username"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.u(6, "object_nonce_id"), com.tencent.mm.protobuf.i.i(7, "offset_in_second"), com.tencent.mm.protobuf.i.c(8, "is_continual_request"), com.tencent.mm.protobuf.i.i(9, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.a(10, "last_buffer"), com.tencent.mm.protobuf.i.u(11, "highlight_id"));
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
