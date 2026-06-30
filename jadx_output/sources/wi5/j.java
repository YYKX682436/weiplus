package wi5;

/* loaded from: classes.dex */
public final class j extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f446297b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f446298c;

    /* renamed from: d, reason: collision with root package name */
    public final long f446299d;

    public /* synthetic */ j(java.lang.String str, boolean z17, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? 0L : j17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.j)) {
            return false;
        }
        wi5.j jVar = (wi5.j) obj;
        return kotlin.jvm.internal.o.b(this.f446297b, jVar.f446297b) && this.f446298c == jVar.f446298c && this.f446299d == jVar.f446299d;
    }

    public int hashCode() {
        return (((this.f446297b.hashCode() * 31) + java.lang.Boolean.hashCode(this.f446298c)) * 31) + java.lang.Long.hashCode(this.f446299d);
    }

    public java.lang.String toString() {
        return "CreateGroupStartChattingAction(username=" + this.f446297b + ", afterCreateGroup=" + this.f446298c + ", exitType=" + this.f446299d + ')';
    }

    public j(java.lang.String username, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f446297b = username;
        this.f446298c = z17;
        this.f446299d = j17;
    }
}
