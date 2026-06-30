package gy4;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f277617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gy4.u uVar) {
        super(4);
        this.f277617d = uVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.webview.model.r0 r0Var;
        java.lang.String urlPath = (java.lang.String) obj;
        java.util.Map lowercaseHeaders = (java.util.Map) obj2;
        com.tencent.xweb.WebView webview = (com.tencent.xweb.WebView) obj3;
        com.tencent.xweb.x0 request = (com.tencent.xweb.x0) obj4;
        kotlin.jvm.internal.o.g(urlPath, "urlPath");
        kotlin.jvm.internal.o.g(lowercaseHeaders, "lowercaseHeaders");
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] start, urlPath: ".concat(urlPath));
        gy4.u uVar = this.f277617d;
        if (uVar.f277628g.getAndSet(true)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] already got chat records, return null");
            return null;
        }
        qg5.r rVar = (qg5.r) ((qg5.l0) uVar.T6()).f363058t.get();
        java.util.List<c01.ob> list = rVar == null ? kz5.p0.f313996d : rVar.f363152c;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] got " + list.size() + " records");
        gy4.d U6 = uVar.U6();
        if (U6 != null) {
            str = U6.f277590e;
            if (str == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                throw null;
            }
        } else {
            str = "";
        }
        qg5.r rVar2 = (qg5.r) ((qg5.l0) uVar.T6()).f363058t.get();
        java.lang.String str3 = rVar2 == null ? null : rVar2.f363150a;
        java.lang.String str4 = str3 != null ? str3 : "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (c01.ob obVar : list) {
            java.lang.String str5 = (java.lang.String) kotlinx.coroutines.l.f(null, new gy4.h(obVar, null), 1, null);
            if (str5 == null) {
                r0Var = null;
            } else {
                c01.nb nbVar = obVar.f37374b;
                com.tencent.mm.storage.f9 f9Var = obVar.f37373a;
                java.lang.String str6 = nbVar != null ? nbVar.f37351a : null;
                if (nbVar != null) {
                    try {
                    } catch (java.lang.Exception e17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildFileCdnInfo, msg: ");
                        sb6.append(f9Var != null ? f9Var.Q0() : null);
                        sb6.append(' ');
                        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewChatRecordsUIC", e17, sb6.toString(), new java.lang.Object[0]);
                    }
                    if (((kotlinx.coroutines.c3) nbVar.f37352b).isCancelled() || !((java.lang.Boolean) kotlinx.coroutines.l.f(null, new gy4.f(nbVar, null), 1, null)).booleanValue()) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("file is not available in cdn, msg: ");
                        sb7.append(f9Var != null ? f9Var.Q0() : null);
                        sb7.append(' ');
                        sb7.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", sb7.toString());
                        str2 = "localData";
                    } else {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append("file is available in cdn, msg: ");
                        sb8.append(f9Var != null ? f9Var.Q0() : null);
                        sb8.append(' ');
                        sb8.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", sb8.toString());
                        str2 = "cdn";
                    }
                } else {
                    str2 = null;
                }
                r0Var = new com.tencent.mm.plugin.webview.model.r0(str5, str6, str2);
            }
            if (r0Var != null) {
                arrayList.add(r0Var);
            }
        }
        com.tencent.mm.plugin.webview.model.q0 q0Var = new com.tencent.mm.plugin.webview.model.q0(str, str4, new java.util.LinkedList(arrayList));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] return response with " + q0Var.j().size() + " records");
        java.lang.String jSONObject = q0Var.toJSON().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        byte[] bytes = jSONObject.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return new com.tencent.xweb.y0("application/json", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, new java.io.ByteArrayInputStream(bytes));
    }
}
