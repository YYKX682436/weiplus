package vd2;

/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h32 f435761a;

    /* renamed from: b, reason: collision with root package name */
    public final int f435762b;

    public i1(r45.h32 noticeInfo, int i17) {
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        this.f435761a = noticeInfo;
        this.f435762b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd2.i1)) {
            return false;
        }
        vd2.i1 i1Var = (vd2.i1) obj;
        return kotlin.jvm.internal.o.b(this.f435761a, i1Var.f435761a) && this.f435762b == i1Var.f435762b;
    }

    public int hashCode() {
        return (this.f435761a.hashCode() * 31) + java.lang.Integer.hashCode(this.f435762b);
    }

    public java.lang.String toString() {
        return "CacheValue(noticeInfo=" + this.f435761a + ", saveTimeSec=" + this.f435762b + ')';
    }
}
