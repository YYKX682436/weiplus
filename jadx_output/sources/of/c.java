package of;

/* loaded from: classes3.dex */
public final class c implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f344822d;

    /* renamed from: e, reason: collision with root package name */
    public final long f344823e;

    /* renamed from: f, reason: collision with root package name */
    public final long f344824f;

    public c(long j17, long j18, long j19) {
        this.f344822d = j17;
        this.f344823e = j18;
        this.f344824f = j19;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        of.c other = (of.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        long j17 = this.f344822d;
        long j18 = other.f344822d;
        if (j17 > j18) {
            return 1;
        }
        return j17 < j18 ? -1 : 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d17 = this.f344822d;
        int i17 = 0;
        while (d17 >= 1024.0d) {
            d17 /= 1024.0f;
            i17++;
            if (i17 == 4) {
                break;
            }
        }
        java.lang.String format = java.lang.String.format("%.2f%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17), strArr[i17]}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append(": [0x");
        r26.a.a(16);
        java.lang.String l17 = java.lang.Long.toString(this.f344823e, 16);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", 0x");
        r26.a.a(16);
        java.lang.String l18 = java.lang.Long.toString(this.f344824f, 16);
        kotlin.jvm.internal.o.f(l18, "toString(...)");
        sb6.append(l18);
        sb6.append(')');
        return sb6.toString();
    }
}
