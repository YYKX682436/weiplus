package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ht implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f168533d;

    public ht(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f168533d = snsUIAction;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
        com.tencent.mm.plugin.sns.ui.gt gtVar = new com.tencent.mm.plugin.sns.ui.gt(this);
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f168533d.f167492p;
        if (snsHeader != null) {
            snsHeader.setOnDragListener(gtVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
    }
}
