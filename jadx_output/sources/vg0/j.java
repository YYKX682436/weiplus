package vg0;

/* loaded from: classes8.dex */
public final class j implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436456a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436457b;

    public j(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436456a = callbackRef;
        this.f436457b = "setSearchBarFocus";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("focused") : null;
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        tg0.q1 q1Var = (tg0.q1) this.f436456a.get();
        if (q1Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = ((rx4.e) q1Var).f401135b;
            if (!booleanValue) {
                fTSFlutterSearchUIC.hideVKB();
            }
            com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = (com.tencent.mm.ui.search.FTSEditTextView) fTSFlutterSearchUIC.findViewById(com.tencent.mm.R.id.gfl);
            if (booleanValue) {
                if (fTSEditTextView != null) {
                    fTSEditTextView.requestFocus();
                }
            } else if (fTSEditTextView != null) {
                fTSEditTextView.clearFocus();
            }
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436457b;
    }
}
