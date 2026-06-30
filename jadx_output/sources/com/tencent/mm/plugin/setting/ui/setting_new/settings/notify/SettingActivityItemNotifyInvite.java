package com.tencent.mm.plugin.setting.ui.setting_new.settings.notify;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingActivityItemNotifyInvite;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingActivityItemNotifyInvite extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemNotifyInvite(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SettingsNotificationBannerUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        if (fp.h.c(26) ? ip.b.s() && ip.b.u() : ip.b.s()) {
            return null;
        }
        return java.lang.Integer.valueOf(com.tencent.mm.R.string.iul);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Notify_Activity_Invite";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingActivityItemNotifyNewMsg.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.ohm;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupNotify.class;
    }

    @Override // a24.i
    public boolean l7() {
        return false;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161965p() {
        if (!("".length() == 0)) {
            return "";
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.iuf);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        return ip.b.t();
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        k24.a aVar = new k24.a();
        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
        java.lang.String h17 = mx3.i0.h("");
        android.content.Intent intent = new android.content.Intent();
        if (!fp.h.c(26)) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", getContext().getPackageName());
            intent.putExtra("app_uid", getContext().getApplicationInfo().uid);
            intent.addFlags(268435456);
            android.app.Activity context2 = getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingActivityItemNotifyInvite", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingActivityItemNotifyInvite", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (u75.d.c() && (!u75.d.f() || (u75.d.f() && !u75.d.d()))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingActivityNotifyNewMsg", "openSysSetting() ifNotificationChannelSupportNativeActionJump = false");
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
            intent2.setClassName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
            intent2.putExtra("appName", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490495wp));
            intent2.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, getContext().getPackageName());
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            if (jVar != null) {
                ((sb0.f) jVar).aj(intent2, aVar);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingActivityNotifyNewMsg", "openSysSetting() native notificationchannel jump");
        if (new z2.n1(getContext()).a()) {
            intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.CHANNEL_ID", h17);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", getContext().getPackageName());
        intent.addFlags(268435456);
        tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
        if (jVar2 != null) {
            ((sb0.f) jVar2).aj(intent, aVar);
        }
    }
}
