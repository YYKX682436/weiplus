package nw4;

/* loaded from: classes.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340998e;

    public w0(nw4.n nVar, java.lang.String str) {
        this.f340998e = nVar;
        this.f340997d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340998e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340997d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, ex = %s", e17.getMessage());
        }
    }
}
