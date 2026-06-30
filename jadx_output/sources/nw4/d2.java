package nw4;

/* loaded from: classes.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340820e;

    public d2(nw4.n nVar, java.lang.String str) {
        this.f340820e = nVar;
        this.f340819d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340820e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340819d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", e17.getMessage());
        }
    }
}
