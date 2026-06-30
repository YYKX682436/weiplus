package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class fh implements com.tencent.mm.ui.tools.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f168344a;

    public fh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f168344a = snsCommentImageFlowUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.w7(this.f168344a, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
    }

    @Override // com.tencent.mm.ui.tools.o4
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
        this.f168344a.f166810o.getCurrentImageView();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setEnterAnimRunning$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f168344a;
        snsCommentImageFlowUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setEnterAnimRunning$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsCommentImageFlowUI.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.o0();
        }
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.w7(snsCommentImageFlowUI, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setEnterAnimRunning$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f168344a;
        snsCommentImageFlowUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setEnterAnimRunning$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsCommentImageFlowUI.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.S();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1$onPreDraw$2");
    }
}
