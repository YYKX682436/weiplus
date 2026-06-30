package yw4;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw4.q f466975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466976e;

    public n(yw4.q qVar, java.lang.String str) {
        this.f466975d = qVar;
        this.f466976e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f466975d.f466980c.evaluateJavascript("javascript:WeixinPrefecherJSBridge._handleMessageFromWeixin(" + this.f466976e + ')', new yw4.m());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherJsApiHandler", e17, "doCallback exception", new java.lang.Object[0]);
        }
    }
}
