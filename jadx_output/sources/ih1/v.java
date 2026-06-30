package ih1;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f291542a;

    /* renamed from: b, reason: collision with root package name */
    public final iq0.e f291543b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f291544c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f291545d;

    public v(java.lang.String bizName, iq0.e rootConfig, java.lang.String frameSetName, boolean z17) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(rootConfig, "rootConfig");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        this.f291542a = bizName;
        this.f291543b = rootConfig;
        this.f291544c = frameSetName;
        this.f291545d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1.v)) {
            return false;
        }
        ih1.v vVar = (ih1.v) obj;
        return kotlin.jvm.internal.o.b(this.f291542a, vVar.f291542a) && kotlin.jvm.internal.o.b(this.f291543b, vVar.f291543b) && kotlin.jvm.internal.o.b(this.f291544c, vVar.f291544c) && this.f291545d == vVar.f291545d;
    }

    public int hashCode() {
        return (((((this.f291542a.hashCode() * 31) + this.f291543b.hashCode()) * 31) + this.f291544c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f291545d);
    }

    public java.lang.String toString() {
        return "ReportItem(bizName=" + this.f291542a + ", rootConfig=" + this.f291543b + ", frameSetName=" + this.f291544c + ", isVisible=" + this.f291545d + ')';
    }
}
