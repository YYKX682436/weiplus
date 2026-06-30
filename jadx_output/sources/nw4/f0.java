package nw4;

/* loaded from: classes.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340835e;

    public f0(nw4.n nVar, java.lang.String str) {
        this.f340835e = nVar;
        this.f340834d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340835e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340834d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoiceDownloadProgress fail, ex = %s", e17.getMessage());
        }
    }
}
