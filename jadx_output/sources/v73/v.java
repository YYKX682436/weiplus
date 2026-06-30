package v73;

/* loaded from: classes9.dex */
public class v implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.d f433748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI f433749b;

    public v(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI, r73.d dVar) {
        this.f433749b = honeyPayCheckPwdUI;
        this.f433748a = dVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.yd3 yd3Var = this.f433748a.f393167r;
        r45.an6 an6Var = yd3Var.f390992f;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI = this.f433749b;
        honeyPayCheckPwdUI.f142314r = an6Var;
        r45.di4 di4Var = yd3Var.f390993g;
        if (di4Var == null) {
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.V6(honeyPayCheckPwdUI);
            return;
        }
        db5.e1.C(honeyPayCheckPwdUI, di4Var.f372508d, "", di4Var.f372510f, di4Var.f372509e, false, new v73.u(this), null);
        honeyPayCheckPwdUI.hideProgress();
    }
}
