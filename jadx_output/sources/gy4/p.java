package gy4;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f277618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gy4.u uVar) {
        super(4);
        this.f277618d = uVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean z17;
        java.lang.String urlPath = (java.lang.String) obj;
        java.util.Map lowercaseHeaders = (java.util.Map) obj2;
        com.tencent.xweb.WebView webview = (com.tencent.xweb.WebView) obj3;
        com.tencent.xweb.x0 request = (com.tencent.xweb.x0) obj4;
        kotlin.jvm.internal.o.g(urlPath, "urlPath");
        kotlin.jvm.internal.o.g(lowercaseHeaders, "lowercaseHeaders");
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] start, urlPath: ".concat(urlPath));
        java.lang.String lowerCase = "File-ID-List".toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String str = (java.lang.String) lowercaseHeaders.get(lowerCase);
        java.util.List f07 = str != null ? r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null) : kz5.p0.f313996d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] fileIds: " + f07);
        boolean isEmpty = f07.isEmpty();
        gy4.u uVar = this.f277618d;
        if (!isEmpty) {
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                if (uVar.f277629h.containsKey((java.lang.String) it.next())) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] some fileIds already requested, return null");
            return null;
        }
        java.util.Iterator it6 = f07.iterator();
        while (it6.hasNext()) {
            uVar.f277629h.put((java.lang.String) it6.next(), java.lang.Boolean.TRUE);
        }
        uVar.getClass();
        com.tencent.mm.plugin.webview.model.s0 s0Var = new com.tencent.mm.plugin.webview.model.s0(new java.util.LinkedList((java.util.List) kotlinx.coroutines.l.f(null, new gy4.j(f07, uVar, null), 1, null)));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] return response with " + s0Var.getFiles().size() + " cdn info entries");
        java.lang.String jSONObject = s0Var.toJSON().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        byte[] bytes = jSONObject.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return new com.tencent.xweb.y0("application/json", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, new java.io.ByteArrayInputStream(bytes));
    }
}
