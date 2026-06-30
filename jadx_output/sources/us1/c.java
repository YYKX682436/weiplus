package us1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f430465a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f430466b;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f430466b = arrayList;
        if (a()) {
            arrayList.add(vs1.h.f439870a);
        }
        arrayList.add(vs1.d.f439865a);
    }

    public static final boolean a() {
        int i17;
        boolean z17;
        if (f430465a == null) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_prefetcher_enable_fetch_content_by_web_transfer, 1);
            if (Ni != 1) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            } else {
                z17 = true;
            }
            f430465a = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherContentManager", "initConfig enableFetchContentByWebTransfer config: " + Ni + ", enable: " + f430465a);
        }
        java.lang.Boolean bool = null;
        if (com.tencent.mm.plugin.webview.core.s1.f181972a.a() && (i17 = com.tencent.mm.plugin.webview.core.t1.a().getInt("debugTransfer", -1)) != -1) {
            bool = java.lang.Boolean.valueOf(i17 == 1);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.Boolean bool2 = f430465a;
        kotlin.jvm.internal.o.d(bool2);
        return bool2.booleanValue();
    }
}
