package ra3;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f393523a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f393524b;

    public o(boolean z17, java.lang.String missingFile) {
        kotlin.jvm.internal.o.g(missingFile, "missingFile");
        this.f393523a = z17;
        this.f393524b = missingFile;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra3.o)) {
            return false;
        }
        ra3.o oVar = (ra3.o) obj;
        return this.f393523a == oVar.f393523a && kotlin.jvm.internal.o.b(this.f393524b, oVar.f393524b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f393523a) * 31) + this.f393524b.hashCode();
    }

    public java.lang.String toString() {
        return "LiteAppFileIntegrityResult(result=" + this.f393523a + ", missingFile=" + this.f393524b + ')';
    }
}
