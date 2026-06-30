package nw4;

/* loaded from: classes.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340937e;

    public o1(nw4.n nVar, java.lang.String str) {
        this.f340937e = nVar;
        this.f340936d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340937e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340936d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady fail, ex = %s", e17.getMessage());
        }
    }
}
