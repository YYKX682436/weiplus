package qh;

/* loaded from: classes12.dex */
public final class a extends qh.b {

    /* renamed from: p, reason: collision with root package name */
    public final qh.f0 f363281p;

    public a(qh.f0 f0Var) {
        this.f363281p = f0Var;
    }

    @Override // qh.b
    public int c() {
        qh.f0 f0Var = this.f363281p;
        return wh.m.d(f0Var.d(), f0Var.f363343o);
    }

    @Override // qh.b
    public int d() {
        return wh.m.r(this.f363281p.d());
    }

    @Override // qh.b
    public long e() {
        return 0L;
    }

    @Override // qh.b
    public boolean f() {
        return wh.m.v(this.f363281p.d());
    }

    @Override // qh.b
    public boolean g() {
        return wh.m.w(this.f363281p.d());
    }

    @Override // qh.b
    public boolean h() {
        return this.f363281p.f363343o;
    }
}
