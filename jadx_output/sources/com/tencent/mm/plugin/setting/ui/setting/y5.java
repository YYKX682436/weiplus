package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class y5 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161776d;

    public y5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161776d = settingsAboutMicroMsgUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.setting.ui.setting.x5(this, m1Var, i18, i17));
    }
}
