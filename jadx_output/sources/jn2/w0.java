package jn2;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ay1 f300740a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.cy1 f300741b;

    public w0(r45.ay1 basicInfo, r45.cy1 cy1Var) {
        kotlin.jvm.internal.o.g(basicInfo, "basicInfo");
        this.f300740a = basicInfo;
        this.f300741b = cy1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn2.w0)) {
            return false;
        }
        jn2.w0 w0Var = (jn2.w0) obj;
        return kotlin.jvm.internal.o.b(this.f300740a, w0Var.f300740a) && kotlin.jvm.internal.o.b(this.f300741b, w0Var.f300741b);
    }

    public int hashCode() {
        int hashCode = this.f300740a.hashCode() * 31;
        r45.cy1 cy1Var = this.f300741b;
        return hashCode + (cy1Var == null ? 0 : cy1Var.hashCode());
    }

    public java.lang.String toString() {
        return "SongItemData(basicInfo=" + this.f300740a + ", resourceInfo=" + this.f300741b + ')';
    }
}
