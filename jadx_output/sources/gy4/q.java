package gy4;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f277619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gy4.u uVar) {
        super(4);
        this.f277619d = uVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String c17;
        com.tencent.xweb.y0 y0Var;
        java.lang.String urlPath = (java.lang.String) obj;
        java.util.Map lowercaseHeaders = (java.util.Map) obj2;
        com.tencent.xweb.WebView webview = (com.tencent.xweb.WebView) obj3;
        com.tencent.xweb.x0 request = (com.tencent.xweb.x0) obj4;
        kotlin.jvm.internal.o.g(urlPath, "urlPath");
        kotlin.jvm.internal.o.g(lowercaseHeaders, "lowercaseHeaders");
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] start, urlPath: ".concat(urlPath));
        java.lang.String lowerCase = "File-ID".toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String str = (java.lang.String) lowercaseHeaders.get(lowerCase);
        java.io.InputStream inputStream = null;
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] no fileId in headers, return null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] fileId: ".concat(str));
        gy4.u uVar = this.f277619d;
        if (uVar.f277629h.containsKey(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] fileId already requested, return null");
            return null;
        }
        qg5.l0 l0Var = (qg5.l0) uVar.T6();
        l0Var.getClass();
        qg5.r rVar = (qg5.r) l0Var.f363058t.get();
        c01.ob obVar = rVar == null ? null : (c01.ob) ((java.util.Map) ((jz5.n) rVar.f363153d).getValue()).get(str);
        if (obVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] chat record not found for fileId: " + str + ", return not found");
            byte[] bytes = "404 Not Found".getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            return new com.tencent.xweb.y0("text/plain", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, 404, "Not Found", null, new java.io.BufferedInputStream(new java.io.ByteArrayInputStream(bytes)));
        }
        uVar.f277629h.put(str, java.lang.Boolean.TRUE);
        java.lang.String str2 = (java.lang.String) kotlinx.coroutines.l.f(null, new gy4.n(obVar, null), 1, null);
        if (str2 == null) {
            c17 = null;
        } else {
            c17 = q75.g.c(str2);
            if (c17 == null) {
                c17 = q75.g.d(str2);
            }
        }
        if (c17 == null) {
            c17 = "application/octet-stream";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] mime type: ".concat(c17));
        java.lang.String str3 = (java.lang.String) kotlinx.coroutines.l.f(null, new gy4.s(obVar, null), 1, null);
        if (str3 != null) {
            try {
                if (com.tencent.mm.vfs.w6.j(str3)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[loadFileStream] file exists: ".concat(str3));
                    try {
                        java.io.InputStream E = com.tencent.mm.vfs.w6.E(str3);
                        kotlin.jvm.internal.o.d(E);
                        inputStream = E;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewChatRecordsUIC", "[loadFileStream] openRead fail: " + e17);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewChatRecordsUIC", "[loadFileStream] " + e18);
            }
        }
        if (inputStream != null) {
            y0Var = new com.tencent.xweb.y0(c17, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, inputStream);
            y0Var.f220621a = c17;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] file stream not available for fileId: " + str + ", return not found");
            byte[] bytes2 = "404 Not Found".getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            y0Var = new com.tencent.xweb.y0("text/plain", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, 404, "Not Found", null, new java.io.BufferedInputStream(new java.io.ByteArrayInputStream(bytes2)));
        }
        return y0Var;
    }
}
