package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class cm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f160922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI f160923e;

    public cm(com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI, int i17) {
        this.f160923e = settingsSnsPrivacyUI;
        this.f160922d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI = this.f160923e;
        android.view.View x17 = ((com.tencent.mm.ui.base.preference.b) settingsSnsPrivacyUI.f160667d).x(this.f160922d, settingsSnsPrivacyUI.getListView());
        if (x17 != null) {
            zg5.a.a(settingsSnsPrivacyUI.getContext(), x17);
        }
    }
}
