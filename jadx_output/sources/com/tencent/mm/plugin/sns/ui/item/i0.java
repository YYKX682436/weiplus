package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class i0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169342a;

    public i0(com.tencent.mm.plugin.sns.ui.item.m0 m0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f169342a = snsInfo;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
        long j17 = this.f169342a.localid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
        return j17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
        if (z17) {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).wj(false, this.f169342a.field_snsId, "", r13.localid, true, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
    }
}
