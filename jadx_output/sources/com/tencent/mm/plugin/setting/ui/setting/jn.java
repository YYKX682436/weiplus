package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes15.dex */
public class jn implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.v f161205d;

    public jn(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI, k14.v vVar) {
        this.f161205d = vVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f161205d);
    }
}
