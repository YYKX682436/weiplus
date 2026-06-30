package nw4;

/* loaded from: classes.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341023e;

    public z0(nw4.n nVar, java.lang.String str) {
        this.f341023e = nVar;
        this.f341022d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341023e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f341022d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchDataReady fail, ex = %s", e17.getMessage());
        }
    }
}
