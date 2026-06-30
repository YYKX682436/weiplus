package nw4;

/* loaded from: classes.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340794e;

    public a1(nw4.n nVar, java.lang.String str) {
        this.f340794e = nVar;
        this.f340793d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340794e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340793d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onCurrentLocationReady fail, ex = %s", e17.getMessage());
        }
    }
}
