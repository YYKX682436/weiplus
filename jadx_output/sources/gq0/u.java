package gq0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f274488a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274489b;

    public u(java.lang.String frameSetName, boolean z17) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        this.f274488a = frameSetName;
        this.f274489b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq0.u)) {
            return false;
        }
        gq0.u uVar = (gq0.u) obj;
        return kotlin.jvm.internal.o.b(this.f274488a, uVar.f274488a) && this.f274489b == uVar.f274489b;
    }

    public int hashCode() {
        return (this.f274488a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f274489b);
    }

    public java.lang.String toString() {
        return "FrameSetReportInfo(frameSetName=" + this.f274488a + ", isExposed=" + this.f274489b + ')';
    }
}
