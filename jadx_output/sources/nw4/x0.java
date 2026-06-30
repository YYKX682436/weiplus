package nw4;

/* loaded from: classes.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341004e;

    public x0(nw4.n nVar, java.lang.String str) {
        this.f341004e = nVar;
        this.f341003d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341004e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f341003d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetMatchContactList fail, ex = %s", e17.getMessage());
        }
    }
}
