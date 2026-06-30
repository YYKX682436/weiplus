package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class j2 implements com.tencent.mm.ui.tools.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171173a;

    public j2(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        this.f171173a = snsCommentEmoticonDetailUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }

    @Override // com.tencent.mm.ui.tools.o4
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        android.view.View U6 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.U6(this.f171173a);
        float f18 = 1 - f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$runExitAnimation$1", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        U6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$runExitAnimation$1", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        this.f171173a.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }
}
