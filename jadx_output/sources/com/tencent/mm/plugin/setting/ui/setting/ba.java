package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class ba implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI f160864d;

    public ba(com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI) {
        this.f160864d = settingsCreateAliasUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI = this.f160864d;
        if (settingsCreateAliasUI.f160373f != null) {
            gm0.j1.d().d(settingsCreateAliasUI.f160373f);
        }
    }
}
