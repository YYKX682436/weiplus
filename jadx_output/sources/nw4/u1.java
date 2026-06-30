package nw4;

/* loaded from: classes.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340982f;

    public u1(nw4.n nVar, java.lang.String str, java.lang.String str2) {
        this.f340982f = nVar;
        this.f340980d = str;
        this.f340981e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340982f.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340980d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "%s fail, ex = %s", this.f340981e, e17.getMessage());
        }
    }
}
