package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class i extends com.tencent.mm.plugin.finder.report.d5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f125289p = false;
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        super.H0();
        com.tencent.mars.xlog.Log.i("Finder.FinderCampaignTwoFeedFlowReporter", "onRelease");
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        if (this.f125289p) {
            super.O0();
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderCampaignTwoFeedFlowReporter", "onInvisible");
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.d5
    public void U0(java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        if (kotlin.jvm.internal.o.b(invokeSource, "onRelease")) {
            return;
        }
        super.U0(invokeSource);
    }
}
