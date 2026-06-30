package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes12.dex */
public class f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI f144995d;

    public f(com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI) {
        this.f144995d = loginAsExDeviceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.f144970y;
        com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI = this.f144995d;
        loginAsExDeviceUI.getClass();
        com.tencent.mm.app.w7.b(-1);
        loginAsExDeviceUI.finish();
        loginAsExDeviceUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477830co);
        return true;
    }
}
