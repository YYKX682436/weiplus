package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class da implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI f160938d;

    public da(com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI) {
        this.f160938d = settingsCreateAliasUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        gm0.j1.d().q(255, this.f160938d.f160380p);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.setting.ui.setting.ca(this, m1Var, i18, i17));
    }
}
