package d23;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d23.g f225893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f225894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d23.g gVar, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f225893d = gVar;
        this.f225894e = jSONObject;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d23.f(this.f225893d, this.f225894e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        d23.f fVar = (d23.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        av4.j jVar = this.f225893d.f14326a;
        if (jVar != null && (webView = jVar.getWebView()) != null) {
            java.lang.String jSONObject = this.f225894e.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onActivityStateChanged", jSONObject);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onActivityStateChanged", "onActivityStateChanged", jSONObject}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(webView, format));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
