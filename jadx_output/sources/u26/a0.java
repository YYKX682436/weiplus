package u26;

/* loaded from: classes14.dex */
public final class a0 extends u26.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f424135a;

    public a0(java.lang.Throwable th6) {
        this.f424135a = th6;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof u26.a0) {
            if (kotlin.jvm.internal.o.b(this.f424135a, ((u26.a0) obj).f424135a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Throwable th6 = this.f424135a;
        if (th6 != null) {
            return th6.hashCode();
        }
        return 0;
    }

    @Override // u26.b0
    public java.lang.String toString() {
        return "Closed(" + this.f424135a + ')';
    }
}
