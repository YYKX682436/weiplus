package gm0;

/* loaded from: classes11.dex */
public abstract class k2 {
    public static void a(android.content.Context context, boolean z17) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeChatAppStatus", "editFullExitStatus context == null");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs");
        M.getClass();
        M.putBoolean("settings_fully_exit", z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatAppStatus", "editFullExitStatus to " + z17);
    }

    public static void b(android.content.Context context, boolean z17) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeChatAppStatus", "editShutDownWxStatus context == null");
            return;
        }
        context.getSharedPreferences("system_config_prefs_showdown", 4).edit().putBoolean("shut_down_weixin", z17).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatAppStatus", "editShutDownWxStatus to " + z17);
    }

    public static boolean c(android.content.Context context) {
        if (context != null) {
            return com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs").getBoolean("settings_fully_exit", true);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatAppStatus", "getFullExitStatus context == null");
        return false;
    }

    public static boolean d(android.content.Context context) {
        if (context != null) {
            return context.getSharedPreferences("system_config_prefs_showdown", 4).getBoolean("shut_down_weixin", false);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatAppStatus", "getShutDownWxStatus context == null");
        return false;
    }
}
