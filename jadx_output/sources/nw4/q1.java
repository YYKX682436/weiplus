package nw4;

/* loaded from: classes.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340950e;

    public q1(nw4.n nVar, java.lang.String str) {
        this.f340950e = nVar;
        this.f340949d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340950e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340949d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onEmoticonIsChosen fail, ex = %s", e17.getMessage());
        }
    }
}
