package nw4;

/* loaded from: classes.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340984e;

    public v(nw4.n nVar, java.lang.String str) {
        this.f340984e = nVar;
        this.f340983d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340984e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340983d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange, %s", e17.getMessage());
        }
    }
}
