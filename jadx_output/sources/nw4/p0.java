package nw4;

/* loaded from: classes.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340941e;

    public p0(nw4.n nVar, java.lang.String str) {
        this.f340941e = nVar;
        this.f340940d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340941e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340940d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetSmiley fail, ex = %s", e17.getMessage());
        }
    }
}
