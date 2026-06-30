package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.p8 f161351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161352e;

    public n8(com.tencent.mm.plugin.setting.ui.setting.p8 p8Var, int i17) {
        this.f161351d = p8Var;
        this.f161352e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        int i17;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f161351d.f161427d;
        if (f4Var == null) {
            return;
        }
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.tencent.mm.plugin.setting.ui.setting.p8 p8Var = this.f161351d;
        p8Var.f161427d = null;
        if (this.f161352e != 0) {
            db5.t7.g(p8Var.getContext(), this.f161351d.getContext().getResources().getString(com.tencent.mm.R.string.awc));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeCloseUIC", "onSceneEnd update care mode succeed!, isOpenCare:%s", java.lang.Boolean.valueOf(p8Var.f161429f));
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("caremode_setting_succeed", true);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(this.f161351d.f161429f));
        j65.e.n(false);
        if (j65.e.g()) {
            if (this.f161351d.f161429f) {
                ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ni();
            } else {
                ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ai(true);
                ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ui();
            }
        }
        com.tencent.mm.plugin.setting.ui.setting.p8 p8Var2 = this.f161351d;
        boolean z17 = !p8Var2.f161429f;
        int b17 = f14.e.b(p8Var2.getContext());
        float n17 = i65.a.n(p8Var2.getContext());
        if (j65.e.e()) {
            f17 = 1.4f;
            i17 = 5;
        } else {
            i17 = b17;
            f17 = n17;
        }
        if (z17) {
            b17 = j65.c.e(p8Var2.getContext());
            n17 = j65.c.c(p8Var2.getContext());
            j65.e.j(0);
        } else if (b17 < i17) {
            j65.e.j(5);
            n17 = f17;
            b17 = i17;
        } else {
            j65.e.j(0);
        }
        f14.e.d(p8Var2.getContext(), n17, b17);
        j65.f.k(f14.e.c(b17));
        gm0.j1.u().c().i(true);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.setting.ui.setting.o8 o8Var = new com.tencent.mm.plugin.setting.ui.setting.o8(p8Var2);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(o8Var, 200L, false);
    }
}
