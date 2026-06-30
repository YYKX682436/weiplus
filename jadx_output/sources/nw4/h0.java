package nw4;

/* loaded from: classes.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340846e;

    public h0(nw4.n nVar, java.lang.String str) {
        this.f340846e = nVar;
        this.f340845d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340846e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340845d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange fail, ex = %s", e17.getMessage());
        }
    }
}
