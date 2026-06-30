package nw4;

/* loaded from: classes.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340827e;

    public e1(nw4.n nVar, java.lang.String str) {
        this.f340827e = nVar;
        this.f340826d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340827e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340826d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData fail, ex = %s", e17.getMessage());
        }
    }
}
