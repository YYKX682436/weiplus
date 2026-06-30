package dw3;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f244190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f244191b;

    /* renamed from: c, reason: collision with root package name */
    public final int f244192c;

    /* renamed from: d, reason: collision with root package name */
    public final int f244193d;

    /* renamed from: e, reason: collision with root package name */
    public final int f244194e;

    /* renamed from: f, reason: collision with root package name */
    public final int f244195f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f244196g;

    /* renamed from: h, reason: collision with root package name */
    public final int f244197h;

    /* renamed from: i, reason: collision with root package name */
    public int f244198i;

    /* renamed from: j, reason: collision with root package name */
    public final int f244199j;

    public d0(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, int i37, int i38, int i39) {
        this.f244190a = i17;
        this.f244191b = i18;
        this.f244192c = i19;
        this.f244193d = i27;
        this.f244194e = i28;
        this.f244195f = i29;
        this.f244196g = z17;
        this.f244197h = i37;
        this.f244198i = i38;
        this.f244199j = i39;
    }

    public final int a() {
        return this.f244191b;
    }

    public final boolean b() {
        return this.f244196g;
    }

    public final int c() {
        return this.f244190a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw3.d0)) {
            return false;
        }
        dw3.d0 d0Var = (dw3.d0) obj;
        return this.f244190a == d0Var.f244190a && this.f244191b == d0Var.f244191b && this.f244192c == d0Var.f244192c && this.f244193d == d0Var.f244193d && this.f244194e == d0Var.f244194e && this.f244195f == d0Var.f244195f && this.f244196g == d0Var.f244196g && this.f244197h == d0Var.f244197h && this.f244198i == d0Var.f244198i && this.f244199j == d0Var.f244199j;
    }

    public int hashCode() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.f244190a) * 31) + java.lang.Integer.hashCode(this.f244191b)) * 31) + java.lang.Integer.hashCode(this.f244192c)) * 31) + java.lang.Integer.hashCode(this.f244193d)) * 31) + java.lang.Integer.hashCode(this.f244194e)) * 31) + java.lang.Integer.hashCode(this.f244195f)) * 31) + java.lang.Boolean.hashCode(this.f244196g)) * 31) + java.lang.Integer.hashCode(this.f244197h)) * 31) + java.lang.Integer.hashCode(this.f244198i)) * 31) + java.lang.Integer.hashCode(this.f244199j);
    }

    public java.lang.String toString() {
        return "VideoInfo(width=" + this.f244190a + ", height=" + this.f244191b + ", duration=" + this.f244192c + ", rotate=" + this.f244193d + ", videoBitrate=" + this.f244194e + ", fps=" + this.f244195f + ", matchScreenRatio=" + this.f244196g + ", useABA=" + this.f244197h + ", bitrateAdaptiveUp=" + this.f244198i + ", useMinMaxQP=" + this.f244199j + ')';
    }
}
