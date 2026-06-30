package ou0;

/* loaded from: classes5.dex */
public abstract class f {
    public static final com.tencent.maas.model.time.MJTime a(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime minimumValue) {
        kotlin.jvm.internal.o.g(mJTime, "<this>");
        kotlin.jvm.internal.o.g(minimumValue, "minimumValue");
        return mJTime.smallThan(minimumValue) ? minimumValue : mJTime;
    }

    public static final com.tencent.maas.model.time.MJTime b(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime maximumValue) {
        kotlin.jvm.internal.o.g(mJTime, "<this>");
        kotlin.jvm.internal.o.g(maximumValue, "maximumValue");
        return mJTime.bigThan(maximumValue) ? maximumValue : mJTime;
    }

    public static final boolean c(com.tencent.maas.model.time.MJTime mJTime, long j17) {
        kotlin.jvm.internal.o.g(mJTime, "<this>");
        if (!(mJTime instanceof ou0.g)) {
            return false;
        }
        long j18 = ((ou0.g) mJTime).f348889d;
        return j18 <= 0 ? j17 == j18 : (j18 & j17) == j17;
    }

    public static final java.lang.String d(long j17) {
        long j18 = j17 / 1000;
        long j19 = 60;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18 / j19), java.lang.Long.valueOf(j18 % j19)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
