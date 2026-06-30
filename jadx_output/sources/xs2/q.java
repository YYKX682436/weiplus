package xs2;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f456365a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f456366b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f456367c;

    public q(boolean z17, boolean z18, java.lang.Object obj) {
        this.f456365a = z17;
        this.f456366b = z18;
        this.f456367c = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs2.q)) {
            return false;
        }
        xs2.q qVar = (xs2.q) obj;
        return this.f456365a == qVar.f456365a && this.f456366b == qVar.f456366b && kotlin.jvm.internal.o.b(this.f456367c, qVar.f456367c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f456365a) * 31) + java.lang.Boolean.hashCode(this.f456366b)) * 31;
        java.lang.Object obj = this.f456367c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "DanmakuBackgroundConfig(set=" + this.f456365a + ", enablePrivilegeDanmaku=" + this.f456366b + ", extraInfo=" + this.f456367c + ')';
    }
}
