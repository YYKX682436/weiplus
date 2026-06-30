package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class q9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161468d;

    public q9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161468d = settingsCareModeIntro;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161468d;
        g4Var.d(settingsCareModeIntro.C, settingsCareModeIntro.getResources().getColor(com.tencent.mm.R.color.f478532ac), settingsCareModeIntro.getContext().getString(com.tencent.mm.R.string.lsj));
    }
}
