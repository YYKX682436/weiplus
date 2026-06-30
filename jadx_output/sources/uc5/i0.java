package uc5;

/* loaded from: classes10.dex */
public final class i0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f426501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.util.List personItems) {
        super(null);
        kotlin.jvm.internal.o.g(personItems, "personItems");
        this.f426501d = personItems;
    }

    @Override // uc5.l0, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        uc5.l0 other = (uc5.l0) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (other instanceof uc5.i0) {
            return 0;
        }
        if (other instanceof uc5.k0 ? true : other instanceof uc5.h0 ? true : other instanceof uc5.j0) {
            return -1;
        }
        throw new jz5.j();
    }

    @Override // xm3.a
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc5.i0) && kotlin.jvm.internal.o.b(this.f426501d, ((uc5.i0) obj).f426501d);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return -1;
    }

    @Override // xm3.a
    public int hashCode() {
        return this.f426501d.hashCode();
    }

    public java.lang.String toString() {
        return "PersonRecommend(personItems=" + this.f426501d + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return "person_recommend";
    }
}
