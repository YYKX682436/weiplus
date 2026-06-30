package nw4;

/* loaded from: classes.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340809e;

    public c1(nw4.n nVar, java.lang.String str) {
        this.f340809e = nVar;
        this.f340808d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340809e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340808d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onNavBarShadowManuallyHidden fail, ex = %s", e17.getMessage());
        }
    }
}
