package oj;

/* loaded from: classes12.dex */
public final class y {
    public y(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.matrix.util.PssInfo a(android.os.Debug.MemoryInfo memoryInfo) {
        kotlin.jvm.internal.o.g(memoryInfo, "memoryInfo");
        com.tencent.matrix.util.PssInfo pssInfo = new com.tencent.matrix.util.PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
        pssInfo.f53114d = memoryInfo.getTotalPss();
        java.util.Map<java.lang.String, java.lang.String> memoryStats = memoryInfo.getMemoryStats();
        oj.x xVar = oj.x.f345720d;
        pssInfo.f53115e = xVar.a(memoryStats, "summary.java-heap");
        pssInfo.f53116f = xVar.a(memoryStats, "summary.native-heap");
        pssInfo.f53120m = xVar.a(memoryStats, "summary.code");
        pssInfo.f53121n = xVar.a(memoryStats, "summary.stack");
        pssInfo.f53117g = xVar.a(memoryStats, "summary.graphics");
        pssInfo.f53122o = xVar.a(memoryStats, "summary.private-other");
        pssInfo.f53118h = xVar.a(memoryStats, "summary.system");
        pssInfo.f53119i = xVar.a(memoryStats, "summary.total-swap");
        int i17 = pssInfo.f53115e;
        java.lang.Object a17 = oj.c0.a(android.os.Debug.MemoryInfo.class, "dalvikSwappedOut", memoryInfo);
        if (a17 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        pssInfo.f53123p = i17 + ((java.lang.Integer) a17).intValue();
        int i18 = pssInfo.f53116f;
        java.lang.Object a18 = oj.c0.a(android.os.Debug.MemoryInfo.class, "nativeSwappedOut", memoryInfo);
        if (a18 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        pssInfo.f53124q = i18 + ((java.lang.Integer) a18).intValue();
        int i19 = pssInfo.f53122o;
        java.lang.Object a19 = oj.c0.a(android.os.Debug.MemoryInfo.class, "otherSwappedOut", memoryInfo);
        if (a19 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        pssInfo.f53125r = i19 + ((java.lang.Integer) a19).intValue();
        return pssInfo;
    }

    public final com.tencent.matrix.util.PssInfo b() {
        android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
        android.os.Debug.getMemoryInfo(memoryInfo);
        return a(memoryInfo);
    }
}
