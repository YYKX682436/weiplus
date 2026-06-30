package nw4;

/* loaded from: classes.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340928e;

    public n1(nw4.n nVar, java.lang.String str) {
        this.f340928e = nVar;
        this.f340927d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340928e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340927d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchInputConfirm fail, ex = %s", e17.getMessage());
        }
    }
}
