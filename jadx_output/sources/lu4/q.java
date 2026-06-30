package lu4;

/* loaded from: classes7.dex */
public final class q extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lu4.r context) {
        super("wxJsEngineClient", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    public final void cgi(int i17, java.lang.String cgiUrl, java.lang.String reqProtoBuf, java.lang.String callback) {
        kotlin.jvm.internal.o.g(cgiUrl, "cgiUrl");
        kotlin.jvm.internal.o.g(reqProtoBuf, "reqProtoBuf");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (((lu4.r) this.f321430b).y(i17, cgiUrl)) {
            java.lang.String str = this.f321431c;
            com.tencent.mars.xlog.Log.i(str, "do cgi cmdId=" + i17 + ", cgiUrl=" + cgiUrl);
            try {
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
                kotlin.jvm.internal.o.f(forName, "forName(...)");
                byte[] bytes = reqProtoBuf.getBytes(forName);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                lVar.f70664a = new r45.fe(android.util.Base64.decode(bytes, 2));
                lVar.f70665b = new r45.ge();
                lVar.f70666c = cgiUrl;
                lVar.f70667d = i17;
                com.tencent.mm.modelbase.z2.d(lVar.a(), new lu4.o(this, i17, callback), false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "do cgi", new java.lang.Object[0]);
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void commonCgi(java.lang.String request, java.lang.String callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f321431c, "[TRACE_VIDEO_PRELOAD] jsapi cgi");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.b97();
        lVar.f70665b = new r45.c97();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/appmsg/web_comm_prefetch";
        lVar.f70667d = 4924;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WebCommPrefetchReq");
        ((r45.b97) fVar).f370642d = request;
        com.tencent.mm.modelbase.z2.d(a17, new lu4.p(this, callback), false);
    }

    @android.webkit.JavascriptInterface
    public final int getBasePkgVersion() {
        int F = ((lu4.r) this.f321430b).F();
        com.tencent.mars.xlog.Log.i(this.f321431c, "getBasePkgVersion = " + F);
        return F;
    }

    @android.webkit.JavascriptInterface
    public final int getBizPkgVersion() {
        int S = ((lu4.r) this.f321430b).S();
        com.tencent.mars.xlog.Log.i(this.f321431c, "getBizPkgVersion = " + S);
        return S;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getLocalData(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return ((lu4.r) this.f321430b).getLocalData(key);
    }

    @android.webkit.JavascriptInterface
    public final void invoke(java.lang.String func, java.lang.String message, java.lang.String callback) {
        kotlin.jvm.internal.o.g(func, "func");
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(callback, "callback");
        lu4.b bVar = this.f321430b;
        ((lu4.r) bVar).s().c(nw4.z2.c(func, message, callback), new lu4.n(this, callback));
        ((lu4.r) bVar).I(func, message);
    }

    @android.webkit.JavascriptInterface
    public final void setLocalData(java.lang.String key, java.lang.String data) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(data, "data");
        ((lu4.r) this.f321430b).setLocalData(key, data);
    }
}
