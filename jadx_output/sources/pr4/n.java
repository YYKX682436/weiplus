package pr4;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.p f358039a;

    public n(pr4.p status) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f358039a = status;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.n) && this.f358039a == ((pr4.n) obj).f358039a;
    }

    public int hashCode() {
        return this.f358039a.hashCode();
    }

    public java.lang.String toString() {
        return "WeCoinSubscribeResult(status=" + this.f358039a + ')';
    }
}
