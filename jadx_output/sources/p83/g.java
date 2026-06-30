package p83;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352747d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zr3 f352748e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352749f;

    public g(int i17) {
        this.f352747d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yr3();
        lVar.f70665b = new r45.zr3();
        lVar.f70667d = 257;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getwechatoutcoupons";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352747d = a17;
        r45.yr3 yr3Var = (r45.yr3) a17.f70710a.f70684a;
        yr3Var.f391321d = i17;
        yr3Var.f391322e = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_REDDOT_RECHARGE_VERSION_INT, 0)).intValue();
        yr3Var.f391323f = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_TYPE_VERSION_INT, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "NetSceneIPCallGetWeChatOutCoupons Scene:%d, RechargeWordingVersion:%d,AccountActivityWordingVersion:%d", java.lang.Integer.valueOf(yr3Var.f391321d), java.lang.Integer.valueOf(yr3Var.f391322e), java.lang.Integer.valueOf(yr3Var.f391323f));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352749f = u0Var;
        return dispatch(sVar, this.f352747d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 257;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.zr3 zr3Var = (r45.zr3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f352748e = zr3Var;
        if ((i18 == 0 || i19 == 0) && i18 == 0 && i19 == 0 && zr3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallUtil", "[royle]begin save response,Balance:%s,PVWording:%s,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,SmsDesc:%s,PackageMsg:%s", zr3Var.f392323m, zr3Var.f392324n, zr3Var.f392317d, zr3Var.f392318e, zr3Var.f392319f, zr3Var.f392320g, zr3Var.f392321h, zr3Var.f392322i, zr3Var.f392325o, zr3Var.f392331u);
            try {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IPCALL_ACCOUNT_CACHE_STRING, com.tencent.mm.sdk.platformtools.t8.l(zr3Var.toByteArray()));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallUtil", "[royle]save exception:%s", e17.getMessage());
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f352749f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
