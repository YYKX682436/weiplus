package rr3;

/* loaded from: classes4.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ym f399181d;

    /* renamed from: e, reason: collision with root package name */
    public final int f399182e;

    public d(r45.ym recordInfo, int i17, int i18, kotlin.jvm.internal.i iVar) {
        recordInfo = (i18 & 1) != 0 ? new r45.ym() : recordInfo;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(recordInfo, "recordInfo");
        this.f399181d = recordInfo;
        this.f399182e = i17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        rr3.d other = (rr3.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f399181d.f391209e == other.f399181d.f391209e;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        rr3.d other = (rr3.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f399182e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f399181d.hashCode());
    }
}
