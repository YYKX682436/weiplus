package vs1;

/* loaded from: classes7.dex */
public abstract class a implements vs1.e {
    public final boolean c(java.lang.String url, ts1.o target, java.lang.String host, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(host, "host");
        boolean z18 = true;
        if (i17 == 200) {
            target.z(com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94222g, host);
            cx4.s.c(3L, 1L, target.j());
        } else if (i17 != 304) {
            if (i17 == 301 || i17 == 302) {
                java.util.Set<java.lang.String> keySet = target.l().keySet();
                kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                if (!keySet.isEmpty()) {
                    for (java.lang.String str : keySet) {
                        kotlin.jvm.internal.o.d(str);
                        java.lang.String lowerCase = str.toLowerCase();
                        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                        if (kotlin.jvm.internal.o.b(lowerCase, ya.b.LOCATION)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    target.z(com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94222g, host);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BaseContentFetcher", "processResponseCode fetch error: invalid headers url: %s", url);
                }
            } else {
                cx4.s.c(5L, 1L, target.j());
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseContentFetcher", "processResponseCode fetch error: respCode: " + i17 + ", url: %s", url);
            }
            z18 = false;
        } else {
            target.z(com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94222g, host);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseContentFetcher", "update " + url + ": " + target.v());
            cx4.s.c(4L, 1L, target.j());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseContentFetcher", "processResponseCode responseCode: " + i17 + ", ret: " + z18);
        return z18;
    }
}
