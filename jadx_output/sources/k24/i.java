package k24;

/* loaded from: classes11.dex */
public final class i implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg f303760a;

    public i(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg) {
        this.f303760a = settingSwitchNotifyNewMsg;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg = this.f303760a;
        if (!z17) {
            settingSwitchNotifyNewMsg.s7();
            return;
        }
        k24.h hVar = new k24.h(settingSwitchNotifyNewMsg);
        java.lang.String a17 = n25.a.a();
        settingSwitchNotifyNewMsg.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (!fp.h.c(26)) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", settingSwitchNotifyNewMsg.getContext().getPackageName());
            intent.putExtra("app_uid", settingSwitchNotifyNewMsg.getContext().getApplicationInfo().uid);
            intent.addFlags(268435456);
            android.app.Activity context = settingSwitchNotifyNewMsg.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingSwitchNotifyNewMsg", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingSwitchNotifyNewMsg", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (u75.d.c() && (!u75.d.f() || (u75.d.f() && !u75.d.d()))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "openSysSetting() ifNotificationChannelSupportNativeActionJump = false");
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
            intent2.setClassName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
            intent2.putExtra("appName", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490495wp));
            intent2.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, settingSwitchNotifyNewMsg.getContext().getPackageName());
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent2, hVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "openSysSetting() native notificationchannel jump");
        if (new z2.n1(settingSwitchNotifyNewMsg.getContext()).a()) {
            intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.CHANNEL_ID", a17);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", settingSwitchNotifyNewMsg.getContext().getPackageName());
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent, hVar);
    }
}
