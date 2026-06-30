package nw4;

/* loaded from: classes.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341021e;

    public z(nw4.n nVar, java.lang.String str) {
        this.f341021e = nVar;
        this.f341020d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341021e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f341020d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, ex = %s", e17.getMessage());
        }
    }
}
