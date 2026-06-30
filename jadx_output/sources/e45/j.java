package e45;

/* loaded from: classes3.dex */
public final class j extends com.tencent.mm.plugin.game.chatroom.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f249402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f249403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e45.r f249404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f249405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f249406h;

    public j(android.view.View view, android.widget.LinearLayout linearLayout, e45.r rVar, int i17, int i18) {
        this.f249402d = view;
        this.f249403e = linearLayout;
        this.f249404f = rVar;
        this.f249405g = i17;
        this.f249406h = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f249402d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$doExpandAnim$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$doExpandAnim$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f249402d.setTranslationY(0.0f);
        this.f249403e.setTranslationY(0.0f);
        e45.r.O6(this.f249404f, this.f249405g + this.f249406h);
    }
}
