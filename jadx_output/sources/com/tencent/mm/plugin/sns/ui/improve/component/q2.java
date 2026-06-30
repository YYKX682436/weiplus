package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f168979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f168980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f168981g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168982h;

    public q2(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, android.view.View view) {
        this.f168978d = snsWsFoldInputUIC;
        this.f168979e = f0Var;
        this.f168980f = f0Var2;
        this.f168981g = snsCommentFooter;
        this.f168982h = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC = this.f168978d;
        if (snsWsFoldInputUIC.getActivity().isDestroyed() || snsWsFoldInputUIC.getActivity().isFinishing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scrollRecyclerViewToInputView index:");
        kotlin.jvm.internal.f0 f0Var = this.f168979e;
        sb6.append(f0Var.f310116d);
        sb6.append(" lastFooterBottom:");
        kotlin.jvm.internal.f0 f0Var2 = this.f168980f;
        sb6.append(f0Var2.f310116d);
        sb6.append(" currBottom:");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f168981g;
        sb6.append(snsCommentFooter.getCurrBottom());
        com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", sb6.toString());
        if (f0Var2.f310116d != snsCommentFooter.getCurrBottom()) {
            int i17 = f0Var.f310116d;
            f0Var.f310116d = i17 - 1;
            if (i17 > 0) {
                f0Var2.f310116d = snsCommentFooter.getCurrBottom();
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(this, 10L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        int Y6 = snsWsFoldInputUIC.Y6(this.f168982h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        snsWsFoldInputUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        int[] iArr = new int[2];
        snsCommentFooter.getLocationInWindow(iArr);
        int i18 = Y6 - iArr[1];
        if (i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        } else {
            snsWsFoldInputUIC.X6().scrollBy(0, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
    }
}
