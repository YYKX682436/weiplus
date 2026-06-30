package s56;

/* loaded from: classes16.dex */
public class a0 implements p56.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p56.n f403186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s56.b0 f403187e;

    public a0(s56.b0 b0Var, p56.n nVar) {
        this.f403187e = b0Var;
        this.f403186d = nVar;
    }

    @Override // p56.n
    public void d(long j17) {
        s56.b0 b0Var = this.f403187e;
        if (b0Var.f403189h == java.lang.Thread.currentThread()) {
            this.f403186d.d(j17);
        } else {
            b0Var.f403190i.f403193e.d(new s56.z(this, j17));
        }
    }
}
