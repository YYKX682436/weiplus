package r95;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f393455a;

    /* renamed from: b, reason: collision with root package name */
    public final long f393456b;

    public e(long j17, long j18) {
        this.f393455a = j17;
        this.f393456b = j18;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TimeRange(startTimeMs=");
        long j17 = this.f393455a;
        sb6.append(j17);
        sb6.append(", endTimeMs=");
        long j18 = this.f393456b;
        sb6.append(j18);
        sb6.append(" durationMS:");
        sb6.append(j18 - j17);
        sb6.append(')');
        return sb6.toString();
    }
}
