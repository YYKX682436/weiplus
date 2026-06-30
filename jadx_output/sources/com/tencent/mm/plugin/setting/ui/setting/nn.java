package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes15.dex */
public class nn implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.b0 f161368d;

    public nn(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI, k14.b0 b0Var) {
        this.f161368d = b0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f161368d);
    }
}
