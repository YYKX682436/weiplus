package e1;

/* loaded from: classes14.dex */
public abstract class d0 {
    public static final z0.t a(z0.t tVar, yz5.l block) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(block, "block");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return tVar.k(new e1.p(block, androidx.compose.ui.platform.e3.f10553d));
    }

    public static z0.t b(z0.t graphicsLayer, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47, long j17, e1.a1 a1Var, boolean z17, e1.w0 w0Var, long j18, long j19, int i17, java.lang.Object obj) {
        long j27;
        float f48 = (i17 & 1) != 0 ? 1.0f : f17;
        float f49 = (i17 & 2) != 0 ? 1.0f : f18;
        float f57 = (i17 & 4) != 0 ? 1.0f : f19;
        float f58 = (i17 & 8) != 0 ? 0.0f : f27;
        float f59 = (i17 & 16) != 0 ? 0.0f : f28;
        float f66 = (i17 & 32) != 0 ? 0.0f : f29;
        float f67 = (i17 & 64) != 0 ? 0.0f : f37;
        float f68 = (i17 & 128) != 0 ? 0.0f : f38;
        float f69 = (i17 & 256) != 0 ? 0.0f : f39;
        float f76 = (i17 & 512) != 0 ? 8.0f : f47;
        if ((i17 & 1024) != 0) {
            int i18 = e1.i1.f246273c;
            j27 = e1.i1.f246272b;
        } else {
            j27 = j17;
        }
        e1.a1 shape = (i17 & 2048) != 0 ? e1.v0.f246289a : a1Var;
        boolean z18 = (i17 & 4096) != 0 ? false : z17;
        e1.w0 w0Var2 = (i17 & 8192) != 0 ? null : w0Var;
        long j28 = (i17 & 16384) != 0 ? e1.f0.f246252a : j18;
        long j29 = (i17 & 32768) != 0 ? e1.f0.f246252a : j19;
        kotlin.jvm.internal.o.g(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.o.g(shape, "shape");
        boolean z19 = androidx.compose.ui.platform.f3.f10562a;
        return graphicsLayer.k(new e1.d1(f48, f49, f57, f58, f59, f66, f67, f68, f69, f76, j27, shape, z18, w0Var2, j28, j29, androidx.compose.ui.platform.e3.f10553d, null));
    }
}
