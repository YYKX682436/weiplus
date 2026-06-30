package dd;

/* loaded from: classes9.dex */
public final class x implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dd.y f228898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ss4.v f228899f;

    public x(yz5.p pVar, dd.y yVar, ss4.v vVar) {
        this.f228897d = pVar;
        this.f228898e = yVar;
        this.f228899f = vVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "[changeWalletAreaFromMainlandToHK] onSceneEnd");
        if (m1Var instanceof ss4.v) {
            yz5.p pVar = this.f228897d;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "NetSceneSetUserWallet response fail, callback fail");
                if (pVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("errmsg", "fail");
                    pVar.invoke(jSONObject, java.lang.Boolean.FALSE);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "NetSceneSetUserWallet response succ");
            gm0.j1.u().c().w(339975, 4);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 8);
            c01.je.m(8);
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.d.f();
            dd.y yVar = this.f228898e;
            int i19 = yVar.f228900a;
            dd.v[] vVarArr = dd.v.f228895d;
            if (i19 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "[changeWalletAreaFromMainlandToHK] notify mainland offline, open hk offline");
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                create.putString("func_name", "OfflineUIPageShouldDismiss");
                ((h45.q) i95.n0.c(h45.q.class)).notifyAllUseCase(create);
                com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                create2.putBool("jump_from_mainland_offline", true);
                create2.putString("succ_liteapp_open_info", yVar.f228901b);
                com.tencent.kinda.framework.boot.KindaApp.appKinda().startUseCase("hkoffline", create2, dd.w.f228896a);
            }
            if (pVar != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.putOpt("errmsg", "ok");
                pVar.invoke(jSONObject2, java.lang.Boolean.FALSE);
            }
        }
        gm0.j1.d().q(this.f228899f.getType(), this);
    }
}
