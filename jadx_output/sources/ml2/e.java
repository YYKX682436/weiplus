package ml2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f327368a;

    public e(int i17) {
        this.f327368a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml2.e) && this.f327368a == ((ml2.e) obj).f327368a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f327368a);
    }

    public java.lang.String toString() {
        return "DeviceMonitorResult(cpuLoad=" + this.f327368a + ')';
    }
}
