package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public abstract class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f189322a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f189323b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static int f189324c = -1;

    static {
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.tencent.mm.xwebutil.y0.c();
    }

    public static boolean a() {
        if (f189324c < 0) {
            f189324c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_game_webview_in_mm, 0);
        }
        return f189324c == 1 && d() == 0;
    }

    public static boolean b() {
        return d() == 0;
    }

    public static boolean c() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_discover_page_preload_search_webview, 0) == 1;
    }

    public static int d() {
        if (f189322a >= 0) {
            com.tencent.mars.xlog.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewProgressMode, value:" + f189322a + " (0-mm/1-tools)");
            return f189322a;
        }
        com.tencent.xweb.z2 i17 = com.tencent.xweb.a3.i();
        com.tencent.mars.xlog.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewProgressMode, webviewMode:" + i17);
        if (i17 == com.tencent.xweb.z2.NOT_IN_MM) {
            f189322a = 1;
            return 1;
        }
        f189322a = 0;
        return 0;
    }
}
