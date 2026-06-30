package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI f144991d;

    public a(com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI) {
        this.f144991d = loginAsExDeviceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI = this.f144991d;
        gm0.j1.d().g(new bb3.a(loginAsExDeviceUI.f144982r, loginAsExDeviceUI.f144983s));
    }
}
