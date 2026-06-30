package nw4;

/* loaded from: classes.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340874e;

    public l0(nw4.n nVar, java.lang.String str) {
        this.f340874e = nVar;
        this.f340873d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340874e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340873d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onNfcTouch fail, ex = %s", e17.getMessage());
        }
    }
}
