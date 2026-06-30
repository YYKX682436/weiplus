package vg0;

/* loaded from: classes8.dex */
public final class h implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436452a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436453b;

    public h(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436452a = callbackRef;
        this.f436453b = "pushToNativeHistory";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("type") : null;
        java.lang.Number number = obj instanceof java.lang.Number ? (java.lang.Number) obj : null;
        long longValue = number != null ? number.longValue() : 0L;
        java.lang.Object obj2 = map != null ? map.get("keyword") : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null) {
            str = "";
        }
        tg0.q1 q1Var = (tg0.q1) this.f436452a.get();
        if (q1Var != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = ((rx4.e) q1Var).f401134a;
            kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            ((com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI) appCompatActivity).B9((int) longValue, str, null);
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436453b;
    }
}
