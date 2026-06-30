package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI f144993d;

    public d(com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI) {
        this.f144993d = loginAsExDeviceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI = this.f144993d;
        android.content.Intent b17 = y7Var.b(loginAsExDeviceUI);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI2 = this.f144993d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loginAsExDeviceUI2, arrayList.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginAsExDeviceUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(loginAsExDeviceUI2, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginAsExDeviceUI.finish();
        loginAsExDeviceUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.J(1570L, 7L);
    }
}
