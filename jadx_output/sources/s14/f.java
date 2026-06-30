package s14;

/* loaded from: classes.dex */
public final class f implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.permission.SettingNFCPermissionUI f402147a;

    public f(com.tencent.mm.plugin.setting.ui.setting.permission.SettingNFCPermissionUI settingNFCPermissionUI) {
        this.f402147a = settingNFCPermissionUI;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.permission.SettingNFCPermissionUI.f161438f;
        com.tencent.mm.plugin.setting.ui.setting.permission.SettingNFCPermissionUI settingNFCPermissionUI = this.f402147a;
        if (z17) {
            settingNFCPermissionUI.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 1);
        } else {
            settingNFCPermissionUI.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 2);
        }
    }
}
