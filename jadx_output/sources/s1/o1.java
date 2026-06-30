package s1;

/* loaded from: classes14.dex */
public abstract class o1 implements s1.y0 {

    /* renamed from: d, reason: collision with root package name */
    public int f402050d;

    /* renamed from: e, reason: collision with root package name */
    public int f402051e;

    /* renamed from: f, reason: collision with root package name */
    public long f402052f = p2.r.a(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public long f402053g = s1.q1.f402073a;

    public abstract void B(long j17, float f17, yz5.l lVar);

    public final void E() {
        this.f402050d = e06.p.f((int) (this.f402052f >> 32), p2.c.j(this.f402053g), p2.c.h(this.f402053g));
        this.f402051e = e06.p.f(p2.q.b(this.f402052f), p2.c.i(this.f402053g), p2.c.g(this.f402053g));
    }

    public final void N(long j17) {
        if (p2.q.a(this.f402052f, j17)) {
            return;
        }
        this.f402052f = j17;
        E();
    }

    public final void O(long j17) {
        if (p2.c.b(this.f402053g, j17)) {
            return;
        }
        this.f402053g = j17;
        E();
    }

    public java.lang.Object g() {
        return null;
    }

    public final long u() {
        int i17 = this.f402050d;
        long j17 = this.f402052f;
        return p2.n.a((i17 - ((int) (j17 >> 32))) / 2, (this.f402051e - p2.q.b(j17)) / 2);
    }

    public int x() {
        return p2.q.b(this.f402052f);
    }

    public int y() {
        return (int) (this.f402052f >> 32);
    }
}
