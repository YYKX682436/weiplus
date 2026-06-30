package ku3;

/* loaded from: classes3.dex */
public final class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f312423d;

    public u2(ku3.e3 e3Var) {
        this.f312423d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initBeautyBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        ku3.e3 e3Var = this.f312423d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(e3Var.c(), "scaleX", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(e3Var.c(), "alpha", 1.0f, 0.0f);
        e3Var.c().setPivotX(e3Var.f312221x);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.addListener(new ku3.t2(e3Var));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initBeautyBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
