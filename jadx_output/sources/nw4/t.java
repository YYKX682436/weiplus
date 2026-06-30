package nw4;

/* loaded from: classes.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340972e;

    public t(nw4.n nVar, java.lang.String str) {
        this.f340972e = nVar;
        this.f340971d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340972e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340971d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange, %s", e17.getMessage());
        }
    }
}
