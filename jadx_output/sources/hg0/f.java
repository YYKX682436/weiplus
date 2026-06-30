package hg0;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final w21.w0 f281314a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281315b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f281316c;

    public f(w21.w0 w0Var, java.lang.String str, boolean z17) {
        this.f281314a = w0Var;
        this.f281315b = str;
        this.f281316c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg0.f)) {
            return false;
        }
        hg0.f fVar = (hg0.f) obj;
        return kotlin.jvm.internal.o.b(this.f281314a, fVar.f281314a) && kotlin.jvm.internal.o.b(this.f281315b, fVar.f281315b) && this.f281316c == fVar.f281316c;
    }

    public int hashCode() {
        w21.w0 w0Var = this.f281314a;
        int hashCode = (w0Var == null ? 0 : w0Var.hashCode()) * 31;
        java.lang.String str = this.f281315b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f281316c);
    }

    public java.lang.String toString() {
        return "OutcomeContext(info=" + this.f281314a + ", forcedOtherInfo=" + this.f281315b + ", durationOverrideNegOne=" + this.f281316c + ')';
    }

    public /* synthetic */ f(w21.w0 w0Var, java.lang.String str, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(w0Var, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? false : z17);
    }
}
