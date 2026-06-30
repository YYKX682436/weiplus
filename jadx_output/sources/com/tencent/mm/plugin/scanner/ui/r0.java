package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class r0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159619d;

    public r0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159619d = productUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159619d;
        if (!z17) {
            if (!productUI.K && !com.tencent.mm.sdk.platformtools.n2.a()) {
                com.tencent.mm.plugin.scanner.ui.ProductUI productUI2 = this.f159619d;
                productUI2.K = true;
                db5.e1.C(productUI2, productUI2.getString(com.tencent.mm.R.string.fs_), productUI.getString(com.tencent.mm.R.string.f490573yv), productUI.getString(com.tencent.mm.R.string.g6z), productUI.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.scanner.ui.j0(this), null);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "getLocation fail");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "getLocation suc");
        if (productUI.f159319q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "do getActionInfoScene, lng=" + f17 + ", lat=" + f18);
            gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.c0(productUI.C, com.tencent.mm.plugin.scanner.model.n0.a(productUI.f159319q.f246032a), productUI.f159324v, productUI.D, (double) f17, (double) f18));
        }
        i11.e eVar = productUI.I;
        if (eVar != null) {
            ((i11.h) eVar).m(productUI.L);
        }
        if (!productUI.f159308J) {
            productUI.f159308J = true;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, f17, f18, (int) d18);
        }
        return false;
    }
}
