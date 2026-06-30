package nw4;

/* loaded from: classes.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340807e;

    public c0(nw4.n nVar, java.lang.String str) {
        this.f340807e = nVar;
        this.f340806d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340807e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340806d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onLocalImageUploadProgress fail, ex = %s", e17.getMessage());
        }
    }
}
