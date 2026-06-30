package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class dm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.em f160954d;

    public dm(com.tencent.mm.plugin.setting.ui.setting.em emVar) {
        this.f160954d = emVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.em emVar = this.f160954d;
        ((android.app.Dialog) emVar.f161004d.getTag()).dismiss();
        com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI = emVar.f161005e;
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI.f160666v;
        settingsSnsPrivacyUI.W6();
    }
}
