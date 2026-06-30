package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public final class v2 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.w2 f173162a;

    public v2(com.tencent.mm.plugin.teenmode.ui.w2 w2Var) {
        this.f173162a = w2Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public final void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderTeenModeContentManageUIC", "selectBirth: select new date, year=" + i17 + ", month=" + i18);
            com.tencent.mm.plugin.teenmode.ui.w2 w2Var = this.f173162a;
            w2Var.f173171e = i18;
            w2Var.f173170d = i17;
            w2Var.f173174h.set(1, java.lang.Integer.valueOf(i18));
            w2Var.f173174h.set(0, java.lang.Integer.valueOf(i17));
            w2Var.O6();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.r.f460525a.e(i17, i18, w2Var.f173172f);
            ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) pf5.u.f353936a.e(zy2.b6.class).c(iz2.c.class))).W6(w2Var.f173174h, "selectBirth");
        }
    }
}
