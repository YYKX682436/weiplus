package nw4;

/* loaded from: classes.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341025e;

    public z1(nw4.n nVar, java.lang.String str) {
        this.f341025e = nVar;
        this.f341024d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341025e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f341024d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, ex = %s", e17.getMessage());
        }
    }
}
