package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.k6 f161183d;

    public j6(com.tencent.mm.plugin.setting.ui.setting.k6 k6Var) {
        this.f161183d = k6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.k6 k6Var = this.f161183d;
        ((android.app.Dialog) k6Var.f161224d.getTag()).dismiss();
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI = k6Var.f161225e;
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.f160275o;
        settingsAboutSystemUI.c7();
    }
}
