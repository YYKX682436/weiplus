package kx2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final kx2.a f313278a = new kx2.a();

    /* renamed from: b, reason: collision with root package name */
    public static float f313279b;

    public final float a(android.content.Context context) {
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        int c17 = com.tencent.mm.ui.bl.c(context);
        com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
        int c18 = e8Var.c(null);
        int a17 = e8Var.a() - c17;
        float f17 = c18 * 0.5625f;
        float f18 = a17;
        float f19 = f18 - f17;
        float f27 = f313279b;
        if (!(f27 == 0.0f) && f19 < f27) {
            f17 = f18 - f27;
            com.tencent.mars.xlog.Log.w("FinderHalfScreenConstants", "getHalfScreenRatio: too large, height=" + a17 + ", halfScreenAreaHeight=" + f19 + ", minHalfCommentHeight=" + f313279b + ", topAreaHeight=" + f17);
        }
        float f28 = f17 / f18;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y9).getValue()).r()).intValue() == 1) || f28 <= 0.0f || f28 >= 1.0f) {
            return 0.75f;
        }
        return 1 - f28;
    }
}
