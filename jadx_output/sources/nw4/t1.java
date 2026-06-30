package nw4;

/* loaded from: classes.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340974e;

    public t1(nw4.n nVar, java.lang.String str) {
        this.f340974e = nVar;
        this.f340973d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340974e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340973d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onUxOplogDataReady fail, ex = %s", e17.getMessage());
        }
    }
}
