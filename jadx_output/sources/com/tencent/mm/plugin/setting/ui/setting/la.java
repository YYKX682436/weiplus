package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class la implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI f161288d;

    public la(com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI) {
        this.f161288d = settingsDelAuthUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI = this.f161288d;
        g4Var.d(1, settingsDelAuthUI.getResources().getColor(com.tencent.mm.R.color.f479482a31), settingsDelAuthUI.getResources().getString(com.tencent.mm.R.string.ipd));
    }
}
