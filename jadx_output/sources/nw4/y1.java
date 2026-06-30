package nw4;

/* loaded from: classes.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341011e;

    public y1(nw4.n nVar, java.lang.String str) {
        this.f341011e = nVar;
        this.f341010d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f341011e.f340887a.evaluateJavascript(this.f341010d, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, ex = %s", e17.getMessage());
        }
    }
}
