package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class i2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171164e;

    public i2(android.view.View view, com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        this.f171163d = view;
        this.f171164e = snsCommentEmoticonDetailUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runEnterAnimation$$inlined$doOnPreDraw$1");
        this.f171163d.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.f170868m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI = this.f171164e;
        com.tencent.mm.ui.tools.s4 V6 = snsCommentEmoticonDetailUI.V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        int width = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.U6(snsCommentEmoticonDetailUI).getWidth();
        int height = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.U6(snsCommentEmoticonDetailUI).getHeight();
        V6.f210699f = width;
        V6.f210700g = height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.ui.tools.s4 V62 = snsCommentEmoticonDetailUI.V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        android.view.View U6 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.U6(snsCommentEmoticonDetailUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBackgroundView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        android.view.View W6 = snsCommentEmoticonDetailUI.W6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBackgroundView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        V62.c(U6, W6, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runEnterAnimation$$inlined$doOnPreDraw$1");
        return true;
    }
}
