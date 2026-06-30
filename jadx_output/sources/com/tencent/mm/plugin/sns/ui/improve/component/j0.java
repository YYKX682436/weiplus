package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class j0 extends android.view.WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f168920c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f168921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC, android.view.View view, com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, int i17) {
        super(1);
        this.f168918a = improveInputUIC;
        this.f168919b = view;
        this.f168920c = snsCommentFooter;
        this.f168921d = i17;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onEnd(android.view.WindowInsetsAnimation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onEnd(animation);
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.Y6(this.f168918a, this.f168919b, this.f168920c, this.f168921d, 0, 8, null);
        this.f168920c.setWindowInsetsAnimationCallback(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsets onProgress(android.view.WindowInsets insets, java.util.List animations) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        kotlin.jvm.internal.o.g(insets, "insets");
        kotlin.jvm.internal.o.g(animations, "animations");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        return insets;
    }
}
