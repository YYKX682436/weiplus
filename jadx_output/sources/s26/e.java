package s26;

/* loaded from: classes11.dex */
public abstract class e {
    public static final double a(double d17, s26.d sourceUnit, s26.d targetUnit) {
        kotlin.jvm.internal.o.g(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.o.g(targetUnit, "targetUnit");
        long convert = targetUnit.f402377d.convert(1L, sourceUnit.f402377d);
        return convert > 0 ? d17 * convert : d17 / r8.convert(1L, r9);
    }

    public static final long b(long j17, s26.d sourceUnit, s26.d targetUnit) {
        kotlin.jvm.internal.o.g(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.o.g(targetUnit, "targetUnit");
        return targetUnit.f402377d.convert(j17, sourceUnit.f402377d);
    }

    public static final long c(long j17, s26.d sourceUnit, s26.d targetUnit) {
        kotlin.jvm.internal.o.g(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.o.g(targetUnit, "targetUnit");
        return targetUnit.f402377d.convert(j17, sourceUnit.f402377d);
    }
}
