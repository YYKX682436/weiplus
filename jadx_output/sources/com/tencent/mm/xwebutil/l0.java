package com.tencent.mm.xwebutil;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f214849a = "";

    /* renamed from: b, reason: collision with root package name */
    public static int f214850b;

    public static void a() {
        try {
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "current process name: " + bm5.f1.a());
            com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("weixin_h5_debug_info", 2, null);
            if (N != null) {
                f214849a = N.getString("weixin_h5_debug_host", "");
                int i17 = N.getInt("weixin_h5_debug_port", 0);
                f214850b = i17;
                com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "get mmkvName:%s, customIp:%s, customPort:%d", "weixin_h5_debug_info", f214849a, java.lang.Integer.valueOf(i17));
            } else {
                com.tencent.mars.xlog.Log.e("XWeb.MM.XWebDebugProxyUtil", "mmkv is null,mmkvName:%s", "weixin_h5_debug_info");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("XWeb.MM.XWebDebugProxyUtil", e17, "get mmkv fail Exception", new java.lang.Object[0]);
        }
    }
}
