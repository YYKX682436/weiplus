package r45;

/* loaded from: classes5.dex */
public class av1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public av1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.u(5, "object_nonce_id"), com.tencent.mm.protobuf.i.n(6, "product_id"), com.tencent.mm.protobuf.i.u(7, "shop_request_id"), com.tencent.mm.protobuf.i.a(8, "ux_info"), com.tencent.mm.protobuf.i.u(9, "ec_source"), com.tencent.mm.protobuf.i.a(10, "live_cookies"), com.tencent.mm.protobuf.i.i(11, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(12, "req_scene"), com.tencent.mm.protobuf.i.u(13, "entrance_report_info"), com.tencent.mm.protobuf.i.u(14, "item_session_buff"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6211;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetshopproductdetail";
        lVar.f70664a = this;
        lVar.f70665b = new r45.bv1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
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
