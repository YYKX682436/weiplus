package nw4;

/* loaded from: classes.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340852e;

    public i1(nw4.n nVar, java.lang.String str) {
        this.f340852e = nVar;
        this.f340851d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340852e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340851d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback fail, ex = %s", e17.getMessage());
        }
    }
}
