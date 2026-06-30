package hx4;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f285694a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f285695b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f285696c;

    static {
        hx4.u uVar = new hx4.u();
        java.util.HashSet d17 = kz5.p1.d("com.tencent.mtt", "com.tencent.mtt.x86", "com.tencent.mtt.qbx", "com.tencent.qbx5", "com.ucmobile", "com.ucmobile.lite", "com.android.chrome", "com.baidu.browser.apps", "com.baidu.searchbox", "com.baidu.searchbox.lite", "com.ijinshan.browser_fast", "com.qihoo.browser", "com.qihoo.contents", "org.mozilla.firefox", "sogou.mobile.explorer");
        f285694a = d17;
        java.util.HashSet hashSet = new java.util.HashSet();
        f285696c = hashSet;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_browser_allow_list_1, "", true);
        kotlin.jvm.internal.o.d(Zi);
        uVar.a(Zi);
        java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_browser_allow_list_2, "", true);
        kotlin.jvm.internal.o.d(Zi2);
        uVar.a(Zi2);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_browser_enable_block, 0) == 1;
        f285695b = z17;
        java.lang.String Zi3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_browser_block_list_1, "", true);
        kotlin.jvm.internal.o.d(Zi3);
        uVar.b(Zi3);
        java.lang.String Zi4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_browser_block_list_2, "", true);
        kotlin.jvm.internal.o.d(Zi4);
        uVar.b(Zi4);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserConfigManager", "initBrowserConfig allowBrowserList size: " + d17.size() + ", " + d17 + ", enableBlockBrowser: " + z17 + ", blockBrowserList size: " + hashSet.size() + ", " + hashSet);
    }

    public final void a(java.lang.String str) {
        java.util.Iterator it = r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            java.lang.String lowerCase = ((java.lang.String) it.next()).toLowerCase();
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                java.util.HashSet hashSet = f285694a;
                if (!hashSet.contains(lowerCase)) {
                    hashSet.add(lowerCase);
                }
            }
        }
    }

    public final void b(java.lang.String str) {
        java.util.Iterator it = r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            java.lang.String lowerCase = ((java.lang.String) it.next()).toLowerCase();
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                java.util.HashSet hashSet = f285696c;
                if (!hashSet.contains(lowerCase)) {
                    hashSet.add(lowerCase);
                }
            }
        }
    }
}
