package wo1;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447992a;

    /* renamed from: b, reason: collision with root package name */
    public final long f447993b;

    /* renamed from: c, reason: collision with root package name */
    public final long f447994c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f447995d;

    public n(java.lang.String username, long j17, long j18, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(username, "username");
        this.f447992a = username;
        this.f447993b = j17;
        this.f447994c = j18;
        this.f447995d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo1.n)) {
            return false;
        }
        wo1.n nVar = (wo1.n) obj;
        return kotlin.jvm.internal.o.b(this.f447992a, nVar.f447992a) && this.f447993b == nVar.f447993b && this.f447994c == nVar.f447994c && this.f447995d == nVar.f447995d;
    }

    public int hashCode() {
        return (((((this.f447992a.hashCode() * 31) + java.lang.Long.hashCode(this.f447993b)) * 31) + java.lang.Long.hashCode(this.f447994c)) * 31) + java.lang.Boolean.hashCode(this.f447995d);
    }

    public java.lang.String toString() {
        return "ConvInfo(username=" + this.f447992a + ", lastMsgTime=" + this.f447993b + ", size=" + this.f447994c + ", isSelected=" + this.f447995d + ')';
    }
}
