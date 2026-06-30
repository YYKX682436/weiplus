package nw4;

/* loaded from: classes.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340840e;

    public g0(nw4.n nVar, java.lang.String str) {
        this.f340840e = nVar;
        this.f340839d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340840e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340839d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVideoUploadoadProgress fail, ex = %s", e17.getMessage());
        }
    }
}
