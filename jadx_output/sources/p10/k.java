package p10;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350964d;

    public k(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350964d = magicDebugPanelView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createSwipeButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350964d;
        if (magicDebugPanelView.f65827t == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "simulateSwipe failed: parentView is null");
        } else {
            android.util.DisplayMetrics displayMetrics = magicDebugPanelView.getContext().getResources().getDisplayMetrics();
            float f17 = displayMetrics.widthPixels / 2.0f;
            float f18 = displayMetrics.heightPixels / 2.0f;
            long j17 = (f18 / magicDebugPanelView.f65828u) * 1000;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "simulateSwipe: startX=" + f17 + ", startY=" + f18 + ", endX=" + f17 + ", endY=0.0, distance=" + f18 + "px, duration=" + j17 + "ms, speed=" + magicDebugPanelView.f65828u + " px/s");
            if (magicDebugPanelView.f65827t == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "postSwipeEvents failed: parentView is null");
            } else {
                magicDebugPanelView.c(0, f17, f18);
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(j17);
                ofFloat.addUpdateListener(new p10.q(f17, f17, f18, 0.0f, magicDebugPanelView));
                ofFloat.addListener(new p10.r(magicDebugPanelView, f17, 0.0f));
                ofFloat.start();
            }
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createSwipeButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
