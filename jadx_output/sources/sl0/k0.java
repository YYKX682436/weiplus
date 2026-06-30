package sl0;

/* loaded from: classes13.dex */
public final class k0 extends ll0.c {

    /* renamed from: e, reason: collision with root package name */
    public static final sl0.k0 f409165e = new sl0.k0();

    public final int b(java.lang.String str, int i17, boolean z17, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live_getCnt_1_");
        sb6.append(i17);
        sb6.append('_');
        sb6.append(str == null ? "null" : str);
        sb6.append('_');
        sb6.append(z17);
        java.lang.Object a17 = a(sb6.toString(), new sl0.g0(str, i17, z17, j17, j18));
        kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) a17).intValue();
    }

    public final int c(java.lang.String str, int i17, boolean z17, long j17, long j18, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live_getDayOfWeeAndHourOfDayCnt_");
        sb6.append(i17);
        sb6.append('_');
        sb6.append(str == null ? "null" : str);
        sb6.append('_');
        sb6.append(z17);
        sb6.append('_');
        sb6.append(i19);
        sb6.append('_');
        sb6.append(i18);
        java.lang.Object a17 = a(sb6.toString(), new sl0.h0(str, i17, z17, j17, j18, i18, i19));
        kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) a17).intValue();
    }

    public final int d(java.lang.String str, int i17, boolean z17, long j17, long j18, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live_getDayOfWeekCnt_");
        sb6.append(i17);
        sb6.append('_');
        sb6.append(str == null ? "null" : str);
        sb6.append('_');
        sb6.append(z17);
        sb6.append('_');
        sb6.append(i18);
        java.lang.Object a17 = a(sb6.toString(), new sl0.i0(str, i17, z17, j17, j18, i18));
        kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) a17).intValue();
    }

    public final int e(java.lang.String str, int i17, boolean z17, long j17, long j18, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live_getHourOfDayCnt_");
        sb6.append(i17);
        sb6.append('_');
        sb6.append(str == null ? "null" : str);
        sb6.append('_');
        sb6.append(z17);
        sb6.append('_');
        sb6.append(i18);
        java.lang.Object a17 = a(sb6.toString(), new sl0.j0(str, i17, z17, j17, j18, i18));
        kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) a17).intValue();
    }
}
