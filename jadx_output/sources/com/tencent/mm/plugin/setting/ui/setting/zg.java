package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class zg implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI f161828d;

    public zg(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI) {
        this.f161828d = settingsModifyAliasUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f161828d.f160528p);
    }
}
