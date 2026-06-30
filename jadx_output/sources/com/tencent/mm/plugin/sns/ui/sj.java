package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class sj implements al5.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f170474d;

    public sj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f170474d = snsInfoFlip;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170474d;
        r45.jj4 M = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.M(snsInfoFlip);
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
            return true;
        }
        if (M.f377856e == 6 || snsInfoFlip.T(M)) {
            android.view.View currentView = snsInfoFlip.getCurrentView();
            if (currentView != null) {
                db5.e7 a17 = al5.y3.f6102a.a(currentView);
                if (a17 != null) {
                    a17.setInterceptDetach(true);
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).setEnable(true);
                }
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip.O(snsInfoFlip, currentView);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).setEnable(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170474d;
        r45.jj4 M = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.M(snsInfoFlip);
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
            return;
        }
        if (M.f377856e == 6 || snsInfoFlip.T(M) || M.f377856e == 2) {
            ta4.f1.f416743a.a(2, com.tencent.mm.plugin.sns.ui.SnsInfoFlip.N(snsInfoFlip).getCurrentScale());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
    }
}
