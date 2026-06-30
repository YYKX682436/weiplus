package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class b extends xm3.t0 {
    public final com.tencent.mm.plugin.sns.ui.improve.component.g2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, in5.s itemConvertFactory, com.tencent.mm.plugin.sns.ui.improve.component.g2 onUpdateCallback) {
        super(mvvmList, itemConvertFactory, false);
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(onUpdateCallback, "onUpdateCallback");
        this.K = onUpdateCallback;
    }

    @Override // xm3.t0, xm3.m0
    public void k(xm3.o0 pendingData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.wsfold.SnsFoldAdapter");
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        com.tencent.mm.plugin.sns.ui.improve.component.g2 g2Var = this.K;
        g2Var.a3(pendingData);
        super.k(pendingData);
        g2Var.B2(pendingData);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.wsfold.SnsFoldAdapter");
    }
}
