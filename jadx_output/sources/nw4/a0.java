package nw4;

/* loaded from: classes.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340792e;

    public a0(nw4.n nVar, java.lang.String str) {
        this.f340792e = nVar;
        this.f340791d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340792e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340791d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoiceRecordEnd fail, ex = %s", e17.getMessage());
        }
    }
}
