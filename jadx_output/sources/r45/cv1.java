package r45;

/* loaded from: classes.dex */
public class cv1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public cv1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.a(5, "live_cookies"), com.tencent.mm.protobuf.i.u(6, "anchor_finder_username"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(8, "finder_username"), com.tencent.mm.protobuf.i.u(9, "shop_request_id"), com.tencent.mm.protobuf.i.u(10, "stock_id"), com.tencent.mm.protobuf.i.i(11, "pull_scene"), com.tencent.mm.protobuf.i.a(12, "ux_info"), com.tencent.mm.protobuf.i.n(13, "spu_id"), com.tencent.mm.protobuf.i.i(14, "product_type"), com.tencent.mm.protobuf.i.a(15, "product_ext_info"), com.tencent.mm.protobuf.i.u(16, "ec_source"), com.tencent.mm.protobuf.i.u(20, "live_room_buffer"), com.tencent.mm.protobuf.i.a(100, "last_buffer"), com.tencent.mm.protobuf.i.n(102, "feature_version"), com.tencent.mm.protobuf.i.n(103, "test_feature_version"));
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
