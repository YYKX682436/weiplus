package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class dl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.el f160953d;

    public dl(com.tencent.mm.plugin.setting.ui.setting.el elVar) {
        this.f160953d = elVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.el elVar = this.f160953d;
        ((android.app.Dialog) elVar.f161002d.getTag()).dismiss();
        com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI settingsPrivacyUI = elVar.f161003e;
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI.f160610y;
        settingsPrivacyUI.Z6();
    }
}
