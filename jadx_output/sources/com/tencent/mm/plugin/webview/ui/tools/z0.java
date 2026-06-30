package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public abstract class z0 {
    public static void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
            return;
        }
        try {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("qar_cycle_rec", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("qab_tick_");
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
            java.lang.String sb7 = sb6.toString();
            long j17 = sharedPreferences.getLong(sb7, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j17 > java.util.concurrent.TimeUnit.HOURS.toMillis(24L)) {
                sharedPreferences.edit().putLong(sb7, currentTimeMillis).commit();
                jx3.f.INSTANCE.idkeyStat(943L, 1L, 1L, false);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewReporter", th6, "", new java.lang.Object[0]);
        }
    }

    public static void b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
            return;
        }
        try {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("qar_cycle_rec", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("qaj_tick_");
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
            java.lang.String sb7 = sb6.toString();
            long j17 = sharedPreferences.getLong(sb7, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j17 > java.util.concurrent.TimeUnit.HOURS.toMillis(24L)) {
                sharedPreferences.edit().putLong(sb7, currentTimeMillis).commit();
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.f(16195, str.replace(",", "%2C"), false, true);
                fVar.idkeyStat(943L, 0L, 1L, false);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewReporter", th6, "", new java.lang.Object[0]);
        }
    }
}
