package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class rg implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f132960e;

    public rg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView, v65.n nVar) {
        this.f132959d = finderPopupBubbleView;
        this.f132960e = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f132960e.a(jz5.f0.f302826a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.finder.view.xf xfVar = com.tencent.mm.plugin.finder.view.FinderPopupBubbleView.B;
        this.f132959d.v();
        this.f132960e.a(jz5.f0.f302826a);
        com.tencent.mars.xlog.Log.i("FinderPopupBubbleView", "animation_end");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        android.widget.TextView title;
        java.lang.String str;
        int topPlaceHolderHeight;
        int rightPlaceHolderWidth;
        int iconSize;
        r45.u56 u56Var;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView = this.f132959d;
        title = finderPopupBubbleView.getTitle();
        r45.hp2 hp2Var = finderPopupBubbleView.f131355u;
        if (hp2Var == null || (u56Var = hp2Var.f376375e) == null || (str = u56Var.f387076d) == null) {
            str = "";
        }
        title.setText(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("animation_start=");
        topPlaceHolderHeight = finderPopupBubbleView.getTopPlaceHolderHeight();
        sb6.append(topPlaceHolderHeight);
        sb6.append(',');
        rightPlaceHolderWidth = finderPopupBubbleView.getRightPlaceHolderWidth();
        sb6.append(rightPlaceHolderWidth);
        sb6.append(',');
        iconSize = finderPopupBubbleView.getIconSize();
        sb6.append(iconSize);
        sb6.append(',');
        sb6.append(finderPopupBubbleView.f131351q);
        sb6.append(',');
        sb6.append(finderPopupBubbleView.f131352r);
        com.tencent.mars.xlog.Log.i("FinderPopupBubbleView", sb6.toString());
    }
}
