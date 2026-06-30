package yw3;

/* loaded from: classes4.dex */
public final class j extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final yw3.p f466773d;

    public j(yw3.p info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f466773d = info;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yw3.j other = (yw3.j) obj;
        kotlin.jvm.internal.o.g(other, "other");
        yw3.p pVar = this.f466773d;
        java.lang.String u07 = pVar.u0();
        yw3.p pVar2 = other.f466773d;
        return kotlin.jvm.internal.o.b(u07, pVar2.u0()) && pVar.v0() == pVar2.v0();
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yw3.j other = (yw3.j) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.j(this.f466773d.v0(), other.f466773d.v0());
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String t07 = this.f466773d.t0();
        kotlin.jvm.internal.o.f(t07, "getId(...)");
        return t07;
    }
}
