package pm0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f356756a;

    /* renamed from: b, reason: collision with root package name */
    public final long f356757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f356758c;

    public a0(java.lang.Object obj, long j17, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        this.f356756a = obj;
        this.f356757b = j17;
        this.f356758c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm0.a0)) {
            return false;
        }
        pm0.a0 a0Var = (pm0.a0) obj;
        return kotlin.jvm.internal.o.b(this.f356756a, a0Var.f356756a) && this.f356757b == a0Var.f356757b && this.f356758c == a0Var.f356758c;
    }

    public int hashCode() {
        java.lang.Object obj = this.f356756a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Long.hashCode(this.f356757b)) * 31) + java.lang.Boolean.hashCode(this.f356758c);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6;
        java.lang.String str;
        boolean z17 = this.f356758c;
        long j17 = this.f356757b;
        if (z17) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            str = "ns";
        } else {
            sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            str = "ms";
        }
        sb6.append(str);
        return sb6.toString();
    }
}
