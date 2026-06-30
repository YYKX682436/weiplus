package ji;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final ji.f f299879d = new ji.f();

    public f() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.matrix.util.MemInfo[] amsMemInfos = (com.tencent.matrix.util.MemInfo[]) obj3;
        com.tencent.matrix.util.MemInfo[] debugMemInfos = (com.tencent.matrix.util.MemInfo[]) obj4;
        kotlin.jvm.internal.o.g(amsMemInfos, "amsMemInfos");
        kotlin.jvm.internal.o.g(debugMemInfos, "debugMemInfos");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sum pss of all process over threshold: amsSumPss = ");
        sb6.append(intValue);
        sb6.append(" KB, debugSumPss = ");
        sb6.append(intValue2);
        sb6.append(" KB amsMemDetail: ");
        java.lang.String arrays = java.util.Arrays.toString(amsMemInfos);
        kotlin.jvm.internal.o.f(arrays, "java.util.Arrays.toString(this)");
        sb6.append(arrays);
        sb6.append("\n==========\ndebugMemDetail: ");
        java.lang.String arrays2 = java.util.Arrays.toString(debugMemInfos);
        kotlin.jvm.internal.o.f(arrays2, "java.util.Arrays.toString(this)");
        sb6.append(arrays2);
        oj.j.b("Matrix.monitor.AppBgSumPssMonitor", sb6.toString(), new java.lang.Object[0]);
        return jz5.f0.f302826a;
    }
}
