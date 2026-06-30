package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ef implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBrowseUI f168237d;

    public ef(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI) {
        this.f168237d = snsBrowseUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$7");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "onSceneEnd:%s errtype:%s errcode:%s", m1Var, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (m1Var instanceof com.tencent.mm.plugin.sns.model.p2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "onSceneEnd from NetSceneSnsObjectDetial");
            boolean I = ((com.tencent.mm.plugin.sns.model.p2) m1Var).I(i17, i18);
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f168237d;
            if (I) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "onSceneEnd: respObject nil, forbidAccess = true");
                int i19 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                snsBrowseUI.H1 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
            int i27 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI.J1 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            boolean z17 = snsBrowseUI.F1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                snsBrowseUI.t7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$7");
    }
}
