package f2;

/* loaded from: classes14.dex */
public final class r implements java.lang.Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final f2.r f258818e;

    /* renamed from: f, reason: collision with root package name */
    public static final f2.r f258819f;

    /* renamed from: g, reason: collision with root package name */
    public static final f2.r f258820g;

    /* renamed from: h, reason: collision with root package name */
    public static final f2.r f258821h;

    /* renamed from: i, reason: collision with root package name */
    public static final f2.r f258822i;

    /* renamed from: m, reason: collision with root package name */
    public static final f2.r f258823m;

    /* renamed from: n, reason: collision with root package name */
    public static final f2.r f258824n;

    /* renamed from: d, reason: collision with root package name */
    public final int f258825d;

    static {
        f2.r rVar = new f2.r(100);
        f2.r rVar2 = new f2.r(200);
        f2.r rVar3 = new f2.r(300);
        f2.r rVar4 = new f2.r(400);
        f258818e = rVar4;
        f2.r rVar5 = new f2.r(500);
        f258819f = rVar5;
        f2.r rVar6 = new f2.r(600);
        f258820g = rVar6;
        f2.r rVar7 = new f2.r(700);
        f2.r rVar8 = new f2.r(800);
        f2.r rVar9 = new f2.r(900);
        f258821h = rVar3;
        f258822i = rVar4;
        f258823m = rVar5;
        f258824n = rVar7;
        kz5.c0.i(rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9);
    }

    public r(int i17) {
        this.f258825d = i17;
        boolean z17 = false;
        if (1 <= i17 && i17 < 1001) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i17).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f2.r other) {
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f258825d, other.f258825d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f2.r) {
            return this.f258825d == ((f2.r) obj).f258825d;
        }
        return false;
    }

    public int hashCode() {
        return this.f258825d;
    }

    public java.lang.String toString() {
        return "FontWeight(weight=" + this.f258825d + ')';
    }
}
