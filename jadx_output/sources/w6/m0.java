package w6;

/* loaded from: classes13.dex */
public class m0 implements w6.m, r7.f {
    public static final w6.j0 E = new w6.j0();
    public boolean A;
    public w6.r0 B;
    public w6.t C;
    public volatile boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final w6.l0 f443152d;

    /* renamed from: e, reason: collision with root package name */
    public final r7.k f443153e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.q0 f443154f;

    /* renamed from: g, reason: collision with root package name */
    public final m3.e f443155g;

    /* renamed from: h, reason: collision with root package name */
    public final w6.j0 f443156h;

    /* renamed from: i, reason: collision with root package name */
    public final w6.n0 f443157i;

    /* renamed from: m, reason: collision with root package name */
    public final z6.e f443158m;

    /* renamed from: n, reason: collision with root package name */
    public final z6.e f443159n;

    /* renamed from: o, reason: collision with root package name */
    public final z6.e f443160o;

    /* renamed from: p, reason: collision with root package name */
    public final z6.e f443161p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f443162q;

    /* renamed from: r, reason: collision with root package name */
    public t6.h f443163r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f443164s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f443165t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f443166u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f443167v;

    /* renamed from: w, reason: collision with root package name */
    public w6.z0 f443168w;

    /* renamed from: x, reason: collision with root package name */
    public t6.a f443169x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f443170y;

    /* renamed from: z, reason: collision with root package name */
    public w6.t0 f443171z;

    public m0(z6.e eVar, z6.e eVar2, z6.e eVar3, z6.e eVar4, w6.n0 n0Var, w6.q0 q0Var, m3.e eVar5) {
        w6.j0 j0Var = E;
        this.f443152d = new w6.l0(new java.util.ArrayList(2));
        this.f443153e = new r7.j();
        this.f443162q = new java.util.concurrent.atomic.AtomicInteger();
        this.f443158m = eVar;
        this.f443159n = eVar2;
        this.f443160o = eVar3;
        this.f443161p = eVar4;
        this.f443157i = n0Var;
        this.f443154f = q0Var;
        this.f443155g = eVar5;
        this.f443156h = j0Var;
    }

    public synchronized void a(m7.f fVar, java.util.concurrent.Executor executor) {
        this.f443153e.a();
        w6.l0 l0Var = this.f443152d;
        l0Var.getClass();
        l0Var.f443151d.add(new w6.k0(fVar, executor));
        boolean z17 = true;
        if (this.f443170y) {
            d(1);
            executor.execute(new w6.i0(this, fVar));
        } else if (this.A) {
            d(1);
            executor.execute(new w6.h0(this, fVar));
        } else {
            if (this.D) {
                z17 = false;
            }
            q7.n.a(z17, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public void b() {
        if (e()) {
            return;
        }
        this.D = true;
        w6.t tVar = this.C;
        tVar.K = true;
        w6.k kVar = tVar.I;
        if (kVar != null) {
            kVar.cancel();
        }
        w6.n0 n0Var = this.f443157i;
        t6.h hVar = this.f443163r;
        w6.g0 g0Var = (w6.g0) n0Var;
        synchronized (g0Var) {
            w6.v0 v0Var = g0Var.f443115a;
            v0Var.getClass();
            java.util.Map map = this.f443167v ? v0Var.f443242b : v0Var.f443241a;
            if (equals(map.get(hVar))) {
                map.remove(hVar);
            }
        }
    }

    public void c() {
        w6.r0 r0Var;
        synchronized (this) {
            this.f443153e.a();
            q7.n.a(e(), "Not yet complete!");
            int decrementAndGet = this.f443162q.decrementAndGet();
            q7.n.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                r0Var = this.B;
                f();
            } else {
                r0Var = null;
            }
        }
        if (r0Var != null) {
            r0Var.c();
        }
    }

    public synchronized void d(int i17) {
        w6.r0 r0Var;
        q7.n.a(e(), "Not yet complete!");
        if (this.f443162q.getAndAdd(i17) == 0 && (r0Var = this.B) != null) {
            r0Var.b();
        }
    }

    public final boolean e() {
        return this.A || this.f443170y || this.D;
    }

    public final synchronized void f() {
        boolean a17;
        if (this.f443163r == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f443152d.f443151d.clear();
        this.f443163r = null;
        this.B = null;
        this.f443168w = null;
        this.A = false;
        this.D = false;
        this.f443170y = false;
        w6.t tVar = this.C;
        w6.q qVar = tVar.f443216m;
        synchronized (qVar) {
            qVar.f443186a = true;
            a17 = qVar.a(false);
        }
        if (a17) {
            tVar.o();
        }
        this.C = null;
        this.f443171z = null;
        this.f443169x = null;
        this.f443155g.b(this);
    }

    public synchronized void g(m7.f fVar) {
        boolean z17;
        this.f443153e.a();
        w6.l0 l0Var = this.f443152d;
        l0Var.getClass();
        l0Var.f443151d.remove(new w6.k0(fVar, q7.i.f360299b));
        if (this.f443152d.f443151d.isEmpty()) {
            b();
            if (!this.f443170y && !this.A) {
                z17 = false;
                if (z17 && this.f443162q.get() == 0) {
                    f();
                }
            }
            z17 = true;
            if (z17) {
                f();
            }
        }
    }

    @Override // r7.f
    public r7.k h() {
        return this.f443153e;
    }
}
