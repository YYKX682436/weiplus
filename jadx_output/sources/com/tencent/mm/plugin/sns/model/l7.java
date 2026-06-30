package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class l7 implements com.tencent.mm.plugin.sns.model.k4 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.statistics.l f164433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f164434b;

    public l7(int i17) {
        this.f164434b = 0;
        this.f164434b = i17;
    }

    @Override // com.tencent.mm.plugin.sns.model.k4
    public com.tencent.mm.plugin.sns.statistics.l a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        com.tencent.mm.plugin.sns.statistics.l lVar = this.f164433a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        return lVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.k4
    public int getScene() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.model.TimelineContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.model.TimelineContext");
        return this.f164434b;
    }
}
