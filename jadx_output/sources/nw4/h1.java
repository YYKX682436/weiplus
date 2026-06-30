package nw4;

/* loaded from: classes.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340848e;

    public h1(nw4.n nVar, java.lang.String str) {
        this.f340848e = nVar;
        this.f340847d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340848e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340847d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onFocusSearchInput fail, ex = %s", e17.getMessage());
        }
    }
}
