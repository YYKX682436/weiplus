package xr0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f456166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f456167b;

    public g(int i17, int i18) {
        this.f456166a = i17;
        this.f456167b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.g)) {
            return false;
        }
        xr0.g gVar = (xr0.g) obj;
        return this.f456166a == gVar.f456166a && this.f456167b == gVar.f456167b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f456166a) * 31) + java.lang.Integer.hashCode(this.f456167b);
    }

    public java.lang.String toString() {
        return "CameraKitReportSetting(scene=" + this.f456166a + ", subScene=" + this.f456167b + ')';
    }
}
