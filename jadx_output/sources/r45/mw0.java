package r45;

/* loaded from: classes.dex */
public class mw0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public mw0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.r(3, "status", r45.dx0.class), com.tencent.mm.protobuf.i.i(4, "tab_type"), com.tencent.mm.protobuf.i.i(5, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.a(6, "ext_buff"), com.tencent.mm.protobuf.i.a(7, "last_buffer"), com.tencent.mm.protobuf.i.i(8, "pull_type"), com.tencent.mm.protobuf.i.u(9, "finder_username"));
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
