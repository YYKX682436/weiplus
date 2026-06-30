package ft1;

/* loaded from: classes10.dex */
public final class p implements c01.p8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ft1.q f266510a;

    public p(ft1.q qVar) {
        this.f266510a = qVar;
    }

    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
        if (str != null) {
            i(str, i17, null);
        }
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, i17, o8Var);
        }
    }

    @Override // c01.p8
    public void d() {
    }

    @Override // c01.p8
    public void e(java.lang.String str) {
    }

    @Override // c01.p8
    public void f(java.lang.String str) {
    }

    @Override // c01.p8
    public void g(java.lang.String str, java.lang.String str2, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, i17, o8Var);
        }
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
    }

    public final void i(java.lang.String str, int i17, c01.o8 o8Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BypGetContactInterceptor", "getContact from server: %s", str);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new ft1.o(this.f266510a, str, i17, o8Var, null), 2, null);
        }
    }
}
