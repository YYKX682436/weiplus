package o63;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f343197a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f343198b;

    public f(boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        this.f343197a = z17;
        this.f343198b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o63.f)) {
            return false;
        }
        o63.f fVar = (o63.f) obj;
        return this.f343197a == fVar.f343197a && this.f343198b == fVar.f343198b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f343197a) * 31) + java.lang.Boolean.hashCode(this.f343198b);
    }

    public java.lang.String toString() {
        return "FinderReportRoute(isReportSessionEvent=" + this.f343197a + ", isReportPageEvent=" + this.f343198b + ')';
    }
}
