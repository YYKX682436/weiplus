package jf5;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f299505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f299506b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f299507c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f299508d;

    public s0(long j17, int i17, java.lang.String action, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        action = (i18 & 4) != 0 ? "" : action;
        z17 = (i18 & 8) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(action, "action");
        this.f299505a = j17;
        this.f299506b = i17;
        this.f299507c = action;
        this.f299508d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.s0)) {
            return false;
        }
        jf5.s0 s0Var = (jf5.s0) obj;
        return this.f299505a == s0Var.f299505a && this.f299506b == s0Var.f299506b && kotlin.jvm.internal.o.b(this.f299507c, s0Var.f299507c) && this.f299508d == s0Var.f299508d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f299505a) * 31) + java.lang.Integer.hashCode(this.f299506b)) * 31) + this.f299507c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f299508d);
    }

    public java.lang.String toString() {
        return "SelectionSessionState(startElapsedMs=" + this.f299505a + ", totalLenCp=" + this.f299506b + ", action=" + this.f299507c + ", reported=" + this.f299508d + ')';
    }
}
