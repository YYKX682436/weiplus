package sc2;

/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(sc2.h1 h1Var, in5.s0 s0Var) {
        super(0);
        this.f405851d = h1Var;
        this.f405852e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc2.h1 h1Var = this.f405851d;
        android.view.View view = h1Var.X;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{android.graphics.Color.argb(0, 161, 161, 161), android.graphics.Color.argb(255, 161, 161, 161)});
        gradientDrawable.setCornerRadius(this.f405852e.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479644bj));
        android.view.View view2 = h1Var.X;
        if (view2 != null) {
            view2.setBackground(gradientDrawable);
        }
        android.view.View view3 = h1Var.X;
        android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = 0;
        }
        android.view.View view4 = h1Var.X;
        if (view4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar = h1Var.U;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(1, finderHorizontalLongVideoPlayerSeekBar != null ? finderHorizontalLongVideoPlayerSeekBar.getWidth() : 0);
        ofInt.addUpdateListener(new sc2.b1(h1Var));
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new sc2.c1(h1Var));
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofInt, ofFloat);
        animatorSet.addListener(new sc2.d1(h1Var));
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        animatorSet.setStartDelay(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.O5).getValue()).r()).longValue() * 1000);
        animatorSet.start();
        h1Var.f405933y0 = animatorSet;
        return jz5.f0.f302826a;
    }
}
