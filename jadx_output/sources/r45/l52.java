package r45;

/* loaded from: classes.dex */
public class l52 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public l52() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseReq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "live_cookies"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.u(6, "object_nonce_id"), com.tencent.mm.protobuf.i.u(7, "finder_username"), com.tencent.mm.protobuf.i.u(8, "request_id"), com.tencent.mm.protobuf.i.i(9, "op_type"), com.tencent.mm.protobuf.i.r(10, "msg", r45.ch1.class), com.tencent.mm.protobuf.i.u(11, "session_id"), com.tencent.mm.protobuf.i.i(12, "markup_wecoin_count"), com.tencent.mm.protobuf.i.i(13, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 15675;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivepurchaseapplymic";
        lVar.f70664a = this;
        lVar.f70665b = new r45.m52();
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
