package g4;

/* loaded from: classes5.dex */
public final class y3 extends g4.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f268642a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(java.lang.Throwable throwable) {
        super(null);
        kotlin.jvm.internal.o.g(throwable, "throwable");
        this.f268642a = throwable;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof g4.y3) && kotlin.jvm.internal.o.b(this.f268642a, ((g4.y3) obj).f268642a);
        }
        return true;
    }

    public int hashCode() {
        java.lang.Throwable th6 = this.f268642a;
        if (th6 != null) {
            return th6.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return "Error(throwable=" + this.f268642a + ")";
    }
}
