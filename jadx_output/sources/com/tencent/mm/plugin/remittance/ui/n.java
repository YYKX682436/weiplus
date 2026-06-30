package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class n implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI f157826a;

    public n(com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI) {
        this.f157826a = personalPayRemittanceUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "click pay button");
        com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI = this.f157826a;
        personalPayRemittanceUI.f157114s.alive();
        personalPayRemittanceUI.addSceneEndListener(4304);
        personalPayRemittanceUI.doSceneProgress(new com.tencent.mm.plugin.remittance.model.g0(personalPayRemittanceUI.f157102d, personalPayRemittanceUI.f157103e, personalPayRemittanceUI.f157104f), false);
        personalPayRemittanceUI.showLoading();
        com.tencent.mm.ui.widget.dialog.z2 z2Var = personalPayRemittanceUI.f157111p;
        if (z2Var != null) {
            personalPayRemittanceUI.f157113r = false;
            z2Var.B();
            personalPayRemittanceUI.f157111p = null;
        }
    }
}
