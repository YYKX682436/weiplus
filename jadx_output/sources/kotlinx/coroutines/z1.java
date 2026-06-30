package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class z1 implements java.lang.Runnable, java.lang.Comparable, kotlinx.coroutines.s1, kotlinx.coroutines.internal.t0 {
    private volatile java.lang.Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f310707d;

    /* renamed from: e, reason: collision with root package name */
    public int f310708e = -1;

    public z1(long j17) {
        this.f310707d = j17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17 = this.f310707d - ((kotlinx.coroutines.z1) obj).f310707d;
        if (j17 > 0) {
            return 1;
        }
        return j17 < 0 ? -1 : 0;
    }

    @Override // kotlinx.coroutines.s1
    public final synchronized void dispose() {
        java.lang.Object obj = this._heap;
        kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.d2.f310159a;
        if (obj == l0Var) {
            return;
        }
        kotlinx.coroutines.a2 a2Var = obj instanceof kotlinx.coroutines.a2 ? (kotlinx.coroutines.a2) obj : null;
        if (a2Var != null) {
            synchronized (a2Var) {
                if (h() != null) {
                    a2Var.c(this.f310708e);
                }
            }
        }
        this._heap = l0Var;
    }

    public kotlinx.coroutines.internal.s0 h() {
        java.lang.Object obj = this._heap;
        if (obj instanceof kotlinx.coroutines.internal.s0) {
            return (kotlinx.coroutines.internal.s0) obj;
        }
        return null;
    }

    public final synchronized int i(long j17, kotlinx.coroutines.a2 a2Var, kotlinx.coroutines.b2 b2Var) {
        if (this._heap == kotlinx.coroutines.d2.f310159a) {
            return 2;
        }
        synchronized (a2Var) {
            try {
                kotlinx.coroutines.internal.t0[] t0VarArr = a2Var.f310524a;
                kotlinx.coroutines.z1 z1Var = (kotlinx.coroutines.z1) (t0VarArr != null ? t0VarArr[0] : null);
                if (kotlinx.coroutines.b2.T(b2Var)) {
                    return 1;
                }
                if (z1Var == null) {
                    a2Var.f310134b = j17;
                } else {
                    long j18 = z1Var.f310707d;
                    if (j18 - j17 < 0) {
                        j17 = j18;
                    }
                    if (j17 - a2Var.f310134b > 0) {
                        a2Var.f310134b = j17;
                    }
                }
                long j19 = this.f310707d;
                long j27 = a2Var.f310134b;
                if (j19 - j27 < 0) {
                    this.f310707d = j27;
                }
                a2Var.a(this);
                return 0;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public void j(kotlinx.coroutines.internal.s0 s0Var) {
        if (!(this._heap != kotlinx.coroutines.d2.f310159a)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = s0Var;
    }

    public java.lang.String toString() {
        return "Delayed[nanos=" + this.f310707d + ']';
    }
}
