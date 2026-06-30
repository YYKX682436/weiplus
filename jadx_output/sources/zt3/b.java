package zt3;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f475585a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f475586b;

    public b(int i17, android.os.Bundle bundle) {
        this.f475585a = i17;
        this.f475586b = bundle;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt3.b)) {
            return false;
        }
        zt3.b bVar = (zt3.b) obj;
        return this.f475585a == bVar.f475585a && kotlin.jvm.internal.o.b(this.f475586b, bVar.f475586b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f475585a) * 31;
        android.os.Bundle bundle = this.f475586b;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public java.lang.String toString() {
        return "EventState(event=" + this.f475585a + ", extra=" + this.f475586b + ')';
    }
}
