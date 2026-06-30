package nw4;

/* loaded from: classes.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340964e;

    public s(nw4.n nVar, java.lang.String str) {
        this.f340964e = nVar;
        this.f340963d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340964e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340963d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onScanWXDeviceResult, %s", e17.getMessage());
        }
    }
}
