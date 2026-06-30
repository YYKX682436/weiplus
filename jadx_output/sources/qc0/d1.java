package qc0;

/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f361363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f361364b;

    /* renamed from: c, reason: collision with root package name */
    public final float f361365c;

    /* renamed from: d, reason: collision with root package name */
    public final long f361366d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361367e;

    /* renamed from: f, reason: collision with root package name */
    public final int f361368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f361369g;

    /* renamed from: h, reason: collision with root package name */
    public final int f361370h;

    /* renamed from: i, reason: collision with root package name */
    public final int f361371i;

    /* renamed from: j, reason: collision with root package name */
    public final int f361372j;

    /* renamed from: k, reason: collision with root package name */
    public final int f361373k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.b f361374l;

    public d1(int i17, int i18, float f17, long j17, int i19, int i27, boolean z17, int i28, int i29, int i37, int i38) {
        this.f361363a = i17;
        this.f361364b = i18;
        this.f361365c = f17;
        this.f361366d = j17;
        this.f361367e = i19;
        this.f361368f = i27;
        this.f361369g = z17;
        this.f361370h = i28;
        this.f361371i = i29;
        this.f361372j = i37;
        this.f361373k = i38;
    }

    public final boolean a() {
        return this.f361363a > 0 && this.f361364b > 0 && this.f361366d > 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.d1)) {
            return false;
        }
        qc0.d1 d1Var = (qc0.d1) obj;
        return this.f361363a == d1Var.f361363a && this.f361364b == d1Var.f361364b && java.lang.Float.compare(this.f361365c, d1Var.f361365c) == 0 && this.f361366d == d1Var.f361366d && this.f361367e == d1Var.f361367e && this.f361368f == d1Var.f361368f && this.f361369g == d1Var.f361369g && this.f361370h == d1Var.f361370h && this.f361371i == d1Var.f361371i && this.f361372j == d1Var.f361372j && this.f361373k == d1Var.f361373k;
    }

    public int hashCode() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f361363a) * 31) + java.lang.Integer.hashCode(this.f361364b)) * 31) + java.lang.Float.hashCode(this.f361365c)) * 31) + java.lang.Long.hashCode(this.f361366d)) * 31) + java.lang.Integer.hashCode(this.f361367e)) * 31) + java.lang.Integer.hashCode(this.f361368f)) * 31) + java.lang.Boolean.hashCode(this.f361369g)) * 31) + java.lang.Integer.hashCode(this.f361370h)) * 31) + java.lang.Integer.hashCode(this.f361371i)) * 31) + java.lang.Integer.hashCode(this.f361372j)) * 31) + java.lang.Integer.hashCode(this.f361373k);
    }

    public java.lang.String toString() {
        return "[width:" + this.f361363a + ",height:" + this.f361364b + ",fps:" + this.f361365c + ",duration:" + this.f361366d + ']';
    }
}
