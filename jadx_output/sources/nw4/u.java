package nw4;

/* loaded from: classes.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340977e;

    public u(nw4.n nVar, java.lang.String str) {
        this.f340977e = nVar;
        this.f340976d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340977e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340976d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onWXDeviceBluetoothStateChange, %s", e17.getMessage());
        }
    }
}
