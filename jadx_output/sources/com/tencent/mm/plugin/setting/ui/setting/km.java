package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class km extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161244a;

    public km(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161244a = settingsSwitchAccountUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "onReceive %s", intent.getAction());
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = this.f161244a;
        settingsSwitchAccountUI.unregisterReceiver(settingsSwitchAccountUI.f160700w);
        java.lang.String action = intent.getAction();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (action == null) {
            action = "";
        }
        if (action.equals("action_kill_mm_process")) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
            gm0.j1.b();
            gm0.m.o();
            gm0.j1.i().l("switch account ,delay logout");
            com.tencent.mars.WeChatMars.onSingalCrash(0);
            if (com.tencent.paymars.WeChatMars.isEnable()) {
                com.tencent.paymars.WeChatMars.onSingalCrash(0);
            }
            com.tencent.mars.xlog.Log.appenderFlush();
            settingsSwitchAccountUI.finish();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
            new com.tencent.mm.autogen.events.SwitchAccountKillProcessEvent().e();
        }
    }
}
