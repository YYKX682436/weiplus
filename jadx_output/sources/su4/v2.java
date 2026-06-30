package su4;

/* loaded from: classes8.dex */
public class v2 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile su4.v2 f413119b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f413120a = new java.util.HashMap();

    public static su4.v2 a() {
        if (f413119b == null) {
            synchronized (su4.v2.class) {
                if (f413119b == null) {
                    f413119b = new su4.v2();
                }
            }
        }
        return f413119b;
    }

    public void b(java.lang.String str, boolean z17, int i17) {
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "disable tools and mp");
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "preload webSearch webView in MM preloadScene:%d", java.lang.Integer.valueOf(i17));
                ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).getClass();
                ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
                qx4.l0.f367422a.e(str, z17, i17);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "preloadWebView %s %s %s %s", bm5.f1.a(), str, 4, java.lang.Boolean.valueOf(z17));
        if (!com.tencent.mm.sdk.platformtools.x2.s()) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((ku5.t0) ku5.t0.f312615d).g(new su4.u2(this, str, 4, z17));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "current preload mgr size %s", java.lang.Integer.valueOf(this.f413120a.size()));
        if (z17) {
            this.f413120a.remove(4);
        }
        if (this.f413120a.containsKey(4)) {
            ((su4.d3) this.f413120a.get(4)).a(str);
            return;
        }
        su4.d3 d3Var = new su4.d3(4);
        d3Var.a(str);
        this.f413120a.put(4, d3Var);
    }
}
