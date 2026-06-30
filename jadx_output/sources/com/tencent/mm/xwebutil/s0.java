package com.tencent.mm.xwebutil;

/* loaded from: classes8.dex */
public abstract class s0 {
    public static void a(android.content.Intent intent) {
        if (com.tencent.mm.pluginsdk.model.g4.b() || intent == null) {
            return;
        }
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.ui.u2.f211062a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }

    public static void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, action:" + str);
        if (!com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground() && "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS".equals(str)) {
            com.tencent.mm.sdk.platformtools.Log.c("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, ignore in background", new java.lang.Object[0]);
            return;
        }
        if (com.tencent.mm.pluginsdk.model.g4.b() && "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS".equals(str)) {
            if (com.tencent.xweb.t1.f()) {
                com.tencent.mars.xlog.Log.i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, already downgrade to sys");
                return;
            }
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, preinit child process");
            tx5.j.d(80019, null);
            tx5.j.d(80020, null);
            return;
        }
        if ("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS".equals(str)) {
            if (!com.tencent.mm.sdk.platformtools.x2.o(com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools")) {
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.ui.u2.f211062a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_process_action_code_key", str);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }
}
