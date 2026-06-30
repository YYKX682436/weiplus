package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f114869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f114870e;

    public w4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, boolean z17) {
        this.f114869d = a5Var;
        this.f114870e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f114869d;
        a5Var.f365323d.setVisibility(8);
        a5Var.X.f118343a.setTranslationY(com.tencent.mm.ui.bl.b(r0.getContext()).y);
        a5Var.Y.f119840a.setTranslationY(com.tencent.mm.ui.bl.b(r0.getContext()).y);
        a5Var.f111800r.setTranslationY(0.0f);
        if (this.f114870e) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z4(a5Var));
        }
    }
}
