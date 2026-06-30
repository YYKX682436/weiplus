package rv;

/* loaded from: classes11.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f399873a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399874b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399875c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f399876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f399877e;

    /* renamed from: f, reason: collision with root package name */
    public final long f399878f;

    public l3(boolean z17, long j17, java.lang.String redDotContent, java.lang.String redDotId, boolean z18, long j18) {
        kotlin.jvm.internal.o.g(redDotContent, "redDotContent");
        kotlin.jvm.internal.o.g(redDotId, "redDotId");
        this.f399873a = z17;
        this.f399874b = j17;
        this.f399875c = redDotContent;
        this.f399876d = redDotId;
        this.f399877e = z18;
        this.f399878f = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.l3)) {
            return false;
        }
        rv.l3 l3Var = (rv.l3) obj;
        return this.f399873a == l3Var.f399873a && this.f399874b == l3Var.f399874b && kotlin.jvm.internal.o.b(this.f399875c, l3Var.f399875c) && kotlin.jvm.internal.o.b(this.f399876d, l3Var.f399876d) && this.f399877e == l3Var.f399877e && this.f399878f == l3Var.f399878f;
    }

    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.f399873a) * 31) + java.lang.Long.hashCode(this.f399874b)) * 31) + this.f399875c.hashCode()) * 31) + this.f399876d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f399877e)) * 31) + java.lang.Long.hashCode(this.f399878f);
    }

    public java.lang.String toString() {
        return "MeTabRedDotReportInfo(hasRedDot=" + this.f399873a + ", redDotType=" + this.f399874b + ", redDotContent=" + this.f399875c + ", redDotId=" + this.f399876d + ", hasInteractiveRedDot=" + this.f399877e + ", interactiveRedDotCnt=" + this.f399878f + ')';
    }

    public /* synthetic */ l3(boolean z17, long j17, java.lang.String str, java.lang.String str2, boolean z18, long j18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? "" : str, (i17 & 8) == 0 ? str2 : "", (i17 & 16) == 0 ? z18 : false, (i17 & 32) == 0 ? j18 : 0L);
    }
}
