package nw4;

/* loaded from: classes.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340825e;

    public e0(nw4.n nVar, java.lang.String str) {
        this.f340825e = nVar;
        this.f340824d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340825e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340824d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, ex = %s", e17.getMessage());
        }
    }
}
