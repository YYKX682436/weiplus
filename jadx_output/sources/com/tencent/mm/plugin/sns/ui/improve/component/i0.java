package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f168910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f168911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f168912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168913h;

    public i0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, android.view.View view) {
        this.f168909d = improveInputUIC;
        this.f168910e = f0Var;
        this.f168911f = f0Var2;
        this.f168912g = snsCommentFooter;
        this.f168913h = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC = this.f168909d;
        if (improveInputUIC.getActivity().isDestroyed() || improveInputUIC.getActivity().isFinishing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scrollRecyclerViewToInputView index:");
        kotlin.jvm.internal.f0 f0Var = this.f168910e;
        sb6.append(f0Var.f310116d);
        sb6.append(" lastFooterBottom:");
        kotlin.jvm.internal.f0 f0Var2 = this.f168911f;
        sb6.append(f0Var2.f310116d);
        sb6.append(" currBottom:");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f168912g;
        sb6.append(snsCommentFooter.getCurrBottom());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", sb6.toString());
        if (f0Var2.f310116d != snsCommentFooter.getCurrBottom()) {
            int i17 = f0Var.f310116d;
            f0Var.f310116d = i17 - 1;
            if (i17 > 0) {
                f0Var2.f310116d = snsCommentFooter.getCurrBottom();
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(this, 10L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC2 = this.f168909d;
        android.view.View view = this.f168913h;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter2 = this.f168912g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int W6 = improveInputUIC2.W6(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.Y6(improveInputUIC2, view, snsCommentFooter2, W6, 0, 8, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
    }
}
