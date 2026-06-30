package x0;

/* loaded from: classes14.dex */
public final class h extends x0.m {

    /* renamed from: f, reason: collision with root package name */
    public final x0.m f450893f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f450894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, x0.s invalid, yz5.l lVar, x0.m parent) {
        super(i17, invalid, null);
        kotlin.jvm.internal.o.g(invalid, "invalid");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f450893f = parent;
        parent.j(this);
        if (lVar != null) {
            yz5.l f17 = parent.f();
            if (f17 != null) {
                lVar = new x0.g(lVar, f17);
            }
        } else {
            lVar = parent.f();
        }
        this.f450894g = lVar;
    }

    @Override // x0.m
    public void c() {
        if (this.f450910c) {
            return;
        }
        int i17 = this.f450909b;
        x0.m mVar = this.f450893f;
        if (i17 != mVar.d()) {
            a();
        }
        mVar.k(this);
        this.f450910c = true;
        synchronized (x0.z.f450963b) {
            int i18 = this.f450911d;
            if (i18 >= 0) {
                x0.z.s(i18);
                this.f450911d = -1;
            }
        }
    }

    @Override // x0.m
    public yz5.l f() {
        return this.f450894g;
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
        x0.m0.a();
        throw null;
    }

    @Override // x0.m
    public void k(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
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
        return new x0.h(this.f450909b, this.f450908a, lVar, this.f450893f);
    }
}
