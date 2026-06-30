package ox2;

/* loaded from: classes8.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.i iVar) {
    }

    public static java.lang.CharSequence a(ox2.g0 g0Var, android.content.Context context, java.lang.String rawDesc, char c17, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj) {
        java.lang.CharSequence j17;
        java.lang.CharSequence j18;
        char c18 = (i29 & 4) != 0 ? '#' : c17;
        int dimensionPixelSize = (i29 & 8) != 0 ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) : i17;
        int i37 = (i29 & 16) != 0 ? com.tencent.mm.R.raw.icons_outlined_like : i18;
        int i38 = (i29 & 32) != 0 ? com.tencent.mm.R.raw.icons_outlined_star_new : i19;
        int i39 = (i29 & 64) != 0 ? com.tencent.mm.R.color.FG_0 : i27;
        int i47 = (i29 & 128) != 0 ? com.tencent.mm.R.color.FG_0 : i28;
        g0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rawDesc, "rawDesc");
        char c19 = c18;
        int K = r26.n0.K(rawDesc, c19, 0, false, 6, null);
        int K2 = r26.n0.K(rawDesc, c19, K + 1, false, 4, null);
        int i48 = dimensionPixelSize;
        int i49 = dimensionPixelSize;
        j17 = hc2.x0.j(rawDesc, context, K, i37, i39, i48, i49, (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        j18 = hc2.x0.j(j17, context, K2, i38, i47, i48, i49, (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        return j18;
    }
}
