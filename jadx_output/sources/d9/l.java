package d9;

/* loaded from: classes15.dex */
public final class l implements d9.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final d9.i0[] f227373d;

    public l(d9.i0[] i0VarArr) {
        this.f227373d = i0VarArr;
    }

    @Override // d9.i0
    public final boolean h(long j17) {
        boolean z17;
        boolean z18 = false;
        do {
            long n17 = n();
            if (n17 == Long.MIN_VALUE) {
                break;
            }
            z17 = false;
            for (d9.i0 i0Var : this.f227373d) {
                if (i0Var.n() == n17) {
                    z17 |= i0Var.h(j17);
                }
            }
            z18 |= z17;
        } while (z17);
        return z18;
    }

    @Override // d9.i0
    public final long m() {
        long j17 = Long.MAX_VALUE;
        for (d9.i0 i0Var : this.f227373d) {
            long m17 = i0Var.m();
            if (m17 != Long.MIN_VALUE) {
                j17 = java.lang.Math.min(j17, m17);
            }
        }
        if (j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            return Long.MIN_VALUE;
        }
        return j17;
    }

    @Override // d9.i0
    public final long n() {
        long j17 = Long.MAX_VALUE;
        for (d9.i0 i0Var : this.f227373d) {
            long n17 = i0Var.n();
            if (n17 != Long.MIN_VALUE) {
                j17 = java.lang.Math.min(j17, n17);
            }
        }
        if (j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            return Long.MIN_VALUE;
        }
        return j17;
    }
}
