package nw4;

/* loaded from: classes.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341009e;

    public y0(nw4.n nVar, java.lang.String str) {
        this.f341009e = nVar;
        this.f341008d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341009e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f341008d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, ex = %s", e17.getMessage());
        }
    }
}
