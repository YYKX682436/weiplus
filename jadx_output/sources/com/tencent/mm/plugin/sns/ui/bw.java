package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bw implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI f168065d;

    public bw(com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f168065d = snsWsFoldDetailUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$8");
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI = this.f168065d;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "set unfold, username:%s", snsWsFoldDetailUI.f167632o);
            r45.xg4 xg4Var = new r45.xg4();
            xg4Var.f390074d = snsWsFoldDetailUI.f167632o;
            xg4Var.f390075e = 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(230, xg4Var));
            com.tencent.mm.plugin.sns.ui.f8 qj6 = com.tencent.mm.plugin.sns.model.l4.qj();
            java.lang.String str = snsWsFoldDetailUI.f167632o;
            qj6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            qj6.f168318h.add(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            snsWsFoldDetailUI.T6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            db5.t7.h(snsWsFoldDetailUI.getContext(), snsWsFoldDetailUI.getString(com.tencent.mm.R.string.f493270ji5));
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("comfirmUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            s0Var.Z.f60737m = 1L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("comfirmUnfoldButton", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$8");
    }
}
