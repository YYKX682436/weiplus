package m8;

/* loaded from: classes15.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final m8.k0 f324674a = new m8.k0();

    /* renamed from: b, reason: collision with root package name */
    public final m8.l0 f324675b = new m8.l0();

    /* renamed from: c, reason: collision with root package name */
    public m8.m0 f324676c;

    /* renamed from: d, reason: collision with root package name */
    public int f324677d;

    public final m8.v a(d9.z zVar, long j17, long j18) {
        m8.m0 m0Var = this.f324676c;
        int i17 = zVar.f227427a;
        m8.k0 k0Var = this.f324674a;
        m0Var.c(i17, k0Var);
        if (!zVar.a()) {
            int a17 = k0Var.a(j18);
            return c(zVar.f227427a, j18, a17 == -1 ? Long.MIN_VALUE : k0Var.f324600f[a17]);
        }
        int i18 = zVar.f227428b;
        int i19 = zVar.f227429c;
        if (i19 < k0Var.f324602h[i18]) {
            return b(zVar.f227427a, i18, i19, j17);
        }
        return null;
    }

    public final m8.v b(int i17, int i18, int i19, long j17) {
        d9.z zVar = new d9.z(i17, i18, i19);
        boolean e17 = e(zVar, Long.MIN_VALUE);
        boolean f17 = f(zVar, e17);
        m8.m0 m0Var = this.f324676c;
        m8.k0 k0Var = this.f324674a;
        long[] jArr = m0Var.d(i17, k0Var, false).f324604j[i18];
        return new m8.v(zVar, i19 == k0Var.f324603i[i18] ? k0Var.f324605k : 0L, Long.MIN_VALUE, j17, i19 >= jArr.length ? -9223372036854775807L : jArr[i19], e17, f17);
    }

    public final m8.v c(int i17, long j17, long j18) {
        d9.z zVar = new d9.z(i17, -1, -1);
        boolean e17 = e(zVar, j18);
        boolean f17 = f(zVar, e17);
        m8.m0 m0Var = this.f324676c;
        m8.k0 k0Var = this.f324674a;
        m0Var.c(i17, k0Var);
        return new m8.v(zVar, j17, j18, -9223372036854775807L, j18 == Long.MIN_VALUE ? k0Var.f324598d : j18, e17, f17);
    }

    public final m8.v d(m8.v vVar, d9.z zVar) {
        long j17;
        long j18;
        long j19 = vVar.f324668b;
        long j27 = vVar.f324669c;
        boolean e17 = e(zVar, j27);
        boolean f17 = f(zVar, e17);
        m8.m0 m0Var = this.f324676c;
        int i17 = zVar.f227427a;
        m8.k0 k0Var = this.f324674a;
        m0Var.c(i17, k0Var);
        if (zVar.a()) {
            long[] jArr = k0Var.f324604j[zVar.f227428b];
            int length = jArr.length;
            int i18 = zVar.f227429c;
            j18 = i18 >= length ? -9223372036854775807L : jArr[i18];
        } else {
            if (j27 != Long.MIN_VALUE) {
                j17 = j27;
                return new m8.v(zVar, j19, j27, vVar.f324670d, j17, e17, f17);
            }
            j18 = k0Var.f324598d;
        }
        j17 = j18;
        return new m8.v(zVar, j19, j27, vVar.f324670d, j17, e17, f17);
    }

    public final boolean e(d9.z zVar, long j17) {
        boolean z17;
        m8.m0 m0Var = this.f324676c;
        int i17 = zVar.f227427a;
        m8.k0 k0Var = this.f324674a;
        long[] jArr = m0Var.d(i17, k0Var, false).f324600f;
        int length = jArr == null ? 0 : jArr.length;
        if (length == 0) {
            return true;
        }
        int i18 = length - 1;
        boolean a17 = zVar.a();
        if (k0Var.f324600f[i18] != Long.MIN_VALUE) {
            return !a17 && j17 == Long.MIN_VALUE;
        }
        int i19 = k0Var.f324601g[i18];
        if (i19 == -1) {
            return false;
        }
        if (a17 && zVar.f227428b == i18) {
            if (zVar.f227429c == i19 - 1) {
                z17 = true;
                return !z17 || (!a17 && k0Var.f324603i[i18] == i19);
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final boolean f(d9.z zVar, boolean z17) {
        m8.m0 m0Var = this.f324676c;
        int i17 = zVar.f227427a;
        m8.k0 k0Var = this.f324674a;
        int i18 = m0Var.d(i17, k0Var, false).f324597c;
        m8.m0 m0Var2 = this.f324676c;
        m8.l0 l0Var = this.f324675b;
        if (m0Var2.g(i18, l0Var).f324624b) {
            return false;
        }
        return (this.f324676c.b(zVar.f227427a, k0Var, l0Var, this.f324677d) == -1) && z17;
    }

    public d9.z g(int i17, long j17) {
        m8.m0 m0Var = this.f324676c;
        m8.k0 k0Var = this.f324674a;
        m0Var.c(i17, k0Var);
        int b17 = k0Var.b(j17);
        return b17 == -1 ? new d9.z(i17, -1, -1) : new d9.z(i17, b17, k0Var.f324603i[b17]);
    }
}
