package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class f implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xv f157695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI f157696b;

    public f(com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI, r45.xv xvVar) {
        this.f157696b = f2FAppBrandRemittanceUI;
        this.f157695a = xvVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI = this.f157696b;
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "go to remittaneUI，appid：%s", f2FAppBrandRemittanceUI.f157089d);
        f2FAppBrandRemittanceUI.f157095m.alive();
        nr4.a aVar = new nr4.a();
        aVar.f339339a = f2FAppBrandRemittanceUI.f157089d;
        h45.a0.i(f2FAppBrandRemittanceUI.getContext(), 1, this.f157695a.f390468g, 56, aVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19821, 2, f2FAppBrandRemittanceUI.f157089d, 0);
    }
}
