package kl4;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f308912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.lq0 f308913f;

    public h0(kl4.k0 k0Var, int i17, bw5.lq0 lq0Var) {
        this.f308911d = k0Var;
        this.f308912e = i17;
        this.f308913f = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jm4.n4 n4Var = this.f308911d.f308943u;
        kotlin.jvm.internal.o.d(n4Var);
        urgen.ur_0025.UR_8267.UR_A155(((jm4.o4) n4Var).getCppPointer(), this.f308912e, this.f308913f.f29930d);
    }
}
