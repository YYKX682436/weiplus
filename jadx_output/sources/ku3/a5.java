package ku3;

/* loaded from: classes3.dex */
public final class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i5 f312166d;

    public a5(ku3.i5 i5Var) {
        this.f312166d = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuRatioPlugin$initRatioBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        ku3.i5 i5Var = this.f312166d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(i5Var.b(), "scaleX", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(i5Var.b(), "alpha", 1.0f, 0.0f);
        i5Var.b().setPivotX(i5Var.f312277v);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.addListener(new ku3.z4(i5Var));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuRatioPlugin$initRatioBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
