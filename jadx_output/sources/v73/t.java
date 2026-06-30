package v73;

/* loaded from: classes9.dex */
public class t implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.d f433744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI f433745b;

    public t(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI, r73.d dVar) {
        this.f433745b = honeyPayCheckPwdUI;
        this.f433744a = dVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.di4 di4Var = this.f433744a.f393167r.f390993g;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI = this.f433745b;
        if (di4Var != null) {
            db5.e1.C(honeyPayCheckPwdUI, di4Var.f372508d, "", di4Var.f372510f, di4Var.f372509e, false, new v73.s(this), null);
            honeyPayCheckPwdUI.hideProgress();
        } else {
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = honeyPayCheckPwdUI.f142305f;
            if (editHintPasswdView != null) {
                editHintPasswdView.a();
            }
            honeyPayCheckPwdUI.hideProgress();
        }
    }
}
