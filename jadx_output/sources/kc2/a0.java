package kc2;

/* loaded from: classes15.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f306311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f306312e;

    public a0(kc2.c0 c0Var, r45.vs2 vs2Var) {
        this.f306311d = c0Var;
        this.f306312e = vs2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.c0 c0Var = this.f306311d;
        c0Var.f306348r = e17;
        kc2.h1.f306405a.b(c0Var.g(), c0Var.f306346p, c0Var.f306348r, c0Var.f306347q);
        if (((java.lang.Boolean) ((jz5.n) c0Var.f306337g).getValue()).booleanValue()) {
            java.lang.String m17 = c0Var.m();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRedDotExpose $");
            r45.vs2 vs2Var = this.f306312e;
            sb6.append(vs2Var != null ? vs2Var.f388503x : null);
            sb6.append(" add lastRedDotExposeTime=");
            sb6.append(c0Var.f306348r);
            com.tencent.mars.xlog.Log.i(m17, sb6.toString());
        }
        kc2.a2.a(c0Var.j(), c0Var.f306348r, false, 2, null);
    }
}
