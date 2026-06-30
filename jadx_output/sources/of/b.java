package of;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344820a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344821b;

    public b(java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f344820a = name;
        this.f344821b = j17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f344820a);
        sb6.append(": ");
        java.lang.String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d17 = this.f344821b;
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
        return sb6.toString();
    }
}
