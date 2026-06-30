package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gm implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.im f168444a;

    public gm(com.tencent.mm.plugin.sns.ui.im imVar) {
        this.f168444a = imVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$1");
        com.tencent.mm.plugin.sns.ui.im imVar = this.f168444a;
        com.tencent.mm.plugin.sns.ui.bm bmVar = imVar.f168627m;
        android.view.ViewGroup viewGroup = imVar.f168625h;
        com.tencent.mm.plugin.sns.storage.v1 v1Var = imVar.f168621d;
        int i17 = com.tencent.mm.plugin.sns.ui.bm.f167953x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        bmVar.F(viewGroup, v1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$1");
    }
}
