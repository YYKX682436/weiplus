package gm3;

/* loaded from: classes10.dex */
public final class c extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f273543d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273544e;

    /* renamed from: f, reason: collision with root package name */
    public final long f273545f;

    /* renamed from: g, reason: collision with root package name */
    public final int f273546g;

    /* renamed from: h, reason: collision with root package name */
    public gm3.a f273547h;

    /* renamed from: i, reason: collision with root package name */
    public gm3.b f273548i;

    /* renamed from: m, reason: collision with root package name */
    public int f273549m;

    /* renamed from: n, reason: collision with root package name */
    public int f273550n;

    public c(java.lang.String id6, int i17, long j17, int i18) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f273543d = id6;
        this.f273544e = i17;
        this.f273545f = j17;
        this.f273546g = i18;
        this.f273550n = -1;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        gm3.c other = (gm3.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f273550n == other.f273550n && kotlin.jvm.internal.o.b(this.f273548i, other.f273548i) && kotlin.jvm.internal.o.b(this.f273547h, other.f273547h) && this.f273549m == other.f273549m;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        gm3.c other = (gm3.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.j(this.f273545f, other.f273545f);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f273544e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f273543d;
    }
}
