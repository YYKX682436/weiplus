package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ch implements com.tencent.mm.ui.tools.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f168129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168131c;

    public ch(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, android.view.View view, android.view.View view2, float f17, float f18, float f19) {
        this.f168129a = snsCommentImageFlowUI;
        this.f168130b = view;
        this.f168131c = view2;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f168129a;
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.s7(snsCommentImageFlowUI).post(new com.tencent.mm.plugin.sns.ui.zg(snsCommentImageFlowUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
    }

    @Override // com.tencent.mm.ui.tools.o4
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        this.f168129a.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDragStart$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f168129a;
        snsCommentImageFlowUI.A1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDragStart$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.s7(snsCommentImageFlowUI).post(new com.tencent.mm.plugin.sns.ui.ah(snsCommentImageFlowUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f168129a;
        snsCommentImageFlowUI.f166810o.n0();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.s7(snsCommentImageFlowUI).postDelayed(new com.tencent.mm.plugin.sns.ui.bh(snsCommentImageFlowUI), 20L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6");
    }
}
