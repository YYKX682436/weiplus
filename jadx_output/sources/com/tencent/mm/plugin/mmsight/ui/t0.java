package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes3.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView f149420d;

    public t0(com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView mMSightTopCountdownCoverView) {
        this.f149420d = mMSightTopCountdownCoverView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView mMSightTopCountdownCoverView = this.f149420d;
        android.view.View view = mMSightTopCountdownCoverView.f149218e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToAlmostEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToAlmostEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMSightTopCountdownCoverView.f149221h.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) mMSightTopCountdownCoverView.f149220g.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.addRule(14);
        layoutParams.addRule(2, mMSightTopCountdownCoverView.f149218e.getId());
        mMSightTopCountdownCoverView.requestLayout();
        mMSightTopCountdownCoverView.invalidate();
    }
}
