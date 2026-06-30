package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class ha implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI f161101d;

    public ha(com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI) {
        this.f161101d = settingsDelAuthUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI = this.f161101d;
        settingsDelAuthUI.setResult(-1);
        settingsDelAuthUI.finish();
    }
}
