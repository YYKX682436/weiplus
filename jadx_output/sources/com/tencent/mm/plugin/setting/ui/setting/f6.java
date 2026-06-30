package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class f6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI f161025d;

    public f6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI) {
        this.f161025d = settingsAboutSystemUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch user go set system nfc switch");
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI = this.f161025d;
        settingsAboutSystemUI.f160277h = true;
        android.content.Intent intent = new android.content.Intent("android.settings.NFC_SETTINGS");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingsAboutSystemUI, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsAboutSystemUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingsAboutSystemUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
