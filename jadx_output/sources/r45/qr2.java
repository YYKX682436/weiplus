package r45;

/* loaded from: classes.dex */
public class qr2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public qr2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.a(4, "last_buffer"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.g(6, "longitude"), com.tencent.mm.protobuf.i.g(7, "latitude"), com.tencent.mm.protobuf.i.i(8, "pull_type"), com.tencent.mm.protobuf.i.i(9, "display_tab_type"), com.tencent.mm.protobuf.i.r(10, "status", r45.dx0.class), com.tencent.mm.protobuf.i.r(11, "finder_native_drama_context", r45.pr2.class));
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
