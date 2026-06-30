package nw4;

/* loaded from: classes.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340866e;

    public k0(nw4.n nVar, java.lang.String str) {
        this.f340866e = nVar;
        this.f340865d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340866e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340865d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onArticleReadingBtnClicked fail, ex = %s", e17.getMessage());
        }
    }
}
