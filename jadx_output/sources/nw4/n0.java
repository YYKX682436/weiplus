package nw4;

/* loaded from: classes.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340926e;

    public n0(nw4.n nVar, java.lang.String str) {
        this.f340926e = nVar;
        this.f340925d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340926e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340925d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetKeyboardHeight fail, ex = %s", e17.getMessage());
        }
    }
}
