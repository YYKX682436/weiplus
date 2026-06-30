package r45;

/* loaded from: classes2.dex */
public class yr1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public yr1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.a(6, "live_cookies"), com.tencent.mm.protobuf.i.u(7, "notice_id"), com.tencent.mm.protobuf.i.i(8, "op_scene"), com.tencent.mm.protobuf.i.u(9, "finder_username"), com.tencent.mm.protobuf.i.c(10, "need_page_item"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 10635;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetconcertticket";
        lVar.f70664a = this;
        lVar.f70665b = new r45.zr1();
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
