package s56;

/* loaded from: classes16.dex */
public class f0 extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public int f403209h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f403210i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p56.r f403211m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s56.g0 f403212n;

    public f0(s56.g0 g0Var, p56.r rVar) {
        this.f403212n = g0Var;
        this.f403211m = rVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        if (this.f352103d.f424839e) {
            return;
        }
        int i17 = this.f403209h;
        int i18 = i17 + 1;
        this.f403209h = i18;
        int i19 = this.f403212n.f403213a;
        if (i17 < i19) {
            boolean z17 = i18 == i19;
            this.f403211m.a(obj);
            if (!z17 || this.f403210i) {
                return;
            }
            this.f403210i = true;
            try {
                this.f403211m.onCompleted();
            } finally {
                c();
            }
        }
    }

    @Override // p56.r
    public void g(p56.n nVar) {
        this.f403211m.g(new s56.e0(this, nVar));
    }

    @Override // p56.m
    public void onCompleted() {
        if (this.f403210i) {
            return;
        }
        this.f403210i = true;
        this.f403211m.onCompleted();
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        if (this.f403210i) {
            return;
        }
        this.f403210i = true;
        try {
            this.f403211m.onError(th6);
        } finally {
            c();
        }
    }
}
