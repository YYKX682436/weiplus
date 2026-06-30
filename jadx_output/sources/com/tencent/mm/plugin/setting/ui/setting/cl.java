package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class cl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f160920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI f160921e;

    public cl(com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI settingsPrivacyUI, int i17) {
        this.f160921e = settingsPrivacyUI;
        this.f160920d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI settingsPrivacyUI = this.f160921e;
        android.view.View x17 = ((com.tencent.mm.ui.base.preference.b) settingsPrivacyUI.f160611g).x(this.f160920d, settingsPrivacyUI.getListView());
        if (x17 != null) {
            zg5.a.a(settingsPrivacyUI.getContext(), x17);
        }
    }
}
