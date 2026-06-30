package nw4;

/* loaded from: classes.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340958e;

    public r1(nw4.n nVar, java.lang.String str) {
        this.f340958e = nVar;
        this.f340957d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340958e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340957d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, ex = %s", e17.getMessage());
        }
    }
}
