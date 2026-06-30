package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class nt implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f170055d;

    public nt(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f170055d = snsUIAction;
    }

    @Override // db5.j5
    public boolean A5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction$4");
        boolean h17 = this.f170055d.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction$4");
        return h17;
    }
}
