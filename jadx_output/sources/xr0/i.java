package xr0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f456172a;

    public i(int i17) {
        this.f456172a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xr0.i) && this.f456172a == ((xr0.i) obj).f456172a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f456172a);
    }

    public java.lang.String toString() {
        return "CameraKitUiSetting(themeColor=" + this.f456172a + ')';
    }
}
