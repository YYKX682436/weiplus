package pk1;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f355445a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f355446b;

    public g(boolean z17, java.lang.String realSrc) {
        kotlin.jvm.internal.o.g(realSrc, "realSrc");
        this.f355445a = z17;
        this.f355446b = realSrc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1.g)) {
            return false;
        }
        pk1.g gVar = (pk1.g) obj;
        return this.f355445a == gVar.f355445a && kotlin.jvm.internal.o.b(this.f355446b, gVar.f355446b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f355445a) * 31) + this.f355446b.hashCode();
    }

    public java.lang.String toString() {
        return "DataSourceInfo(isHls=" + this.f355445a + ", realSrc=" + this.f355446b + ')';
    }
}
