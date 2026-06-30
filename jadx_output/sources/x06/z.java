package x06;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final f16.o f451338a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f451339b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f451340c;

    public z(f16.o oVar, java.util.Collection collection, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(oVar, collection, (i17 & 4) != 0 ? oVar.f258760a == f16.n.f258757f : z17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.z)) {
            return false;
        }
        x06.z zVar = (x06.z) obj;
        return kotlin.jvm.internal.o.b(this.f451338a, zVar.f451338a) && kotlin.jvm.internal.o.b(this.f451339b, zVar.f451339b) && this.f451340c == zVar.f451340c;
    }

    public int hashCode() {
        return (((this.f451338a.hashCode() * 31) + this.f451339b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f451340c);
    }

    public java.lang.String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f451338a + ", qualifierApplicabilityTypes=" + this.f451339b + ", definitelyNotNull=" + this.f451340c + ')';
    }

    public z(f16.o nullabilityQualifier, java.util.Collection qualifierApplicabilityTypes, boolean z17) {
        kotlin.jvm.internal.o.g(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.o.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f451338a = nullabilityQualifier;
        this.f451339b = qualifierApplicabilityTypes;
        this.f451340c = z17;
    }
}
