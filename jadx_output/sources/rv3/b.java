package rv3;

/* loaded from: classes5.dex */
public final class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f400376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv3.h f400377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv3.e f400378f;

    public b(android.view.View view, rv3.h hVar, rv3.e eVar) {
        this.f400376d = view;
        this.f400377e = hVar;
        this.f400378f = eVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f400376d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/AbsMusicPickerListItemConvert$blinkView$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/AbsMusicPickerListItemConvert$blinkView$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rv3.g gVar = rv3.g.f400392d;
        rv3.h hVar = this.f400377e;
        hVar.getClass();
        hVar.f400397f = gVar;
        java.lang.String str = this.f400378f.f400388i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f400376d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/AbsMusicPickerListItemConvert$blinkView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/AbsMusicPickerListItemConvert$blinkView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rv3.g gVar = rv3.g.f400392d;
        rv3.h hVar = this.f400377e;
        hVar.getClass();
        hVar.f400397f = gVar;
        java.lang.String str = this.f400378f.f400388i;
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
