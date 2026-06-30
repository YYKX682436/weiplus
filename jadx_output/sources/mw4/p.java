package mw4;

/* loaded from: classes5.dex */
public final class p extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final yz5.q f331787b;

    public p(yz5.q qVar, mw4.o oVar, kotlin.jvm.internal.i iVar) {
        this.f331787b = qVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        yz5.q qVar = this.f331787b;
        if (qVar == null) {
            return null;
        }
        java.util.Map requestHeaders = request.getRequestHeaders();
        if (requestHeaders != null) {
            map = new java.util.LinkedHashMap(kz5.b1.d(requestHeaders.size()));
            for (java.util.Map.Entry entry : requestHeaders.entrySet()) {
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                java.lang.String lowerCase = ((java.lang.String) key).toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                map.put(lowerCase, entry.getValue());
            }
        } else {
            map = kz5.q0.f314001d;
        }
        return (com.tencent.xweb.y0) qVar.invoke(webview, request, map);
    }
}
