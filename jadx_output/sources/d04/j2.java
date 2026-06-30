package d04;

/* loaded from: classes8.dex */
public final class j2 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final sz3.w0 f225446d;

    /* renamed from: e, reason: collision with root package name */
    public final int f225447e;

    /* renamed from: f, reason: collision with root package name */
    public int f225448f;

    /* renamed from: g, reason: collision with root package name */
    public int f225449g;

    public j2(sz3.w0 item, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i18 = (i19 & 4) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(item, "item");
        this.f225446d = item;
        this.f225447e = i17;
        this.f225448f = i18;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        d04.j2 other = (d04.j2) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(v(), other.v());
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        d04.j2 other = (d04.j2) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f225448f, other.f225448f);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f225447e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f225446d.f414130a);
    }
}
