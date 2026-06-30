package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class xp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.yp f171581d;

    public xp(com.tencent.mm.plugin.sns.ui.yp ypVar) {
        this.f171581d = ypVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$2");
        com.tencent.mm.plugin.sns.ui.yp ypVar = this.f171581d;
        if (com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.V6(ypVar.f171640d).getVisibility() != 0) {
            com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.V6(ypVar.f171640d).setVisibility(0);
            com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.V6(ypVar.f171640d).startAnimation(android.view.animation.AnimationUtils.loadAnimation(ypVar.f171640d.getContext(), com.tencent.mm.R.anim.f477783bc));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$2");
    }
}
