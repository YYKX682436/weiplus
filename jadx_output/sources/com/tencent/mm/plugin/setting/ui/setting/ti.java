package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class ti implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.d0 f161579d;

    public ti(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI settingsModifyUserAuthUI, k14.d0 d0Var) {
        this.f161579d = d0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f161579d);
    }
}
