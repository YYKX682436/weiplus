package so2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public so2.h f410350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410352c;

    /* renamed from: d, reason: collision with root package name */
    public final long f410353d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410354e;

    /* renamed from: f, reason: collision with root package name */
    public final int f410355f;

    public g(so2.h showMileStoneState, int i17, int i18, long j17, boolean z17, int i19, int i27, kotlin.jvm.internal.i iVar) {
        showMileStoneState = (i27 & 1) != 0 ? so2.h.f410370d : showMileStoneState;
        z17 = (i27 & 16) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(showMileStoneState, "showMileStoneState");
        this.f410350a = showMileStoneState;
        this.f410351b = i17;
        this.f410352c = i18;
        this.f410353d = j17;
        this.f410354e = z17;
        this.f410355f = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.g)) {
            return false;
        }
        so2.g gVar = (so2.g) obj;
        return this.f410350a == gVar.f410350a && this.f410351b == gVar.f410351b && this.f410352c == gVar.f410352c && this.f410353d == gVar.f410353d && this.f410354e == gVar.f410354e && this.f410355f == gVar.f410355f;
    }

    public int hashCode() {
        return (((((((((this.f410350a.hashCode() * 31) + java.lang.Integer.hashCode(this.f410351b)) * 31) + java.lang.Integer.hashCode(this.f410352c)) * 31) + java.lang.Long.hashCode(this.f410353d)) * 31) + java.lang.Boolean.hashCode(this.f410354e)) * 31) + java.lang.Integer.hashCode(this.f410355f);
    }

    public java.lang.String toString() {
        return "MileStoneShowInfo(showMileStoneState=" + this.f410350a + ", interactionType=" + this.f410351b + ", interactionCount=" + this.f410352c + ", firstShowTimeStamp=" + this.f410353d + ", showAgain=" + this.f410354e + ", showPoint=" + this.f410355f + ')';
    }
}
