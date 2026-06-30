package ij4;

/* loaded from: classes10.dex */
public final class d extends xm3.a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public mj4.h f291717d;

    public d(mj4.h info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f291717d = info;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ij4.d other = (ij4.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(((mj4.k) this.f291717d).l(), ((mj4.k) other.f291717d).l());
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ij4.d other = (ij4.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return ((mj4.k) this.f291717d).l();
    }
}
