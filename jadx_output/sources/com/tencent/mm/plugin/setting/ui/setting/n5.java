package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class n5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161348d;

    public n5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161348d = settingsAboutMicroMsgUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f161348d;
        if (itemId == 0) {
            com.tencent.mm.sdk.platformtools.b0.e(settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.f492293fz0));
            db5.t7.i(settingsAboutMicroMsgUI, settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.iow), com.tencent.mm.R.drawable.icon_toast_ok);
            jx3.f.INSTANCE.idkeyStat(250L, 32L, 1L, false);
            return;
        }
        if (itemId != 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.f492293fz0)));
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI2 = this.f161348d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingsAboutMicroMsgUI2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$15", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsAboutMicroMsgUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingsAboutMicroMsgUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$15", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        jx3.f.INSTANCE.idkeyStat(250L, 31L, 1L, false);
    }
}
