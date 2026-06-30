package g16;

/* loaded from: classes15.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g16.t0 f267666b = new g16.t0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267667a;

    public u0(java.lang.String str, kotlin.jvm.internal.i iVar) {
        this.f267667a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g16.u0) && kotlin.jvm.internal.o.b(this.f267667a, ((g16.u0) obj).f267667a);
    }

    public int hashCode() {
        return this.f267667a.hashCode();
    }

    public java.lang.String toString() {
        return "MemberSignature(signature=" + this.f267667a + ')';
    }
}
