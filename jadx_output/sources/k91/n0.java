package k91;

/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f305690a = new java.util.concurrent.atomic.AtomicReference();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    public static final java.lang.String a() {
        java.lang.String str;
        java.util.concurrent.atomic.AtomicReference atomicReference = f305690a;
        java.lang.String str2 = (java.lang.String) atomicReference.get();
        if (!(str2 == null || str2.length() == 0)) {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper", "getSystemUserAgent by memory cache");
            kotlin.jvm.internal.o.d(str2);
            return str2;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        cf.h t17 = com.tencent.mm.sdk.platformtools.o4.N("AppBrandNetworkConfigUserAgentHelper", 2, null).t("UserAgent");
        java.lang.String str3 = "";
        if (t17 instanceof cf.h) {
            str = ((cf.h) t17).I();
        } else if (t17 == 0 || (str = t17.toString()) == null) {
            str = "";
        }
        boolean a17 = com.tencent.mm.plugin.appbrand.utils.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent try mmkv cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent try mmkv cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        }
        if (t17 == 0 || t17.length() == 0) {
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            try {
                java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(com.tencent.mm.sdk.platformtools.x2.f193071a);
                kotlin.jvm.internal.o.d(defaultUserAgent);
                t17 = defaultUserAgent;
            } catch (java.lang.Throwable unused) {
                java.lang.String property = java.lang.System.getProperty("http.agent");
                t17 = property;
                if (property == null) {
                    t17 = "";
                }
            }
            if (t17 instanceof cf.h) {
                str3 = t17.I();
            } else {
                java.lang.String obj = t17.toString();
                if (obj != null) {
                    str3 = obj;
                }
            }
            boolean a18 = com.tencent.mm.plugin.appbrand.utils.d5.a();
            long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
            if (elapsedRealtime4 <= 32 || !a18) {
                com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent by webkit cost " + elapsedRealtime4 + " ms result:" + str3 + " isMainThread: " + a18 + ' ');
            } else {
                com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime4 / 16)) + " frames! runProfiled:log:Luggage.WXA.FULL.AppBrandNetworkConfigUserAgentHelper: getSystemUserAgent by webkit cost " + elapsedRealtime4 + " ms result:" + str3 + " isMainThread: " + a18 + ' ');
            }
        }
        atomicReference.set(t17);
        return t17;
    }
}
