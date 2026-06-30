package d9;

/* loaded from: classes15.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final d9.l0 f227374d = new d9.l0(new d9.k0[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f227375a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.k0[] f227376b;

    /* renamed from: c, reason: collision with root package name */
    public int f227377c;

    public l0(d9.k0... k0VarArr) {
        this.f227376b = k0VarArr;
        this.f227375a = k0VarArr.length;
    }

    public int a(d9.k0 k0Var) {
        for (int i17 = 0; i17 < this.f227375a; i17++) {
            if (this.f227376b[i17] == k0Var) {
                return i17;
            }
        }
        return -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.l0.class != obj.getClass()) {
            return false;
        }
        d9.l0 l0Var = (d9.l0) obj;
        return this.f227375a == l0Var.f227375a && java.util.Arrays.equals(this.f227376b, l0Var.f227376b);
    }

    public int hashCode() {
        if (this.f227377c == 0) {
            this.f227377c = java.util.Arrays.hashCode(this.f227376b);
        }
        return this.f227377c;
    }
}
