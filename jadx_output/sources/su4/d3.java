package su4;

/* loaded from: classes8.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412859b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f412860c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f412861d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f412862e;

    public d3(int i17) {
        this.f412858a = "MicroMsg.WebSearch.WebSearchPreloadMgr";
        this.f412859b = i17;
        this.f412858a = "MicroMsg.WebSearch.WebSearchPreloadMgr_" + i17;
    }

    public void a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.x2.s()) {
            com.tencent.mars.xlog.Log.i(this.f412858a, "preload please call from tools proc");
            return;
        }
        if (this.f412860c.get()) {
            com.tencent.mars.xlog.Log.i(this.f412858a, "preloading webview %s", java.lang.Integer.valueOf(this.f412859b));
            return;
        }
        if (((java.util.LinkedList) this.f412861d).size() > 0) {
            com.tencent.mars.xlog.Log.i(this.f412858a, "already preload webview %s", java.lang.Integer.valueOf(this.f412859b));
            return;
        }
        this.f412860c.set(true);
        com.tencent.mars.xlog.Log.i(this.f412858a, "start to preload webview %d", java.lang.Integer.valueOf(this.f412859b));
        ((ku5.t0) ku5.t0.f312615d).B(new su4.w2(this, str));
    }
}
