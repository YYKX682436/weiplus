package te2;

/* loaded from: classes14.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public x91.h f418299a;

    public p2(x91.h hVar) {
        this.f418299a = hVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te2.p2) && kotlin.jvm.internal.o.b(this.f418299a, ((te2.p2) obj).f418299a);
    }

    public int hashCode() {
        x91.h hVar = this.f418299a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }

    public java.lang.String toString() {
        return "DeviceInfo(device=" + this.f418299a + ')';
    }
}
