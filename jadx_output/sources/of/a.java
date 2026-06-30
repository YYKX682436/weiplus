package of;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f344818a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f344819b;

    public a(long j17, java.util.List sortedFreeRegionList) {
        kotlin.jvm.internal.o.g(sortedFreeRegionList, "sortedFreeRegionList");
        this.f344818a = j17;
        this.f344819b = sortedFreeRegionList;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d17 = this.f344818a;
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
        sb6.append(": ");
        java.util.List list = this.f344819b;
        int size = list.size();
        if (10 <= size) {
            size = 10;
        }
        java.lang.String arrays = java.util.Arrays.toString(list.subList(0, size).toArray(new of.c[0]));
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        return sb6.toString();
    }
}
