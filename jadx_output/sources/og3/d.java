package og3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f345159a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f345160b;

    public d(java.util.ArrayList inputs, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inputs, "inputs");
        this.f345159a = inputs;
        this.f345160b = bundle;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3.d)) {
            return false;
        }
        og3.d dVar = (og3.d) obj;
        return kotlin.jvm.internal.o.b(this.f345159a, dVar.f345159a) && kotlin.jvm.internal.o.b(this.f345160b, dVar.f345160b);
    }

    public int hashCode() {
        int hashCode = this.f345159a.hashCode() * 31;
        android.os.Bundle bundle = this.f345160b;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public java.lang.String toString() {
        return "MediaInputInfo(inputs=" + this.f345159a + ", extra=" + this.f345160b + ')';
    }
}
