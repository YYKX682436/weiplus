package gf;

/* loaded from: classes5.dex */
public final class k2 implements java.lang.Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final gf.j2 f271107e = new gf.j2(null);

    /* renamed from: f, reason: collision with root package name */
    public static final gf.k2 f271108f = new gf.k2(new int[]{0, 0, 0});

    /* renamed from: g, reason: collision with root package name */
    public static final gf.k2 f271109g = new gf.k2(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE});

    /* renamed from: d, reason: collision with root package name */
    public final int[] f271110d;

    public k2(int[] iArr) {
        this.f271110d = iArr;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        gf.k2 other = (gf.k2) obj;
        kotlin.jvm.internal.o.g(other, "other");
        for (int i17 = 0; i17 < 3; i17++) {
            int i18 = this.f271110d[i17];
            int i19 = other.f271110d[i17];
            if (i18 != i19) {
                return i18 - i19;
            }
        }
        return 0;
    }
}
