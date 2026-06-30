package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ot implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f170124d;

    public ot(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f170124d = snsUIAction;
    }

    @Override // db5.k5
    public boolean E0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction$5");
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f170124d;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        boolean z17 = false;
        android.view.View childAt = snsUIAction.f167483d.getChildAt(0);
        if (childAt != null && childAt.getTop() == 0 && snsUIAction.f167483d.getFirstVisiblePosition() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            z17 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction$5");
        return z17;
    }
}
