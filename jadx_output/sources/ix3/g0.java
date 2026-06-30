package ix3;

/* loaded from: classes10.dex */
public final class g0 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f295419d;

    /* renamed from: e, reason: collision with root package name */
    public final ix3.c f295420e;

    public g0(int i17, ix3.c item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f295419d = i17;
        this.f295420e = item;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ix3.g0 other = (ix3.g0) obj;
        kotlin.jvm.internal.o.g(other, "other");
        ix3.c cVar = this.f295420e;
        long j17 = cVar.f295372b;
        ix3.c cVar2 = other.f295420e;
        return j17 == cVar2.f295372b && cVar.f295373c.hashCode() == cVar2.f295373c.hashCode();
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ix3.g0 other = (ix3.g0) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(other.f295419d, this.f295419d);
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ix3.c cVar = this.f295420e;
        sb6.append(cVar.f295372b);
        sb6.append('_');
        sb6.append(cVar.f295373c.hashCode());
        return sb6.toString();
    }
}
