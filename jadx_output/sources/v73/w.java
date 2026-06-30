package v73;

/* loaded from: classes9.dex */
public class w implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI f433750a;

    public w(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI) {
        this.f433750a = honeyPayCheckPwdUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI = this.f433750a;
            int i17 = honeyPayCheckPwdUI.f142313q;
            if (i17 == 1) {
                honeyPayCheckPwdUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do get create token sign");
                honeyPayCheckPwdUI.showSafeProgress();
                r73.d dVar = new r73.d(honeyPayCheckPwdUI.f142309m, honeyPayCheckPwdUI.f142312p);
                dVar.K(honeyPayCheckPwdUI);
                honeyPayCheckPwdUI.doSceneProgress(dVar, false);
            } else if (i17 == 2) {
                com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.V6(honeyPayCheckPwdUI);
            } else if (i17 == 3) {
                com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.V6(honeyPayCheckPwdUI);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayCheckPwdUI", "unknown scene: %s", java.lang.Integer.valueOf(i17));
            }
            honeyPayCheckPwdUI.hideTenpayKB();
        }
    }
}
