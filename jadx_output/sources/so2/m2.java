package so2;

/* loaded from: classes2.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final ml2.f0 f410479a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f410480b;

    public m2(ml2.f0 liveFeed, java.lang.String str) {
        kotlin.jvm.internal.o.g(liveFeed, "liveFeed");
        this.f410479a = liveFeed;
        this.f410480b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.m2)) {
            return false;
        }
        so2.m2 m2Var = (so2.m2) obj;
        return kotlin.jvm.internal.o.b(this.f410479a, m2Var.f410479a) && kotlin.jvm.internal.o.b(this.f410480b, m2Var.f410480b);
    }

    public int hashCode() {
        int hashCode = this.f410479a.hashCode() * 31;
        java.lang.String str = this.f410480b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "ResumeReportInfo(liveFeed=" + this.f410479a + ", sessionBuffer=" + this.f410480b + ')';
    }
}
