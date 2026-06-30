package yw3;

/* loaded from: classes11.dex */
public final class s6 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f466881d;

    /* renamed from: e, reason: collision with root package name */
    public final int f466882e;

    /* renamed from: f, reason: collision with root package name */
    public final int f466883f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f466884g;

    public s6(java.lang.String id6, int i17, int i18, java.lang.String title) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        this.f466881d = id6;
        this.f466882e = i17;
        this.f466883f = i18;
        this.f466884g = title;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yw3.s6 other = (yw3.s6) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f466884g, other.f466884g);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yw3.s6 other = (yw3.s6) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f466882e, other.f466882e);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f466881d;
    }
}
