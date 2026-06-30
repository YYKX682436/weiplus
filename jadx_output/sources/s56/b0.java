package s56;

/* loaded from: classes16.dex */
public class b0 extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Thread f403189h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s56.c0 f403190i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s56.c0 c0Var, p56.r rVar, java.lang.Thread thread) {
        super(rVar, true);
        this.f403190i = c0Var;
        this.f403189h = thread;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        this.f403190i.f403192d.a(obj);
    }

    @Override // p56.r
    public void g(p56.n nVar) {
        this.f403190i.f403192d.g(new s56.a0(this, nVar));
    }

    @Override // p56.m
    public void onCompleted() {
        s56.c0 c0Var = this.f403190i;
        try {
            c0Var.f403192d.onCompleted();
        } finally {
            c0Var.f403193e.c();
        }
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        s56.c0 c0Var = this.f403190i;
        try {
            c0Var.f403192d.onError(th6);
        } finally {
            c0Var.f403193e.c();
        }
    }
}
