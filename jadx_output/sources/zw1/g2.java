package zw1;

/* loaded from: classes15.dex */
public class g2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zw1.f2 f476635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zw1.i2 f476636b;

    public g2(zw1.i2 i2Var, zw1.f2 f2Var) {
        this.f476636b = i2Var;
        this.f476635a = f2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        zw1.i2 i2Var = this.f476636b;
        android.view.View view = i2Var.f476662c.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        zw1.f2 f2Var = this.f476635a;
        java.lang.String str = f2Var.f450196e;
        int i17 = 0;
        while (true) {
            if (i17 >= ((java.util.LinkedList) i2Var.f476662c.R).size()) {
                break;
            }
            if (((zw1.f2) ((java.util.LinkedList) i2Var.f476662c.R).get(i17)).f450196e.equals(f2Var.f450196e)) {
                ((zw1.f2) ((java.util.LinkedList) i2Var.f476662c.R).get(i17)).f476622s = true;
                java.lang.String str2 = f2Var.f450196e;
                break;
            }
            i17++;
        }
        i2Var.f476662c.n7();
        i2Var.f476660a = false;
        i2Var.a();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
