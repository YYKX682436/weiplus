package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class eh implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f168238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f168239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168240f;

    public eh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17) {
        this.f168238d = snsCommentImageFlowUI;
        this.f168239e = layoutManager;
        this.f168240f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$scrollToComment$1");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f168238d;
        snsCommentImageFlowUI.f166810o.getGallery().setAlpha(1.0f);
        com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView t76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.t7(snsCommentImageFlowUI);
        if (t76 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        android.view.ViewTreeObserver viewTreeObserver = t76.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        android.view.View findViewByPosition = this.f168239e.findViewByPosition(this.f168240f);
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.w7(snsCommentImageFlowUI, false);
        if (findViewByPosition != null) {
            snsCommentImageFlowUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSaveBundle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSaveBundle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            snsCommentImageFlowUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (snsCommentImageFlowUI.B1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            } else {
                snsCommentImageFlowUI.B1 = true;
                if (snsCommentImageFlowUI.f167130y0 == null) {
                    snsCommentImageFlowUI.f167130y0 = new android.graphics.Rect();
                }
                android.graphics.Rect rect = snsCommentImageFlowUI.f167130y0;
                if (rect != null) {
                    snsCommentImageFlowUI.z7().e(rect.left, rect.top, rect.width(), rect.height());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipViewObserver", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsCommentImageFlowUI.f166810o;
                if (snsInfoFlip == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipViewObserver", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                } else {
                    snsInfoFlip.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.gh(snsCommentImageFlowUI));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipViewObserver", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$scrollToComment$1");
        return true;
    }
}
