package nw4;

/* loaded from: classes.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341002e;

    public x(nw4.n nVar, java.lang.String str) {
        this.f341002e = nVar;
        this.f341001d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341002e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f341001d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onActivityStateChanged, ex = %s", e17.getMessage());
        }
    }
}
