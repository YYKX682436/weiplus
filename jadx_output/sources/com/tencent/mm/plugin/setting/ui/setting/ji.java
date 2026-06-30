package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ji implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI f161196d;

    public ji(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        this.f161196d = settingsModifyEmailAddrUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = this.f161196d;
        android.content.Intent intent = new android.content.Intent(settingsModifyEmailAddrUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            intent.putExtra("kintent_hint", settingsModifyEmailAddrUI.getString(com.tencent.mm.R.string.j0c));
        } else {
            intent.putExtra("kintent_hint", settingsModifyEmailAddrUI.getString(com.tencent.mm.R.string.j0d));
        }
        intent.putExtra("from_unbind", true);
        settingsModifyEmailAddrUI.startActivityForResult(intent, 1);
    }
}
