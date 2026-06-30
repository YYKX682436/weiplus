package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class p4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173105d;

    public p4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173105d = settingsTeenModeMain;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = this.f173105d;
        g4Var.d(0, settingsTeenModeMain.getResources().getColor(com.tencent.mm.R.color.a2y), settingsTeenModeMain.getString(com.tencent.mm.R.string.jrj));
    }
}
