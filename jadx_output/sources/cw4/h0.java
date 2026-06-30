package cw4;

/* loaded from: classes8.dex */
public final class h0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f224223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224224b;

    public h0(cw4.m0 m0Var, java.lang.String str) {
        this.f224223a = m0Var;
        this.f224224b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        try {
            cl0.e eVar = new cl0.e((java.lang.String) obj);
            int length = eVar.length();
            java.lang.String[] strArr = new java.lang.String[length];
            for (int i17 = 0; i17 < length; i17++) {
                strArr[i17] = eVar.get(i17);
            }
            if (!(length == 0)) {
                cw4.m0 m0Var = this.f224223a;
                m0Var.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new cw4.l0(m0Var, strArr));
                return;
            }
            cw4.m0 m0Var2 = this.f224223a;
            java.lang.String str = this.f224224b;
            if (m0Var2.f224251t >= m0Var2.f224250s) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewTransHelper", "performCyclicTasks finish!");
                return;
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new cw4.j0(m0Var2, str), false);
            long j17 = m0Var2.f224249r * (m0Var2.f224251t + 1);
            b4Var.c(j17, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewTransHelper", e17, "", new java.lang.Object[0]);
        }
    }
}
