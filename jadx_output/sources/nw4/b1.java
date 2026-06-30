package nw4;

/* loaded from: classes.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340801e;

    public b1(nw4.n nVar, java.lang.String str) {
        this.f340801e = nVar;
        this.f340800d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340801e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340800d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onCurrentLocationReady fail, ex = %s", e17.getMessage());
        }
    }
}
