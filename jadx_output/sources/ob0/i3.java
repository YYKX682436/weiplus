package ob0;

/* loaded from: classes12.dex */
public interface i3 extends i95.m {
    static void rf(ob0.i3 i3Var, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: noteProcessCall");
        }
        if ((i17 & 2) != 0) {
            j17 = java.lang.System.currentTimeMillis();
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            str2 = bm5.f1.a();
            kotlin.jvm.internal.o.f(str2, "getProcessName(...)");
        }
        java.lang.String str5 = str2;
        if ((i17 & 16) != 0) {
            str4 = null;
        }
        ((com.tencent.mm.feature.performance.q) i3Var).Ni(str, j18, str5, str3, str4);
    }
}
