package r36;

/* loaded from: classes16.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public long f369395a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f369396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369397c;

    /* renamed from: d, reason: collision with root package name */
    public final r36.z f369398d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Deque f369399e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f369400f;

    /* renamed from: g, reason: collision with root package name */
    public final r36.e0 f369401g;

    /* renamed from: h, reason: collision with root package name */
    public final r36.d0 f369402h;

    /* renamed from: i, reason: collision with root package name */
    public final r36.f0 f369403i;

    /* renamed from: j, reason: collision with root package name */
    public final r36.f0 f369404j;

    /* renamed from: k, reason: collision with root package name */
    public r36.b f369405k;

    public g0(int i17, r36.z zVar, boolean z17, boolean z18, l36.i0 i0Var) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f369399e = arrayDeque;
        this.f369403i = new r36.f0(this);
        this.f369404j = new r36.f0(this);
        this.f369405k = null;
        if (zVar == null) {
            throw new java.lang.NullPointerException("connection == null");
        }
        this.f369397c = i17;
        this.f369398d = zVar;
        this.f369396b = zVar.f369489y.a();
        r36.e0 e0Var = new r36.e0(this, zVar.f369488x.a());
        this.f369401g = e0Var;
        r36.d0 d0Var = new r36.d0(this);
        this.f369402h = d0Var;
        e0Var.f369386h = z18;
        d0Var.f369372f = z17;
        if (i0Var != null) {
            arrayDeque.add(i0Var);
        }
        if (e() && i0Var != null) {
            throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!e() && i0Var == null) {
            throw new java.lang.IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public void a() {
        boolean z17;
        boolean f17;
        synchronized (this) {
            r36.e0 e0Var = this.f369401g;
            if (!e0Var.f369386h && e0Var.f369385g) {
                r36.d0 d0Var = this.f369402h;
                if (d0Var.f369372f || d0Var.f369371e) {
                    z17 = true;
                    f17 = f();
                }
            }
            z17 = false;
            f17 = f();
        }
        if (z17) {
            c(r36.b.CANCEL);
        } else {
            if (f17) {
                return;
            }
            this.f369398d.i(this.f369397c);
        }
    }

    public void b() {
        r36.d0 d0Var = this.f369402h;
        if (d0Var.f369371e) {
            throw new java.io.IOException("stream closed");
        }
        if (d0Var.f369372f) {
            throw new java.io.IOException("stream finished");
        }
        if (this.f369405k != null) {
            throw new r36.n0(this.f369405k);
        }
    }

    public void c(r36.b bVar) {
        if (d(bVar)) {
            this.f369398d.A.k(this.f369397c, bVar);
        }
    }

    public final boolean d(r36.b bVar) {
        synchronized (this) {
            if (this.f369405k != null) {
                return false;
            }
            if (this.f369401g.f369386h && this.f369402h.f369372f) {
                return false;
            }
            this.f369405k = bVar;
            notifyAll();
            this.f369398d.i(this.f369397c);
            return true;
        }
    }

    public boolean e() {
        return this.f369398d.f369471d == ((this.f369397c & 1) == 1);
    }

    public synchronized boolean f() {
        if (this.f369405k != null) {
            return false;
        }
        r36.e0 e0Var = this.f369401g;
        if (e0Var.f369386h || e0Var.f369385g) {
            r36.d0 d0Var = this.f369402h;
            if (d0Var.f369372f || d0Var.f369371e) {
                if (this.f369400f) {
                    return false;
                }
            }
        }
        return true;
    }

    public void g() {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }
}
