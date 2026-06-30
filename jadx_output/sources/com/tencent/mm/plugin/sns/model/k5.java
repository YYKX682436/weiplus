package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class k5 implements com.tencent.mm.plugin.sns.model.k4 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.statistics.l f164354a;

    /* renamed from: b, reason: collision with root package name */
    public final int f164355b;

    public k5(int i17) {
        this.f164355b = 0;
        this.f164355b = i17;
    }

    @Override // com.tencent.mm.plugin.sns.model.k4
    public com.tencent.mm.plugin.sns.statistics.l a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        if (this.f164354a == null) {
            this.f164354a = new com.tencent.mm.plugin.sns.statistics.l();
        }
        com.tencent.mm.plugin.sns.statistics.l lVar = this.f164354a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        return lVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.k4
    public int getScene() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.model.SnsDetailContext");
        return this.f164355b;
    }
}
