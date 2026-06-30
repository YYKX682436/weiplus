package sg0;

/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f407775d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject result = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) this.f407775d.get();
        if (baseWebSearchWebView != null) {
            pm0.v.X(new sg0.o1(result, baseWebSearchWebView));
        }
        return jz5.f0.f302826a;
    }
}
