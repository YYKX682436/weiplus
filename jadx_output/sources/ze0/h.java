package ze0;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ze0.h f471763a = new ze0.h();

    public final xe0.u0 a(int i17, bi4.c cVar) {
        xe0.r0 a17 = new xe0.r0().a().a();
        a17.f453773a = i17;
        a17.f453780h = xe0.p0.f453767d;
        a17.f453778f = false;
        a17.f453779g = false;
        xe0.t0 t0Var = xe0.t0.f453795e;
        a17.f453789q = t0Var;
        a17.f453790r = t0Var;
        jz5.l b17 = b(cVar);
        if (b17 != null) {
            int intValue = ((java.lang.Number) b17.f302833d).intValue();
            int intValue2 = ((java.lang.Number) b17.f302834e).intValue();
            a17.f453781i = intValue;
            a17.f453782j = intValue2;
        }
        return a17.a();
    }

    public final jz5.l b(bi4.c cVar) {
        android.content.res.Resources resources;
        jz5.l lVar;
        if (cVar == null || (resources = com.tencent.mm.sdk.platformtools.x2.f193075e) == null) {
            return null;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 8) {
            int color = resources.getColor(com.tencent.mm.R.color.FG_0);
            lVar = new jz5.l(java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color));
        } else if (ordinal == 9) {
            int color2 = resources.getColor(com.tencent.mm.R.color.FG_2);
            lVar = new jz5.l(java.lang.Integer.valueOf(color2), java.lang.Integer.valueOf(color2));
        } else if (ordinal == 11) {
            lVar = new jz5.l(-1, -1);
        } else {
            if (ordinal != 13) {
                return null;
            }
            int color3 = resources.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2);
            lVar = new jz5.l(java.lang.Integer.valueOf(color3), java.lang.Integer.valueOf(color3));
        }
        return lVar;
    }
}
