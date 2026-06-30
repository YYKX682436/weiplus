package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsNotificationUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f160589o = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160590g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160591h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160592i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f160593m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f160594n;

    public SettingsNotificationUI() {
        new android.graphics.Rect();
        this.f160594n = new java.util.HashMap();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 2;
    }

    public final void X6(j35.g0 g0Var, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        if (!fp.h.c(26)) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", getPackageName());
            intent.putExtra("app_uid", getApplicationInfo().uid);
            intent.addFlags(268435456);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (u75.d.c() && (!u75.d.f() || (u75.d.f() && !u75.d.d()))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationUI", "openSysSetting() ifNotificationChannelSupportNativeActionJump = false");
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
            intent2.setClassName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
            intent2.putExtra("appName", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490495wp));
            intent2.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, getPackageName());
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent2, g0Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationUI", "openSysSetting() native notificationchannel jump");
        if (new z2.n1(getContext()).a()) {
            intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.CHANNEL_ID", str);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent, g0Var);
    }

    public final void Y6(boolean z17, long j17, int i17) {
        if (z17) {
            this.f160593m = (int) (j17 | this.f160593m);
        } else {
            this.f160593m = (int) ((~j17) & this.f160593m);
        }
        this.f160594n.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494945cd;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03a5  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI.initView():void");
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160593m = c01.z1.p();
        c01.z1.n();
        ip.b.p();
        w14.d.f442234d.c();
        l14.e eVar = l14.e.f315008a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationReporter", "reportNotificationMainPage");
        java.util.Map map = l14.e.f315009b;
        ((java.util.LinkedHashMap) map).clear();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Gj(50237, "page_in", map, 33328);
        }
        setMMTitle(com.tencent.mm.R.string.oho);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.a9.a(3);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f160593m));
        java.util.HashMap hashMap = this.f160594n;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        boolean z17 = true;
        if (str.equals("settings_sns_notify")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160590g).m("settings_sns_notify", true);
        } else {
            if (str.equals("settings_notification_finder")) {
                boolean N = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationUI", "settings_notification_finder isEnable=%s", java.lang.Boolean.valueOf(N));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().R(N);
            } else if (str.equals("settings_notification_finder_live")) {
                boolean N2 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationUI", "settings_notification_finder_live isEnable=%s", java.lang.Boolean.valueOf(N2));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().z0(N2);
            } else if (str.equals("settings_notification_finder_nearby")) {
                boolean N3 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationUI", "settings_notification_finder_nearby isEnable=%s", java.lang.Boolean.valueOf(N3));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I(N3);
                if (N3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22479, java.lang.Long.valueOf(c01.id.c()), 1);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22479, java.lang.Long.valueOf(c01.id.c()), 0);
                }
            } else if (str.equals("settings_voip_notification_both_shake_and_sound")) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                boolean N4 = checkBoxPreference.N();
                ip.l.m(N4);
                ip.l.q(N4);
                initView();
                com.tencent.mm.sdk.platformtools.t8.L1(this, checkBoxPreference.N());
            } else if (str.equals("settings_voip_shake")) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                ip.l.m(checkBoxPreference2.N());
                initView();
                com.tencent.mm.sdk.platformtools.t8.L1(this, checkBoxPreference2.N());
            } else if (str.equals("settings_voip_sound")) {
                ip.l.q(((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N());
                initView();
            }
            if (str.equals("settings_sound")) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                ip.l.o(checkBoxPreference3.N());
                initView();
                if (checkBoxPreference3.N()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 10L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 11L, 1L, false);
                }
            } else if (str.equals("settings_shake")) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                ip.l.k(checkBoxPreference4.N());
                initView();
                if (checkBoxPreference4.N()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 16L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 17L, 1L, false);
                }
                com.tencent.mm.sdk.platformtools.t8.L1(this, checkBoxPreference4.N());
            } else if (str.equals("settings_special_scene_notification_sound_and_shake")) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingsSpecialSceneNotificationUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingsSpecialSceneNotificationUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (str.equals("settings_msg_notification_content_title")) {
                w14.d dVar = w14.d.f442234d;
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.g(context, "context");
                if (j62.e.g().c(new com.tencent.mm.repairer.config.notification.RepairerConfigNotificationAvatarSwitch()) == 1) {
                    android.content.Intent putExtra = new android.content.Intent().putExtra("key_config_item", "SettingGroup_Main_Notify_Content_Content_2");
                    kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
                    j45.l.j(context, "setting", ".ui.setting_new.CommonSettingsUI", putExtra, null);
                } else {
                    android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
                    lk5.s.e(intent2, true);
                    pf5.j0.a(intent2, com.tencent.mm.plugin.setting.ui.setting.jj.class);
                    java.util.Iterator it = com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference.f161507f.iterator();
                    while (it.hasNext()) {
                        pf5.j0.a(intent2, (java.lang.Class) it.next());
                        if (!r26.n0.N("SettingsNotificationBannerUI")) {
                            intent2.putExtra("KEY_CUSTOM_PAGE_NAME", "SettingsNotificationBannerUI");
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/utils/SettingsNotificationHelper", "gotoDetail", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting/utils/SettingsNotificationHelper", "gotoDetail", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                if (str.equals("settings_new_msg_notification_switch")) {
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference5 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                    if (checkBoxPreference5.N()) {
                        ip.l.r(true);
                        initView();
                        l14.e.f315008a.b(l14.d.f315003e);
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = 3;
                        objArr[1] = java.lang.Integer.valueOf(this.f160591h ? 1 : 2);
                        g0Var.d(29634, objArr);
                    } else {
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, false);
                        k0Var.s(com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dmw, (android.view.ViewGroup) null), false);
                        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.sj(this);
                        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.tj(this);
                        k0Var.m("取消");
                        k0Var.C = new com.tencent.mm.plugin.setting.ui.setting.uj(this);
                        k0Var.f211854d = new com.tencent.mm.plugin.setting.ui.setting.vj(this);
                        k0Var.v();
                    }
                    if (!fp.h.c(26) || ip.b.u()) {
                        ip.l.r(checkBoxPreference5.N());
                        initView();
                        if (checkBoxPreference5.N()) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 0L, 1L, false);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 1L, 1L, false);
                        }
                        c01.a9.b(true, false);
                    } else {
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
                        u1Var.g(getString(com.tencent.mm.R.string.f492990df4));
                        u1Var.a(false);
                        u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.oj(this));
                        u1Var.q(false);
                    }
                } else if (str.equals("settings_new_voip_msg_invite_notification")) {
                    if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N()) {
                        ip.l.s(true);
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.idkeyStat(500L, 2L, 1L, false);
                        c01.a9.b(false, true);
                        initView();
                        l14.e.f315008a.b(l14.d.f315004f);
                        java.lang.Object[] objArr2 = new java.lang.Object[2];
                        objArr2[0] = 4;
                        objArr2[1] = java.lang.Integer.valueOf(this.f160591h ? 1 : 2);
                        g0Var2.d(29634, objArr2);
                    } else {
                        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, false);
                        k0Var2.s(com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dmx, (android.view.ViewGroup) null), false);
                        k0Var2.f211872n = new com.tencent.mm.plugin.setting.ui.setting.wj(this);
                        k0Var2.f211881s = new com.tencent.mm.plugin.setting.ui.setting.xj(this);
                        k0Var2.m("取消");
                        k0Var2.C = new com.tencent.mm.plugin.setting.ui.setting.yj(this);
                        k0Var2.f211854d = new com.tencent.mm.plugin.setting.ui.setting.kj(this);
                        k0Var2.v();
                    }
                } else if (str.equals("settings_new_msg_show_detail")) {
                    boolean N5 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                    ip.l.n(N5);
                    Y6(!N5, 2048L, 10);
                } else {
                    if (str.equals("setting_news_notification")) {
                        X6(new com.tencent.mm.plugin.setting.ui.setting.lj(this), n25.a.a());
                    }
                    if (str.equals("setting_voip_notification")) {
                        com.tencent.mm.plugin.setting.ui.setting.mj mjVar = new com.tencent.mm.plugin.setting.ui.setting.mj(this);
                        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
                        X6(mjVar, mx3.i0.h(""));
                    }
                    if (str.equals("settings_new_msg_notification_channel_sound") || str.equals("settings_new_msg_notification_ringtone")) {
                        android.content.Intent intent3 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI.class);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingWechatRingtone", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingWechatRingtone", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        if (str.equals("settings_notification_ringtone")) {
                            ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).wi(this, 1);
                        }
                        if (str.equals("settings_notification_hear_ringtone_when_call_me")) {
                            boolean N6 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                            ip.l.j(N6);
                            Y6(N6, 1073741824L, 71);
                        }
                        if (str.equals("settings_new_msg_notification_sound")) {
                            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference6 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                            ip.l.o(checkBoxPreference6.N());
                            initView();
                            if (checkBoxPreference6.N()) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 10L, 1L, false);
                            } else {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 11L, 1L, false);
                            }
                        } else if (str.equals("settings_new_msg_notification_shake")) {
                            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference7 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                            ip.l.k(checkBoxPreference7.N());
                            initView();
                            if (checkBoxPreference7.N()) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 16L, 1L, false);
                            } else {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 17L, 1L, false);
                            }
                            com.tencent.mm.sdk.platformtools.t8.L1(this, checkBoxPreference7.N());
                        } else {
                            z17 = false;
                        }
                    }
                }
            }
        }
        W6(this.f160590g, preference.f197780q);
        return z17;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
    }
}
