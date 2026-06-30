package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class tj implements al5.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f170526a;

    public tj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f170526a = snsInfoFlip;
    }

    @Override // al5.z3
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170526a;
        r45.jj4 M = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.M(snsInfoFlip);
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
            return;
        }
        if (M.f377856e == 6 || snsInfoFlip.T(M) || M.f377856e == 2) {
            ta4.f1.f416743a.a(1, com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).getCurrentScale());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
    }

    @Override // al5.z3
    public void onDoubleTap(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170526a;
        r45.jj4 M = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.M(snsInfoFlip);
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
            return;
        }
        if (M.f377856e == 6 || snsInfoFlip.T(M)) {
            android.view.View currentView = snsInfoFlip.getCurrentView();
            if (currentView != null) {
                if (!com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).getAddTouchView()) {
                    db5.e7 a17 = al5.y3.f6102a.a(currentView);
                    if (a17 != null) {
                        a17.setInterceptDetach(true);
                        com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).setEnable(true);
                    }
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip.O(snsInfoFlip, currentView);
                }
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).e(f17, f18);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).setEnable(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
    }
}
