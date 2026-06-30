package nw4;

/* loaded from: classes.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340842e;

    public g1(nw4.n nVar, java.lang.String str) {
        this.f340842e = nVar;
        this.f340841d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340842e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340841d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetPoiInfoReturn fail, ex = %s", e17.getMessage());
        }
    }
}
