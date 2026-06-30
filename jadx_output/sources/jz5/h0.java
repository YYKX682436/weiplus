package jz5;

/* loaded from: classes7.dex */
public abstract class h0 {
    public static final double a(long j17) {
        return ((j17 >>> 11) * 2048) + (j17 & 2047);
    }

    public static final java.lang.String b(long j17, int i17) {
        if (j17 >= 0) {
            r26.a.a(i17);
            java.lang.String l17 = java.lang.Long.toString(j17, i17);
            kotlin.jvm.internal.o.f(l17, "toString(...)");
            return l17;
        }
        long j18 = i17;
        long j19 = ((j17 >>> 1) / j18) << 1;
        long j27 = j17 - (j19 * j18);
        if (j27 >= j18) {
            j27 -= j18;
            j19++;
        }
        r26.a.a(i17);
        java.lang.String l18 = java.lang.Long.toString(j19, i17);
        kotlin.jvm.internal.o.f(l18, "toString(...)");
        r26.a.a(i17);
        java.lang.String l19 = java.lang.Long.toString(j27, i17);
        kotlin.jvm.internal.o.f(l19, "toString(...)");
        return l18.concat(l19);
    }
}
