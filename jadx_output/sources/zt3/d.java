package zt3;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f475592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f475593b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f475594c;

    public d(int i17, int i18, android.os.Bundle bundle) {
        this.f475592a = i17;
        this.f475593b = i18;
        this.f475594c = bundle;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt3.d)) {
            return false;
        }
        zt3.d dVar = (zt3.d) obj;
        return this.f475592a == dVar.f475592a && this.f475593b == dVar.f475593b && kotlin.jvm.internal.o.b(this.f475594c, dVar.f475594c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f475592a) * 31) + java.lang.Integer.hashCode(this.f475593b)) * 31;
        android.os.Bundle bundle = this.f475594c;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public java.lang.String toString() {
        return "ViewState(type=" + this.f475592a + ", visible=" + this.f475593b + ", extra=" + this.f475594c + ')';
    }
}
