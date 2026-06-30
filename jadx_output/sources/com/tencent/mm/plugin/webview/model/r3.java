package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public abstract class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f183090a;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f183090a = hashSet;
        hashSet.add("file:///android_asset/");
        java.lang.String h17 = lp0.b.h();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
            h17 = lp0.b.h();
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.websearch.l2.g(0).l());
        hashSet.add("file://" + r6Var.o());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file://");
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        sb6.append(com.tencent.mm.plugin.websearch.l2.g(3).l());
        hashSet.add(sb6.toString());
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(lp0.b.D(), com.tencent.mm.plugin.websearch.l2.g(0).h());
        hashSet.add("file://" + r6Var2.o());
        com.tencent.mars.xlog.Log.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", r6Var.o(), r6Var2.o());
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(h17, "emoji/res");
        hashSet.add("file://" + r6Var3.o());
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(lp0.b.D(), "emoji/res");
        hashSet.add("file://" + r6Var4.o());
        com.tencent.mars.xlog.Log.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", r6Var3.o(), r6Var4.o());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.URLFilter", "WebViewUI white list path : %s", (java.lang.String) it.next());
        }
    }

    public static boolean a(java.lang.String str) {
        if (x51.o1.f452062o) {
            com.tencent.mars.xlog.Log.w("MicroMsg.URLFilter", "skipLoadUrlCheck");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("about:blank")) {
            return false;
        }
        if (!lowerCase.startsWith("file://")) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(android.net.Uri.parse(lowerCase).getHost())) {
                return true;
            }
            return !r4.getHost().contains(nf.s.a());
        }
        java.util.Iterator it = ((java.util.HashSet) f183090a).iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
