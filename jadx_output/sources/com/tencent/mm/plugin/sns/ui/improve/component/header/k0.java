package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168850d;

    public k0(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC) {
        this.f168850d = improveHeaderUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onActivityResult$1");
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout access$getCoverLayout = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getCoverLayout(this.f168850d);
        access$getCoverLayout.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFoldIfExpand", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        if (access$getCoverLayout.f169067e == 2) {
            access$getCoverLayout.e(access$getCoverLayout.f169066d, 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFoldIfExpand", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onActivityResult$1");
    }
}
