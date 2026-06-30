package v73;

/* loaded from: classes8.dex */
public class m1 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.b f433713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI f433714b;

    public m1(com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI, r73.b bVar) {
        this.f433714b = honeyPaySelectCardTypeUI;
        this.f433713a = bVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r73.b bVar = this.f433713a;
        try {
            r45.tw4 tw4Var = bVar.f393164r.f369628o;
            java.lang.String encodeToString = tw4Var != null ? android.util.Base64.encodeToString(tw4Var.toByteArray(), 2) : "";
            com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI = this.f433714b;
            r45.a10 a10Var = bVar.f393164r;
            com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI.V6(honeyPaySelectCardTypeUI, a10Var.f369623g, a10Var.f369622f, a10Var.f369624h, a10Var.f369625i, bVar.f393165s, a10Var.f369626m, a10Var.f369627n, encodeToString);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HoneyPaySelectCardTypeUI", e17, "", new java.lang.Object[0]);
        }
    }
}
