package r45;

/* loaded from: classes.dex */
public class ys1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ys1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.i(5, "type"), com.tencent.mm.protobuf.i.u(6, "jump_id"), com.tencent.mm.protobuf.i.a(7, "jump_info_buffer"), com.tencent.mm.protobuf.i.u(8, "ec_source"), com.tencent.mm.protobuf.i.u(9, "finder_username"), com.tencent.mm.protobuf.i.a(10, "live_cookies"), com.tencent.mm.protobuf.i.a(101, "ux_info"), com.tencent.mm.protobuf.i.a(102, "session_buffer"), com.tencent.mm.protobuf.i.i(103, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
