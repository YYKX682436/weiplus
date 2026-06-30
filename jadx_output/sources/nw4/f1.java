package nw4;

/* loaded from: classes.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340837e;

    public f1(nw4.n nVar, java.lang.String str) {
        this.f340837e = nVar;
        this.f340836d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340837e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340836d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onChatSearchDataReady fail, ex = %s", e17.getMessage());
        }
    }
}
