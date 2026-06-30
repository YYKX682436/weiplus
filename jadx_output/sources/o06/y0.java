package o06;

/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f342006a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f342007b;

    public y0(n16.b classId, java.util.List typeParametersCount) {
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(typeParametersCount, "typeParametersCount");
        this.f342006a = classId;
        this.f342007b = typeParametersCount;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o06.y0)) {
            return false;
        }
        o06.y0 y0Var = (o06.y0) obj;
        return kotlin.jvm.internal.o.b(this.f342006a, y0Var.f342006a) && kotlin.jvm.internal.o.b(this.f342007b, y0Var.f342007b);
    }

    public int hashCode() {
        return (this.f342006a.hashCode() * 31) + this.f342007b.hashCode();
    }

    public java.lang.String toString() {
        return "ClassRequest(classId=" + this.f342006a + ", typeParametersCount=" + this.f342007b + ')';
    }
}
