package nj4;

/* loaded from: classes11.dex */
public final class h extends nj4.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f337937d;

    public h(java.util.ArrayList iconDataList) {
        kotlin.jvm.internal.o.g(iconDataList, "iconDataList");
        this.f337937d = iconDataList;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        nj4.i other = (nj4.i) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return false;
    }

    @Override // nj4.i, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        nj4.i other = (nj4.i) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 2;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(hashCode());
    }
}
