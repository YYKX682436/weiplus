package cw2;

/* loaded from: classes15.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f224085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f224086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f224087f;

    public w5(cw2.z5 z5Var, cw2.d6 d6Var, boolean z17) {
        this.f224085d = z5Var;
        this.f224086e = d6Var;
        this.f224087f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.z5 z5Var = this.f224085d;
        java.util.Objects.toString(z5Var);
        cw2.d6 d6Var = this.f224086e;
        java.util.Objects.toString(d6Var);
        if (this.f224087f) {
            d6Var.f223647a.quit();
            for (cw2.b6 b6Var : d6Var.f223651e) {
                b6Var.f223598d = null;
                b6Var.f223597c.a();
                b6Var.f223596b.release();
            }
            d6Var.f223649c.release();
        } else {
            long j17 = z5Var.f224136d;
            if (j17 != 0) {
                d6Var.f223649c.releaseSwapChain(j17);
                z5Var.f224136d = 0L;
            }
            cw2.b6 b6Var2 = z5Var.f224135c;
            if (b6Var2 != null) {
                d6Var.getClass();
                b6Var2.f223598d = null;
                d6Var.f223651e.push(b6Var2);
            }
            z5Var.f224135c = null;
            cw2.c6 c6Var = z5Var.f224134b;
            if (c6Var != null) {
                java.util.HashMap hashMap = d6Var.f223650d;
                int i17 = c6Var.f223617a;
                java.util.Stack stack = (java.util.Stack) hashMap.get(java.lang.Integer.valueOf(i17));
                if (stack == null) {
                    stack = new java.util.Stack();
                    hashMap.put(java.lang.Integer.valueOf(i17), stack);
                }
                stack.push(java.lang.Long.valueOf(c6Var.f223618b));
            }
            z5Var.f224134b = null;
        }
        java.util.Objects.toString(z5Var);
        java.util.Objects.toString(d6Var);
    }
}
