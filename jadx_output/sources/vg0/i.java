package vg0;

/* loaded from: classes8.dex */
public final class i implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436454a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436455b;

    public i(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436454a = callbackRef;
        this.f436455b = "onSetInputWord";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("query") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        tg0.q1 q1Var = (tg0.q1) this.f436454a.get();
        if (q1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onSetInputWord, ".concat(str));
            androidx.appcompat.app.AppCompatActivity appCompatActivity = ((rx4.e) q1Var).f401134a;
            kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.fts.f4((com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI) appCompatActivity, str));
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436455b;
    }
}
