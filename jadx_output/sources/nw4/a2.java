package nw4;

/* loaded from: classes.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340796e;

    public a2(nw4.n nVar, java.lang.String str) {
        this.f340796e = nVar;
        this.f340795d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340796e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340795d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, ex = %s", e17.getMessage());
        }
    }
}
