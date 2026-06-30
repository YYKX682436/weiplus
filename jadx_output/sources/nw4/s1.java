package nw4;

/* loaded from: classes.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340967e;

    public s1(nw4.n nVar, java.lang.String str) {
        this.f340967e = nVar;
        this.f340966d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340967e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340966d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchGuideDataReady fail, ex = %s", e17.getMessage());
        }
    }
}
