package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 f171460d;

    public z(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3) {
        this.f171460d = snsWsFoldDetailUIV3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$initActionBar$2");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWsFoldSettingBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportWsFoldSettingBtn >> ".concat("view_clk"));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_3_dot", "view_clk", kz5.q0.f314001d, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWsFoldSettingBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        int i17 = com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.f171336e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setupBottomSheet", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3 = this.f171460d;
        snsWsFoldDetailUIV3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupBottomSheet", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) snsWsFoldDetailUIV3.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.sns.ui.wsfold.b0(snsWsFoldDetailUIV3);
        k0Var.C = com.tencent.mm.plugin.sns.ui.wsfold.c0.f171343a;
        k0Var.f211881s = new com.tencent.mm.plugin.sns.ui.wsfold.g0(snsWsFoldDetailUIV3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupBottomSheet", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setupBottomSheet", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        k0Var.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$initActionBar$2");
        return true;
    }
}
