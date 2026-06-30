package nw4;

/* loaded from: classes.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340952e;

    public r(nw4.n nVar, java.lang.String str) {
        this.f340952e = nVar;
        this.f340951d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340952e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340951d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onExdeviceStateChange, %s", e17.getMessage());
        }
    }
}
