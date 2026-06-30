package nw4;

/* loaded from: classes.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340943e;

    public p1(nw4.n nVar, java.lang.String str) {
        this.f340943e = nVar;
        this.f340942d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340943e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340942d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchImageListReady fail, ex = %s", e17.getMessage());
        }
    }
}
