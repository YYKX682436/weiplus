package nw4;

/* loaded from: classes.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340979e;

    public u0(nw4.n nVar, java.lang.String str) {
        this.f340979e = nVar;
        this.f340978d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340979e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340978d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "doCallback, ex = %s", e17.getMessage());
        }
    }
}
