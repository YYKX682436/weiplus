package nw4;

/* loaded from: classes.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341000e;

    public w1(nw4.n nVar, java.lang.String str) {
        this.f341000e = nVar;
        this.f340999d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341000e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340999d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onMusicStatusChanged fail, ex = %s", e17.getMessage());
        }
    }
}
