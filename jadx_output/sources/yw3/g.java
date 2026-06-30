package yw3;

/* loaded from: classes4.dex */
public final class g extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f466744d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f466745e;

    public g(int i17, java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f466744d = i17;
        this.f466745e = title;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yw3.g other = (yw3.g) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f466745e, other.f466745e);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yw3.g other = (yw3.g) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f466744d, other.f466744d);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f466744d);
    }
}
