package x0;

/* loaded from: classes14.dex */
public final class j extends x0.m {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f450897f;

    /* renamed from: g, reason: collision with root package name */
    public int f450898g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, x0.s invalid, yz5.l lVar) {
        super(i17, invalid, null);
        kotlin.jvm.internal.o.g(invalid, "invalid");
        this.f450897f = lVar;
        this.f450898g = 1;
    }

    @Override // x0.m
    public void c() {
        if (this.f450910c) {
            return;
        }
        k(this);
        this.f450910c = true;
        synchronized (x0.z.f450963b) {
            int i17 = this.f450911d;
            if (i17 >= 0) {
                x0.z.s(i17);
                this.f450911d = -1;
            }
        }
    }

    @Override // x0.m
    public yz5.l f() {
        return this.f450897f;
    }

    @Override // x0.m
    public boolean g() {
        return true;
    }

    @Override // x0.m
    public yz5.l h() {
        return null;
    }

    @Override // x0.m
    public void j(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        this.f450898g++;
    }

    @Override // x0.m
    public void k(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        int i17 = this.f450898g - 1;
        this.f450898g = i17;
        if (i17 == 0) {
            a();
        }
    }

    @Override // x0.m
    public void l() {
    }

    @Override // x0.m
    public void m(x0.z0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        n0.c5 c5Var = x0.z.f450962a;
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // x0.m
    public x0.m r(yz5.l lVar) {
        x0.z.d(this);
        return new x0.h(this.f450909b, this.f450908a, lVar, this);
    }
}
