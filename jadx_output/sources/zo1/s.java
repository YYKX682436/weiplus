package zo1;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f474761b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f474762c;

    public s(java.lang.String username, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f474760a = username;
        this.f474761b = j17;
        this.f474762c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo1.s)) {
            return false;
        }
        zo1.s sVar = (zo1.s) obj;
        return kotlin.jvm.internal.o.b(this.f474760a, sVar.f474760a) && this.f474761b == sVar.f474761b && this.f474762c == sVar.f474762c;
    }

    public int hashCode() {
        return (((this.f474760a.hashCode() * 31) + java.lang.Long.hashCode(this.f474761b)) * 31) + java.lang.Boolean.hashCode(this.f474762c);
    }

    public java.lang.String toString() {
        return "ConvInfo(username=" + this.f474760a + ", size=" + this.f474761b + ", isSelected=" + this.f474762c + ')';
    }
}
