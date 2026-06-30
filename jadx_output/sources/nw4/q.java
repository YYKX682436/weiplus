package nw4;

/* loaded from: classes.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340946e;

    public q(nw4.n nVar, java.lang.String str) {
        this.f340946e = nVar;
        this.f340945d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340946e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340945d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onDownloadStateChange, ex = %s", e17.getMessage());
        }
    }
}
