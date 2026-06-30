package cv0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final cv0.e f222534a;

    /* renamed from: b, reason: collision with root package name */
    public final cv0.e f222535b;

    /* renamed from: c, reason: collision with root package name */
    public final cv0.e f222536c;

    public f(cv0.e eVar, cv0.e inFirstPanel, cv0.e inEditPanel) {
        kotlin.jvm.internal.o.g(eVar, "default");
        kotlin.jvm.internal.o.g(inFirstPanel, "inFirstPanel");
        kotlin.jvm.internal.o.g(inEditPanel, "inEditPanel");
        this.f222534a = eVar;
        this.f222535b = inFirstPanel;
        this.f222536c = inEditPanel;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0.f)) {
            return false;
        }
        cv0.f fVar = (cv0.f) obj;
        return kotlin.jvm.internal.o.b(this.f222534a, fVar.f222534a) && kotlin.jvm.internal.o.b(this.f222535b, fVar.f222535b) && kotlin.jvm.internal.o.b(this.f222536c, fVar.f222536c);
    }

    public int hashCode() {
        return (((this.f222534a.hashCode() * 31) + this.f222535b.hashCode()) * 31) + this.f222536c.hashCode();
    }

    public java.lang.String toString() {
        return "HandleBoxShowOptions(default=" + this.f222534a + ", inFirstPanel=" + this.f222535b + ", inEditPanel=" + this.f222536c + ')';
    }
}
