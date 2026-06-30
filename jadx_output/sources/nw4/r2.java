package nw4;

/* loaded from: classes8.dex */
public class r2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f340959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f340960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f340961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.v2 f340962d;

    public r2(nw4.v2 v2Var, long j17, long j18, boolean z17) {
        this.f340962d = v2Var;
        this.f340959a = j17;
        this.f340960b = j18;
        this.f340961c = z17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f340959a;
        long j18 = currentTimeMillis - j17;
        long j19 = j17 - this.f340960b;
        ax4.a.d(81, j18);
        ax4.a.d(79, j17 - j19);
        if (str != null && str.contains("succ")) {
            ax4.a.c(85);
        }
        if (j18 > 5000) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            boolean z17 = this.f340961c;
            com.tencent.mars.xlog.Log.w("MicroMsg.JsLoader", "loadJavaScript is too slow, cost %d, isXWeb %b", valueOf, java.lang.Boolean.valueOf(z17));
            ax4.a.c(z17 ? 95 : 96);
        }
        nw4.n nVar = this.f340962d.f340991b;
        if (nVar != null) {
            nVar.f340905s = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsLoader", "loadJavaScript with WebCodeCache, evaluateJavascript cb, ret: %s, ccCost: %dms, cpCost: %dms", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
    }
}
