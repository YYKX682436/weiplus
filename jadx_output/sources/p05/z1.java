package p05;

/* loaded from: classes10.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f350740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f350741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p05.w0 w0Var, p05.d2 d2Var) {
        super(0);
        this.f350740d = w0Var;
        this.f350741e = d2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#oldWayAppend begin ");
        p05.w0 w0Var = this.f350740d;
        sb6.append(w0Var);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", sb6.toString());
        p05.d2 d2Var = this.f350741e;
        if (!d2Var.f350487b) {
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "This effect is not attached!");
        }
        if (d2Var.f350487b) {
            java.util.Iterator it = d2Var.f350491f.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                p05.s1 s1Var = (p05.s1) next;
                if (java.lang.System.currentTimeMillis() - s1Var.f350686f > 8000) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#sdkResponseTimeoutCheck ptr=");
                    long j18 = s1Var.f350681a;
                    sb7.append(j18);
                    sb7.append(" lastmod=");
                    sb7.append(s1Var.f350686f);
                    com.tencent.mars.xlog.Log.e("FinderLivePkGiftEffect", sb7.toString());
                    rh0.d0 d0Var = d2Var.f350488c;
                    if (d0Var != null) {
                        ((p05.l4) d0Var).t(j18);
                    }
                    it.remove();
                }
            }
            rh0.d0 d0Var2 = d2Var.f350488c;
            if (d0Var2 != null) {
                j17 = ((p05.l4) d0Var2).d(w0Var.f350717b + "/Lua");
            } else {
                j17 = -1;
            }
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#oldWayAppend " + w0Var.f350716a + ' ' + w0Var.f350717b + " new gl_ptr is:" + j17);
            if (j17 != -1) {
                d2Var.e(100L, new p05.y1(d2Var, j17, w0Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
