package hw;

/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final hw.d0 f285369d = new hw.d0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f285370a;

    /* renamed from: b, reason: collision with root package name */
    public final int f285371b;

    /* renamed from: c, reason: collision with root package name */
    public final long f285372c;

    public e0(long j17, int i17, long j18) {
        this.f285370a = j17;
        this.f285371b = i17;
        this.f285372c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw.e0)) {
            return false;
        }
        hw.e0 e0Var = (hw.e0) obj;
        return this.f285370a == e0Var.f285370a && this.f285371b == e0Var.f285371b && this.f285372c == e0Var.f285372c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f285370a) * 31) + java.lang.Integer.hashCode(this.f285371b)) * 31) + java.lang.Long.hashCode(this.f285372c);
    }

    public java.lang.String toString() {
        return "RecreationConfig(disconnectAsCrashFreqThreshold=" + this.f285370a + ", maxCrashLimitBeforeCloseFeature=" + this.f285371b + ", recoverFeatureSwitchAfter=" + this.f285372c + ')';
    }
}
