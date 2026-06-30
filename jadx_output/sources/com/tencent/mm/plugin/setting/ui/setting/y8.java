package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class y8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.e9 f161779d;

    public y8(com.tencent.mm.plugin.setting.ui.setting.e9 e9Var) {
        this.f161779d = e9Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.e9 e9Var = this.f161779d;
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = e9Var.f160988d;
        g4Var.d(settingsCareModeIntro.B, settingsCareModeIntro.getResources().getColor(com.tencent.mm.R.color.f478532ac), e9Var.f160988d.getContext().getString(com.tencent.mm.R.string.awg));
    }
}
