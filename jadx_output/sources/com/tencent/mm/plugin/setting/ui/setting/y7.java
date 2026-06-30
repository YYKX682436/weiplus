package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public final class y7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161778d;

    public y7(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161778d = settingsAuthUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161778d;
        g4Var.d(1, settingsAuthUI.getResources().getColor(com.tencent.mm.R.color.f479482a31), settingsAuthUI.getResources().getString(com.tencent.mm.R.string.ipd));
    }
}
