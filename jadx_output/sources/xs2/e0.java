package xs2;

/* loaded from: classes10.dex */
public final class e0 {
    public e0(kotlin.jvm.internal.i iVar) {
    }

    public final xs2.f0 a(boolean z17, mm2.y1 y1Var, int i17) {
        if (y1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveDanmakuConfig", "createLiveDanmakuConfig fail,baseConfig is null!");
            return null;
        }
        int ordinal = y1Var.f329552a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return z17 ? new xs2.f0(xs2.x.f456393a, new xs2.y(), b(y1Var, ((java.lang.Number) ((jz5.n) xs2.f0.f456323e).getValue()).intValue(), i17)) : new xs2.f0(xs2.z.f456396a, new xs2.a0(), b(y1Var, ((java.lang.Number) ((jz5.n) xs2.f0.f456323e).getValue()).intValue(), i17));
            }
            throw new jz5.j();
        }
        if (!z17) {
            return null;
        }
        xs2.v vVar = xs2.v.f456390a;
        xs2.w wVar = new xs2.w();
        xp.a aVar = new xp.a();
        aVar.f455803a = i17;
        aVar.f455804b = i17;
        aVar.f455805c = 6500;
        aVar.f455806d = 12000;
        aVar.f455807e = 0;
        aVar.f455808f = 0;
        aVar.f455813k = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479671c8);
        aVar.f455811i = 1;
        aVar.f455821s = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        aVar.f455822t = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        return new xs2.f0(vVar, wVar, aVar);
    }

    public final xp.a b(mm2.y1 y1Var, int i17, int i18) {
        jz5.o oVar;
        float f17;
        xp.a aVar = new xp.a();
        xs2.e0 e0Var = xs2.f0.f456322d;
        mm2.b2 range = y1Var.f329554c.f329599a;
        kotlin.jvm.internal.o.g(range, "range");
        int i19 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        int dimensionPixelOffset = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelOffset2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelOffset3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479693cs);
        int floor = (int) java.lang.Math.floor((i19 - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7)) / (dimensionPixelOffset3 + dimensionPixelOffset2));
        if (floor < 3) {
            floor = 3;
        }
        int i27 = ((i19 - (dimensionPixelOffset - dimensionPixelOffset2)) - (floor * dimensionPixelOffset3)) / floor;
        if (i27 >= dimensionPixelOffset2) {
            dimensionPixelOffset2 = i27;
        }
        int i28 = dimensionPixelOffset3 + dimensionPixelOffset2;
        int ordinal = range.ordinal();
        if (ordinal == 0) {
            int i29 = dimensionPixelOffset2 / 2;
            oVar = new jz5.o(3, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(dimensionPixelOffset - i29));
        } else if (ordinal == 1) {
            int ceil = (int) java.lang.Math.ceil(((i19 / 2.0f) - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn)) / i28);
            int i37 = dimensionPixelOffset2 / 2;
            oVar = new jz5.o(java.lang.Integer.valueOf(ceil >= 3 ? ceil : 3), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(dimensionPixelOffset - i37));
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            int i38 = dimensionPixelOffset2 / 2;
            oVar = new jz5.o(java.lang.Integer.valueOf(floor), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(dimensionPixelOffset - i38));
        }
        aVar.f455803a = i18;
        aVar.f455804b = ((java.lang.Number) oVar.f302841d).intValue();
        aVar.f455805c = 6500;
        mm2.c2 c2Var = y1Var.f329555d;
        aVar.f455806d = c2Var.f328930a;
        aVar.f455807e = c2Var.f328931b;
        aVar.f455808f = 0;
        aVar.f455813k = ((java.lang.Number) oVar.f302842e).intValue();
        aVar.f455812j = ((java.lang.Number) oVar.f302843f).intValue();
        mm2.d2 trans = y1Var.f329554c.f329600b;
        kotlin.jvm.internal.o.g(trans, "trans");
        int ordinal2 = trans.ordinal();
        if (ordinal2 == 0) {
            f17 = 1.0f;
        } else if (ordinal2 == 1) {
            f17 = 0.8f;
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            f17 = 0.5f;
        }
        aVar.f455810h = f17;
        aVar.f455811i = i17;
        aVar.f455814l = true;
        aVar.f455815m = true;
        aVar.f455816n = true;
        ae2.in inVar = ae2.in.f3688a;
        aVar.f455817o = ((java.lang.Number) ae2.in.I3.r()).intValue() == 1;
        aVar.f455818p = ((java.lang.Boolean) ((jz5.n) xs2.f0.f456324f).getValue()).booleanValue();
        aVar.f455819q = ((java.lang.Boolean) ((jz5.n) xs2.f0.f456325g).getValue()).booleanValue();
        aVar.f455820r = true;
        aVar.f455821s = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        aVar.f455822t = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        return aVar;
    }
}
