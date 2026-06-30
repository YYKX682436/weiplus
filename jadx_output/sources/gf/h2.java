package gf;

/* loaded from: classes7.dex */
public final class h2 implements java.lang.Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final gf.g2 f271087e = new gf.g2(null);

    /* renamed from: f, reason: collision with root package name */
    public static final gf.h2 f271088f = new gf.h2(0);

    /* renamed from: g, reason: collision with root package name */
    public static final gf.h2 f271089g = new gf.h2(Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public static final gf.h2 f271090h = new gf.h2(com.tencent.mm.sdk.platformtools.z.f193112h >> 8);

    /* renamed from: d, reason: collision with root package name */
    public final int f271091d;

    public h2(int i17) {
        this.f271091d = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        gf.h2 other = (gf.h2) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f271091d - other.f271091d;
    }

    public java.lang.String toString() {
        return "WxClientVersion(" + java.lang.Integer.toHexString(this.f271091d) + ')';
    }
}
