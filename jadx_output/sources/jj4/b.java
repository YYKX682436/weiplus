package jj4;

/* loaded from: classes4.dex */
public final class b extends xm3.a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f300029d;

    public b(java.util.List infoList) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        this.f300029d = infoList;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        jj4.b other = (jj4.b) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(v(), other.v());
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        jj4.b other = (jj4.b) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    public java.lang.String toString() {
        java.util.List list = this.f300029d;
        mj4.h hVar = (mj4.h) kz5.n0.Z(list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MultipleCardFeedItem[");
        sb6.append(hashCode());
        sb6.append("], infoList size=");
        sb6.append(list.size());
        sb6.append(", info username:");
        sb6.append(hVar != null ? ((mj4.k) hVar).o() : null);
        sb6.append(", first status=");
        sb6.append(hVar != null ? hVar.toString() : null);
        return sb6.toString();
    }

    @Override // xm3.d
    public java.lang.String v() {
        return kz5.n0.g0(this.f300029d, null, null, null, 0, null, jj4.a.f300028d, 31, null);
    }
}
