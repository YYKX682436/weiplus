package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.BaseLifeUI f152323d;

    public j(com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI) {
        this.f152323d = baseLifeUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152323d;
        baseLifeUI.getClass();
        if (baseLifeUI.K) {
            return false;
        }
        if (!z17) {
            if (!baseLifeUI.R && !com.tencent.mm.sdk.platformtools.n2.a()) {
                com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI2 = this.f152323d;
                baseLifeUI2.R = true;
                db5.e1.C(baseLifeUI2, baseLifeUI2.getString(com.tencent.mm.R.string.fs_), baseLifeUI.getString(com.tencent.mm.R.string.f490573yv), baseLifeUI.getString(com.tencent.mm.R.string.g6z), baseLifeUI.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.nearlife.ui.i(this), null);
            }
            return true;
        }
        int i18 = (int) d18;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2003, f17, f18, i18);
        baseLifeUI.K = true;
        i11.e eVar = baseLifeUI.f152240p;
        if (eVar != null) {
            ((i11.h) eVar).m(baseLifeUI.T);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "on get location %f %f " + java.lang.System.currentTimeMillis(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        baseLifeUI.f152244t = new r45.d64();
        r45.d64 d64Var = baseLifeUI.f152244t;
        d64Var.f372178h = "";
        d64Var.f372179i = 0;
        d64Var.f372175e = f18;
        d64Var.f372174d = f17;
        d64Var.f372177g = "";
        d64Var.f372176f = i18;
        baseLifeUI.f152245u = f18;
        baseLifeUI.f152246v = f17;
        baseLifeUI.f152247w = i17;
        baseLifeUI.f152248x = (float) d18;
        i11.e eVar2 = baseLifeUI.f152240p;
        baseLifeUI.f152249y = eVar2 == null ? false : ((i11.h) eVar2).f287092a;
        double d27 = f18;
        double d28 = f17;
        baseLifeUI.b7(d27, d28);
        java.util.ArrayList arrayList = baseLifeUI.f152234g.f152304i;
        if (arrayList == null || arrayList.size() <= 0) {
            baseLifeUI.a7(d27, d28);
        } else {
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData = (com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData) arrayList.get(arrayList.size() - 1);
            baseLifeUI.a7(backwardSupportUtil$ExifHelper$LatLongData.f192409d, backwardSupportUtil$ExifHelper$LatLongData.f192410e);
            float f19 = backwardSupportUtil$ExifHelper$LatLongData.f192409d;
            float f27 = backwardSupportUtil$ExifHelper$LatLongData.f192410e;
            baseLifeUI.getClass();
            baseLifeUI.E = o25.l2.a((double) f19, (double) f27, d27, d28) > 1000.0d;
        }
        com.tencent.mm.plugin.nearlife.ui.a aVar = baseLifeUI.f152234g;
        r45.d64 d64Var2 = baseLifeUI.f152244t;
        float f28 = d64Var2.f372175e;
        float f29 = d64Var2.f372174d;
        aVar.f152308p = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(f28, f29);
        com.tencent.mm.plugin.nearlife.ui.a aVar2 = baseLifeUI.f152235h;
        aVar2.f152308p = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(f28, f29);
        if (baseLifeUI.I) {
            aVar = aVar2;
        }
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.U6(baseLifeUI, aVar);
        baseLifeUI.d7(false);
        baseLifeUI.addSearchMenu(true, baseLifeUI.H);
        return false;
    }
}
