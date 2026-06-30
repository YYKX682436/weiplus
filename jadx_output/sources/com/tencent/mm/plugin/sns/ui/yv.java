package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI f171650d;

    public yv(com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f171650d = snsWsFoldDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "click unfold button");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var.Z.f60736l = 1L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI = this.f171650d;
        snsWsFoldDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showUnfoldListBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        java.lang.String string = snsWsFoldDetailUI.getString(com.tencent.mm.R.string.ji8);
        com.tencent.mm.storage.z3 z3Var = snsWsFoldDetailUI.f167635r;
        if (z3Var != null) {
            int i18 = z3Var.I;
            if (i18 == 1) {
                string = snsWsFoldDetailUI.getString(com.tencent.mm.R.string.ji7);
            } else if (i18 == 2) {
                string = snsWsFoldDetailUI.getString(com.tencent.mm.R.string.ji6);
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) snsWsFoldDetailUI, 1, true);
        k0Var.r(string, 17, i65.a.b(snsWsFoldDetailUI.getContext(), 14), null);
        k0Var.f211872n = new com.tencent.mm.plugin.sns.ui.aw(snsWsFoldDetailUI);
        k0Var.f211881s = new com.tencent.mm.plugin.sns.ui.bw(snsWsFoldDetailUI);
        k0Var.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showUnfoldListBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$5");
    }
}
