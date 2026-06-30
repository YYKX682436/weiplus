package vg0;

/* loaded from: classes8.dex */
public final class m implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436461a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436462b;

    public m(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436461a = callbackRef;
        this.f436462b = "toggleFlutterFullScreen";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        tg0.q1 q1Var = (tg0.q1) this.f436461a.get();
        if (q1Var != null) {
            try {
                androidx.appcompat.app.AppCompatActivity appCompatActivity = ((rx4.e) q1Var).f401134a;
                if (appCompatActivity instanceof com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) {
                    ((com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) appCompatActivity).fa(-1.0f, 1.0f, 200, false);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.hitest.FTSFlutterSearchUIC", "toggleFullScreen failed:" + e17);
            }
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436462b;
    }
}
