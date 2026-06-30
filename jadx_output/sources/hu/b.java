package hu;

/* loaded from: classes9.dex */
public final class b extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f284996d;

    /* renamed from: e, reason: collision with root package name */
    public final s15.h f284997e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f284998f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f284999g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f285000h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f285001i;

    public b(int i17, s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        this.f284996d = i17;
        this.f284997e = recordDataItem;
        this.f284998f = "";
        this.f284999g = "";
        this.f285000h = "";
        this.f285001i = "";
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        hu.b other = (hu.b) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f284997e.compareContent(other.f284997e);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        hu.b other = (hu.b) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f284996d, other.f284996d);
    }

    @Override // xm3.a, in5.c
    public int h() {
        ((ju.e) ((gu.g) i95.n0.c(gu.g.class))).getClass();
        s15.h recordDataItem = this.f284997e;
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        return wu.b2.f449545a.b(recordDataItem);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f284996d);
    }
}
