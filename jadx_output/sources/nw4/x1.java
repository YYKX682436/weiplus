package nw4;

/* loaded from: classes.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341006e;

    public x1(nw4.n nVar, java.lang.String str) {
        this.f341006e = nVar;
        this.f341005d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341006e.f340887a.evaluateJavascript(this.f341005d, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, ex = %s", e17.getMessage());
        }
    }
}
