package nw4;

/* loaded from: classes8.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340868e;

    public k1(nw4.n nVar, java.lang.String str) {
        this.f340868e = nVar;
        this.f340867d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340868e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340867d + ")", new nw4.j1(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish fail, ex = %s", e17.getMessage());
        }
    }
}
