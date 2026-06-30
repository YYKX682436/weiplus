package ex3;

/* loaded from: classes.dex */
public final class e extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f257207d;

    /* renamed from: e, reason: collision with root package name */
    public final int f257208e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.dp5 f257209f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f257210g;

    public e(int i17, int i18, r45.dp5 item, java.lang.String summary) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(summary, "summary");
        this.f257207d = i17;
        this.f257208e = i18;
        this.f257209f = item;
        this.f257210g = summary;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ex3.e other = (ex3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f257207d == other.f257207d && kotlin.jvm.internal.o.b(this.f257209f, other.f257209f) && kotlin.jvm.internal.o.b(this.f257210g, other.f257210g);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ex3.e other = (ex3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        int i17 = kotlin.jvm.internal.o.i(this.f257208e, other.f257208e);
        return i17 == 0 ? kotlin.jvm.internal.o.i(this.f257207d, other.f257207d) : i17;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f257208e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f257209f.getString(0) + '-' + this.f257208e;
    }
}
