package dv2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f243904a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f243905b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f243906c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f243907d;

    public n(boolean z17, java.lang.String followOnlyTitle, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(followOnlyTitle, "followOnlyTitle");
        this.f243904a = z17;
        this.f243905b = followOnlyTitle;
        this.f243906c = str;
        this.f243907d = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv2.n)) {
            return false;
        }
        dv2.n nVar = (dv2.n) obj;
        return this.f243904a == nVar.f243904a && kotlin.jvm.internal.o.b(this.f243905b, nVar.f243905b) && kotlin.jvm.internal.o.b(this.f243906c, nVar.f243906c) && kotlin.jvm.internal.o.b(this.f243907d, nVar.f243907d);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f243904a) * 31) + this.f243905b.hashCode()) * 31;
        java.lang.String str = this.f243906c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f243907d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "UIState(isFollowOnly=" + this.f243904a + ", followOnlyTitle=" + this.f243905b + ", followSubtitle=" + this.f243906c + ", recentSubtitle=" + this.f243907d + ')';
    }
}
