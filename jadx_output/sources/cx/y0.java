package cx;

/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final cx.x0 f224485d = new cx.x0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f224486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f224487b;

    /* renamed from: c, reason: collision with root package name */
    public final long f224488c;

    public y0(long j17, int i17, long j18) {
        this.f224486a = j17;
        this.f224487b = i17;
        this.f224488c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx.y0)) {
            return false;
        }
        cx.y0 y0Var = (cx.y0) obj;
        return this.f224486a == y0Var.f224486a && this.f224487b == y0Var.f224487b && this.f224488c == y0Var.f224488c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f224486a) * 31) + java.lang.Integer.hashCode(this.f224487b)) * 31) + java.lang.Long.hashCode(this.f224488c);
    }

    public java.lang.String toString() {
        return "RecreationConfig(disconnectAsCrashFreqThreshold=" + this.f224486a + ", maxCrashLimitBeforeCloseFeature=" + this.f224487b + ", recoverFeatureSwitchAfter=" + this.f224488c + ')';
    }
}
