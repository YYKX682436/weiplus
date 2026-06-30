package nw4;

/* loaded from: classes.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340799e;

    public b0(nw4.n nVar, java.lang.String str) {
        this.f340799e = nVar;
        this.f340798d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340799e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340798d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onMediaFileUploadProgress fail, ex = %s", e17.getMessage());
        }
    }
}
