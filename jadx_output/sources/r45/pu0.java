package r45;

/* loaded from: classes.dex */
public class pu0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public pu0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "anchor_finder_username"), com.tencent.mm.protobuf.i.i(4, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(5, "op_type"), com.tencent.mm.protobuf.i.i(6, "inner_scene"), com.tencent.mm.protobuf.i.n(7, "object_id"), com.tencent.mm.protobuf.i.c(8, "is_follow_and_reserve"), com.tencent.mm.protobuf.i.n(9, "live_id"), com.tencent.mm.protobuf.i.u(10, "my_finder_username"));
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
