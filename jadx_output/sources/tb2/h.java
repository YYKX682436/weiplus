package tb2;

/* loaded from: classes3.dex */
public final class h extends rs.k {

    /* renamed from: t, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f416977t;

    public h(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f416977t = recyclerView;
        ae2.in inVar = ae2.in.f3688a;
        com.tencent.mars.xlog.Log.i("RecyclerFadeInDownAnimator", "FINDER_LIVE_SINGLE_FEED_SET_FINISH value: " + ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3828o).getValue()).r()).intValue());
    }

    @Override // rs.k
    public void E(androidx.recyclerview.widget.k3 k3Var) {
        if (k3Var != null) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = this.f416977t.getItemAnimator();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            boolean z17 = (s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null) instanceof so2.h1;
            com.tencent.mars.xlog.Log.i("RecyclerFadeInDownAnimator", "animateRemoveImpl: " + k3Var.hashCode() + ' ' + k3Var.getAdapterPosition() + " originAnimate: " + h0Var.f310123d + " liveFeed: " + z17);
            if (!z17) {
                super.E(k3Var);
                return;
            }
            this.f399285q.add(k3Var);
            android.view.ViewPropertyAnimator animate = k3Var.itemView.animate();
            animate.translationY((-k3Var.itemView.getHeight()) * 1.0f);
            animate.setDuration(300L);
            animate.setInterpolator(animate.getInterpolator());
            animate.setListener(new tb2.g(k3Var, z17, this, animate, h0Var));
            animate.setStartDelay(n());
            animate.start();
        }
    }

    public final void K(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(v17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/live/RecyclerFadeInDownAnimator", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        v17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(v17, "com/tencent/mm/plugin/finder/convert/live/RecyclerFadeInDownAnimator", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        v17.setScaleY(1.0f);
        v17.setScaleX(1.0f);
        v17.setTranslationY(0.0f);
        v17.setTranslationX(0.0f);
        v17.setRotation(0.0f);
        v17.setRotationY(0.0f);
        v17.setRotationX(0.0f);
        v17.setPivotY(v17.getMeasuredHeight() / 2.0f);
        v17.setPivotX(v17.getMeasuredWidth() / 2.0f);
        v17.animate().setInterpolator(null).setStartDelay(0L);
    }
}
