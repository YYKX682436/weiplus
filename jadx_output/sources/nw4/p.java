package nw4;

/* loaded from: classes.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340939e;

    public p(nw4.n nVar, java.lang.String str) {
        this.f340939e = nVar;
        this.f340938d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340939e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340938d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onDownloadStateChange, ex = %s", e17.getMessage());
        }
    }
}
