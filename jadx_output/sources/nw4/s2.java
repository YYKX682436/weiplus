package nw4;

/* loaded from: classes8.dex */
public class s2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f340968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f340969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.v2 f340970c;

    public s2(nw4.v2 v2Var, long j17, boolean z17) {
        this.f340970c = v2Var;
        this.f340968a = j17;
        this.f340969b = z17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f340968a;
        ax4.a.d(80, currentTimeMillis);
        if (str != null && str.contains("succ")) {
            ax4.a.c(83);
        }
        if (currentTimeMillis > 5000) {
            java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
            boolean z17 = this.f340969b;
            com.tencent.mars.xlog.Log.w("MicroMsg.JsLoader", "loadJavaScript is too slow, cost %d, isXWeb %b", valueOf, java.lang.Boolean.valueOf(z17));
            ax4.a.c(z17 ? 95 : 96);
        }
        nw4.n nVar = this.f340970c.f340991b;
        if (nVar != null) {
            nVar.f340905s = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsLoader", "loadJavaScript, evaluateJavascript cb, ret: %s, cost: %dms", str, java.lang.Long.valueOf(currentTimeMillis));
    }
}
