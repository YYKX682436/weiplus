package nw4;

/* loaded from: classes.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340986e;

    public v0(nw4.n nVar, java.lang.String str) {
        this.f340986e = nVar;
        this.f340985d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340986e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340985d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSelectContact fail, ex = %s", e17.getMessage());
        }
    }
}
