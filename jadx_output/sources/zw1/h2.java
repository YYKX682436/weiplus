package zw1;

/* loaded from: classes14.dex */
public class h2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.AnimationSet f476651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zw1.i2 f476652b;

    public h2(zw1.i2 i2Var, android.view.animation.AnimationSet animationSet) {
        this.f476652b = i2Var;
        this.f476651a = animationSet;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        android.view.animation.AnimationSet animationSet = this.f476651a;
        animationSet.setStartOffset(1700L);
        this.f476652b.f476662c.C.startAnimation(animationSet);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        android.view.View view = this.f476652b.f476662c.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$2", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$2", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
