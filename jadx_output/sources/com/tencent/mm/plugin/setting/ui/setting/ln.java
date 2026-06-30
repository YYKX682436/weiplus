package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes13.dex */
public class ln implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI f161301d;

    public ln(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI) {
        this.f161301d = settingsTrustFriendUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f161301d.finish();
    }
}
