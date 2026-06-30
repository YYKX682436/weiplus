package yj1;

/* loaded from: classes7.dex */
public abstract class a {
    public static final boolean a(com.tencent.mm.plugin.appbrand.o6 rt6, android.content.res.Configuration oldConfig, android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(oldConfig, "oldConfig");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        boolean f17 = rt6.m0() != null ? rt6.m0().f() : false;
        boolean z17 = (newConfig.uiMode & 48) != (oldConfig.uiMode & 48);
        boolean F = com.tencent.mm.ui.bk.F();
        boolean I = com.tencent.mm.ui.bk.I();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBandDarkModeHelper", "darkModeThemeChanged  isDarkModeSupportForCurrentWxa=%b  isNightModeEnableForWeChat=%b  isDarkModeFollowSystem=%b  nightModeChanged=%b", java.lang.Boolean.valueOf(f17), java.lang.Boolean.valueOf(F), java.lang.Boolean.valueOf(I), java.lang.Boolean.valueOf(z17));
        if (!f17 || !F || !z17 || !I) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Theme change into ");
        sb6.append(32 == (newConfig.uiMode & 48) ? "NIGHT" : "DAY");
        sb6.append(" mode");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBandDarkModeHelper", sb6.toString());
        return true;
    }
}
