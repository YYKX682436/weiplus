package yw4;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw4.i f466954a;

    public f(yw4.i iVar) {
        this.f466954a = iVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void f(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "onPageCommitVisible, url = %s", str);
        yw4.i iVar = this.f466954a;
        if (!iVar.f466963h) {
            iVar.c().f181916a.evaluateJavascript(r26.b0.b("(function(p){\n                p.wx=p.wx||{};\n                p.wx.timeOrigin=" + iVar.c().V.f286137s + ";\n                p.wx.info=Object.assign(p.wx.info||{}, {\n                    preauth:" + iVar.f466959d + ",\n                    prefetch:" + iVar.f466958c + ",\n                    predns:" + iVar.f466960e + "\n                })\n                return p.wx.info;\n            })(window.performance);"), yw4.e.f466953a);
            iVar.f466963h = true;
            zq1.j0 j0Var = iVar.f466957b;
            if (j0Var != null) {
                zw4.i.a(zw4.h.f476927m, str, j0Var != null ? j0Var.f474995a : null, j0Var != null ? j0Var.f475003i : 0, j0Var != null ? j0Var.f474998d : 0, j0Var != null ? j0Var.f475002h : 0);
            }
            zw4.n.f476934a.b(zw4.a.f476883h, iVar.c().f181928g);
        }
        yw4.q qVar = iVar.f466964i;
        if (qVar == null) {
            return;
        }
        qVar.f466989l = false;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "onPageFinished, url = %s", str);
        zw4.n.f476934a.b(zw4.a.f476884i, this.f466954a.c().f181928g);
        yw4.u uVar = this.f466954a.f466966k;
        java.lang.String str2 = "dumpPrefetchLoadResPerformance prefetch: " + uVar.f466994a + ", enableLoadResOpt: true, loadContentCost: " + uVar.f466997d + ", loadResCostTotal: " + uVar.f466997d + ", loadResAvg: %s, url = %s";
        java.lang.Object[] objArr = new java.lang.Object[2];
        int i17 = uVar.f466999f;
        objArr[0] = i17 > 0 ? java.lang.Long.valueOf(uVar.f466998e / i17) : null;
        objArr[1] = uVar.f466995b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherResPerformanceHelper", str2, objArr);
        if (uVar.f466994a) {
            ((ku5.t0) ku5.t0.f312615d).g(new yw4.t(uVar));
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        yw4.q qVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageStarted, prefetch: ");
        yw4.i iVar = this.f466954a;
        sb6.append(iVar.f466958c);
        sb6.append(", url = %s");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", sb6.toString(), str);
        zw4.n.f476934a.b(zw4.a.f476882g, iVar.c().f181928g);
        if (!iVar.f466958c || (qVar = iVar.f466964i) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "updateRandomStr isDgtVerify: " + qVar.f466987j);
        if (qVar.f466986i && qVar.f466987j) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("__event_id", "sys:updateRandomStr");
                jSONObject2.put("randomStr", qVar.f466988k);
                jSONObject.put("__json_message", jSONObject2);
                com.tencent.mm.ui.widget.MMWebView mMWebView = qVar.f466980c;
                kotlin.jvm.internal.o.d(mMWebView);
                mMWebView.evaluateJavascript("javascript:WeixinPrefecherJSBridge._handleMessageFromWeixin(" + jSONObject + ')', new yw4.p());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherJsApiHandler", e17, "updateRandomStr exception", new java.lang.Object[0]);
            }
        }
    }
}
