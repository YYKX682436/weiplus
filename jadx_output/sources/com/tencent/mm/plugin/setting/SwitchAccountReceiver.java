package com.tencent.mm.plugin.setting;

/* loaded from: classes12.dex */
public class SwitchAccountReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("switch_process_action_code_key");
        com.tencent.mars.xlog.Log.i("MicroMsg.SwitchAccountReceiver", "onReceive, action %s", stringExtra);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && stringExtra.equals("action_reload_resources")) {
            java.lang.String stringExtra2 = intent.getStringExtra("switch_language");
            com.tencent.mars.xlog.Log.i("MicroMsg.SwitchAccountReceiver", "onReceive, language %s", stringExtra2);
            java.util.Locale s17 = com.tencent.mm.sdk.platformtools.m2.s(stringExtra2);
            if ("language_default".equalsIgnoreCase(stringExtra2)) {
                s17 = com.tencent.mm.sdk.platformtools.m2.f192848b;
                java.util.Locale.setDefault(s17);
            }
            com.tencent.mm.sdk.platformtools.m2.u(context.getApplicationContext(), s17);
            android.content.res.Resources resources = context.getApplicationContext().getResources();
            android.content.Context applicationContext = context.getApplicationContext();
            java.lang.reflect.Method method = j65.j.f297955f;
            com.tencent.mm.sdk.platformtools.x2.f193075e = j65.j.d(resources, applicationContext, j65.v.f(applicationContext, stringExtra2), false);
        }
    }
}
