package qk;

/* loaded from: classes11.dex */
public interface g8 {
    static void a(qk.g8 g8Var, android.content.Context context, bw5.ar0 ar0Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoPlayerPage");
        }
        if ((i17 & 1) != 0) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        if ((i17 & 2) != 0) {
            ar0Var = bw5.ar0.TingScene_UnDefined;
        }
        ((rk4.c4) g8Var).b(context, ar0Var);
    }
}
