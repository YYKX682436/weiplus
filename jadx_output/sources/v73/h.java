package v73;

/* loaded from: classes9.dex */
public class h implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f433693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433694e;

    public h(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI, int i17) {
        this.f433694e = honeyPayCardManagerUI;
        this.f433693d = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = this.f433694e;
        java.lang.String str = honeyPayCardManagerUI.f142260d;
        java.lang.String str2 = honeyPayCardManagerUI.f142260d;
        intent.toString();
        if (i17 == this.f433693d && i18 == -1 && intent.getExtras() != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(intent.getExtras().getString("card"));
                r45.n75 n75Var = new r45.n75();
                n75Var.f381134d = jSONObject.optString("bank_name");
                n75Var.f381136f = jSONObject.optString("bank_type");
                n75Var.f381137g = jSONObject.optString("bind_serial");
                n75Var.f381138h = jSONObject.optString("bind_tail");
                n75Var.f381135e = honeyPayCardManagerUI.H.f381135e;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(n75Var.f381137g)) {
                    honeyPayCardManagerUI.G = honeyPayCardManagerUI.W6(n75Var.f381137g);
                }
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = honeyPayCardManagerUI.G;
                if (bankcard != null && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_desc)) {
                    n75Var.f381134d = honeyPayCardManagerUI.G.field_desc;
                }
                honeyPayCardManagerUI.I = honeyPayCardManagerUI.H;
                honeyPayCardManagerUI.H = n75Var;
                honeyPayCardManagerUI.Y6();
                com.tencent.mars.xlog.Log.i(str2, "do modify pay way");
                r73.j jVar = new r73.j(honeyPayCardManagerUI.H, honeyPayCardManagerUI.M, honeyPayCardManagerUI.L);
                jVar.K(honeyPayCardManagerUI);
                honeyPayCardManagerUI.doSceneProgress(jVar, false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str2, e17, "", new java.lang.Object[0]);
            }
        }
    }
}
