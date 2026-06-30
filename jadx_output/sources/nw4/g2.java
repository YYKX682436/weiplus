package nw4;

/* loaded from: classes.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340844e;

    public g2(nw4.n nVar, java.lang.String str) {
        this.f340844e = nVar;
        this.f340843d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340844e.f340887a;
            if (mMWebView != null) {
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340843d + ")", null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "eval onMiniProgramData, ex = %s", e17);
        }
    }
}
