package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ye implements com.tencent.mm.ui.tools.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ze f171629a;

    public ye(com.tencent.mm.plugin.sns.ui.ze zeVar) {
        this.f171629a = zeVar;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
    }

    @Override // com.tencent.mm.ui.tools.o4
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
        com.tencent.mm.plugin.sns.ui.ze zeVar = this.f171629a;
        android.view.KeyEvent.Callback currentImageView = zeVar.f171689d.f166810o.getCurrentImageView();
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        boolean z17 = zeVar.f171689d.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (z17 && (currentImageView instanceof db5.f0)) {
            ((db5.f0) currentImageView).n(f17, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
        com.tencent.mm.plugin.sns.ui.ze zeVar = this.f171629a;
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = zeVar.f171689d;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.F1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI2 = zeVar.f171689d;
        boolean z17 = snsBrowseUI2.J1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI2.t7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        }
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBrowseUI2.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.o0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
        com.tencent.mm.plugin.sns.ui.ze zeVar = this.f171629a;
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = zeVar.f171689d;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.F1 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI2 = zeVar.f171689d;
        snsBrowseUI2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkRequestCheckFeedForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (snsBrowseUI2.I1 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "requestCheckFeedForbidAccess: ");
            snsBrowseUI2.J1 = true;
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.p2(snsBrowseUI2.I1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRequestCheckFeedForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBrowseUI2.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.S();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
    }
}
