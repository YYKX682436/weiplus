package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class jf implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.kf f161195d;

    public jf(com.tencent.mm.plugin.setting.ui.setting.kf kfVar) {
        this.f161195d = kfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI settingsLanguageUI = this.f161195d.f161238d;
        java.lang.String str = settingsLanguageUI.f160482m;
        boolean z17 = settingsLanguageUI.f160483n;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "saveLanguage language: %s notauth %s", str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference.f161506e.a(settingsLanguageUI, "select_view_language", str, 4);
        java.util.Locale s17 = com.tencent.mm.sdk.platformtools.m2.s(str);
        if ("language_default".equalsIgnoreCase(str)) {
            s17 = com.tencent.mm.sdk.platformtools.m2.f192848b;
            java.util.Locale.setDefault(s17);
        }
        settingsLanguageUI.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 4);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putString("language_key", str);
        com.tencent.mm.sdk.platformtools.e8.a("language_key", str);
        com.tencent.mars.xlog.Log.w("MicroMsg.LocaleUtil", "save application lang as:".concat(str));
        com.tencent.mm.autogen.events.ChangeLanguageEvent changeLanguageEvent = new com.tencent.mm.autogen.events.ChangeLanguageEvent();
        changeLanguageEvent.f54031g.f8162a = str;
        changeLanguageEvent.e();
        com.tencent.mm.sdk.platformtools.a9.f192463a = str;
        com.tencent.mm.sdk.platformtools.q9.a();
        com.tencent.mm.sdk.platformtools.h9 h9Var = com.tencent.mm.sdk.platformtools.p9.f192935a.f192867a;
        if (h9Var != null) {
            h9Var.reload();
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        com.tencent.mm.plugin.expansions.i0.h(str);
        com.tencent.mm.sdk.platformtools.m2.u(settingsLanguageUI, s17);
        com.tencent.mm.sdk.platformtools.e8.a("system_property_key_locale", str);
        com.tencent.mm.sdk.platformtools.x2.f193075e = j65.j.e(settingsLanguageUI.getApplication().getResources(), settingsLanguageUI.getApplication(), false);
        com.tencent.mm.storage.ha.s();
        com.tencent.xweb.a3.C(s17);
        if (z17) {
            ((com.tencent.mm.app.y7) f14.g.b()).u(new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true), settingsLanguageUI);
        } else {
            gm0.j1.d().g(new c01.ra(new com.tencent.mm.plugin.setting.ui.setting.lf(settingsLanguageUI), null));
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName(com.tencent.mm.ui.u2.f211062a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_RELOAD_RESOURCES");
            intent.putExtra("tools_language", str);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
            android.content.Intent intent2 = new android.content.Intent(settingsLanguageUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.SwitchAccountReceiver.class);
            intent2.putExtra("switch_process_action_code_key", "action_reload_resources");
            intent2.putExtra("switch_language", str);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent2);
            com.tencent.mm.plugin.setting.ui.widget.FontSelectorView.f162034w = 8;
            ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().f293552a.clear();
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Intro_Need_Clear_Top ", true);
            ((com.tencent.mm.app.y7) f14.g.b()).u(intent3, settingsLanguageUI);
        }
        return null;
    }
}
