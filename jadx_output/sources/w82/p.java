package w82;

/* loaded from: classes10.dex */
public final class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundCornerFrameLayout f443918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel f443919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f443920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f443921g;

    public p(com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout, com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel, android.widget.ImageView imageView, yz5.a aVar) {
        this.f443918d = roundCornerFrameLayout;
        this.f443919e = favFilterPanel;
        this.f443920f = imageView;
        this.f443921g = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f443918d.setVisibility(8);
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel = this.f443919e;
        android.view.View view = favFilterPanel.f101539r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        favFilterPanel.f101543v = false;
        favFilterPanel.e(this.f443920f, false);
        yz5.a aVar = this.f443921g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f443918d.setVisibility(8);
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel = this.f443919e;
        android.view.View view = favFilterPanel.f101539r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        favFilterPanel.f101543v = false;
        favFilterPanel.e(this.f443920f, false);
        yz5.a aVar = this.f443921g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
