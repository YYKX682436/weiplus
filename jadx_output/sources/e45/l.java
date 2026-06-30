package e45;

/* loaded from: classes3.dex */
public final class l extends com.tencent.mm.plugin.game.chatroom.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f249408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f249409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e45.r f249410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f249411g;

    public l(android.view.View view, android.widget.LinearLayout linearLayout, e45.r rVar, int i17) {
        this.f249408d = view;
        this.f249409e = linearLayout;
        this.f249410f = rVar;
        this.f249411g = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f249408d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$doReverseAnim$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$doReverseAnim$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f249408d.setTranslationY(0.0f);
        this.f249409e.setTranslationY(0.0f);
        e45.r.O6(this.f249410f, this.f249411g);
    }
}
