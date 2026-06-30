package sg0;

/* loaded from: classes8.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f407857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f407858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(sg0.a2 a2Var, org.json.JSONObject jSONObject) {
        super(0);
        this.f407857d = a2Var;
        this.f407858e = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView;
        sg0.a2 a2Var = this.f407857d;
        kz5.h0.B(a2Var.f407671i, sg0.w1.f407848d);
        java.util.Iterator it = ((java.util.ArrayList) a2Var.f407671i).iterator();
        while (it.hasNext()) {
            sg0.k1 k1Var = (sg0.k1) it.next();
            k1Var.getClass();
            org.json.JSONObject ret = this.f407858e;
            kotlin.jvm.internal.o.g(ret, "ret");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onStoreSetData, event->" + ret);
                java.lang.ref.WeakReference weakReference = k1Var.f407738a;
                if (weakReference != null && (baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) weakReference.get()) != null) {
                    av4.y0.f14350a.a(baseWebSearchWebView, "onLiteAppSetData", ret);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onStoreSetData exp:" + e17);
            }
        }
        return jz5.f0.f302826a;
    }
}
