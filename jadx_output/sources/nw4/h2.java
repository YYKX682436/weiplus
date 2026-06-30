package nw4;

/* loaded from: classes.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340850e;

    public h2(nw4.n nVar, java.lang.String str) {
        this.f340850e = nVar;
        this.f340849d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340850e.f340887a;
            if (mMWebView != null) {
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340849d + ")", null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "eval onMiniProgramData, ex = %s", e17);
        }
    }
}
