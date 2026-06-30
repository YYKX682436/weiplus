package i62;

/* loaded from: classes12.dex */
public final class j implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f288953d;

    /* renamed from: e, reason: collision with root package name */
    public final long f288954e;

    /* renamed from: f, reason: collision with root package name */
    public final int f288955f;

    /* renamed from: g, reason: collision with root package name */
    public final int f288956g;

    public j(java.lang.String resName, long j17, int i17, int i18) {
        kotlin.jvm.internal.o.g(resName, "resName");
        this.f288953d = resName;
        this.f288954e = j17;
        this.f288955f = i17;
        this.f288956g = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i62.j)) {
            return false;
        }
        i62.j jVar = (i62.j) obj;
        return kotlin.jvm.internal.o.b(this.f288953d, jVar.f288953d) && this.f288954e == jVar.f288954e && this.f288955f == jVar.f288955f && this.f288956g == jVar.f288956g;
    }

    public int hashCode() {
        return (((((this.f288953d.hashCode() * 31) + java.lang.Long.hashCode(this.f288954e)) * 31) + java.lang.Integer.hashCode(this.f288955f)) * 31) + java.lang.Integer.hashCode(this.f288956g);
    }

    public java.lang.String toString() {
        return "ReportItem(resName=" + this.f288953d + ", cost=" + this.f288954e + ", resType=" + this.f288955f + ", resId=" + this.f288956g + ')';
    }
}
