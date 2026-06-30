package s56;

/* loaded from: classes16.dex */
public final class g0 implements p56.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f403213a;

    public g0(int i17) {
        if (i17 >= 0) {
            this.f403213a = i17;
        } else {
            throw new java.lang.IllegalArgumentException("limit >= 0 required but it was " + i17);
        }
    }

    @Override // r56.e
    public java.lang.Object call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        s56.f0 f0Var = new s56.f0(this, rVar);
        if (this.f403213a == 0) {
            rVar.onCompleted();
            f0Var.c();
        }
        rVar.d(f0Var);
        return f0Var;
    }
}
