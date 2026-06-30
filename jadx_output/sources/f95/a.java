package f95;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f260533a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f260534b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f260535c;

    public a(java.lang.String sql, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(sql, "sql");
        this.f260533a = sql;
        this.f260534b = z17;
        this.f260535c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f95.a)) {
            return false;
        }
        f95.a aVar = (f95.a) obj;
        return kotlin.jvm.internal.o.b(this.f260533a, aVar.f260533a) && this.f260534b == aVar.f260534b && this.f260535c == aVar.f260535c;
    }

    public int hashCode() {
        return (((this.f260533a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f260534b)) * 31) + java.lang.Boolean.hashCode(this.f260535c);
    }

    public java.lang.String toString() {
        return "SQLInfo(sql=" + this.f260533a + ", isMainThread=" + this.f260534b + ", isReported=" + this.f260535c + ')';
    }
}
