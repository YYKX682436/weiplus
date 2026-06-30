package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class vo implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161676d;

    public vo(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161676d = settingsUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.setting.ui.setting.uo(this, m1Var, i18, i17));
    }
}
