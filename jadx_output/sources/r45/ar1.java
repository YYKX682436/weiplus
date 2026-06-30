package r45;

/* loaded from: classes.dex */
public class ar1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ar1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(4, "result"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.n(6, "live_id"), com.tencent.mm.protobuf.i.u(7, "game_appid"));
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
