package te2;

/* loaded from: classes2.dex */
public final class z implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a0 f418552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418553e;

    public z(te2.a0 a0Var, java.lang.String str) {
        this.f418552d = a0Var;
        this.f418553e = str;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationCancel view=" + mMPAGView);
        android.view.View view = this.f418552d.f417844d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationCancel", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationCancel", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationStart view=" + mMPAGView);
        te2.a0 a0Var = this.f418552d;
        android.widget.FrameLayout frameLayout = a0Var.f417848h;
        if (frameLayout != null) {
            kotlinx.coroutines.r2 r2Var = a0Var.f417847g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            a0Var.f417847g = kotlinx.coroutines.l.d(a0Var.f417846f, null, null, new te2.x(a0Var, frameLayout, this.f418553e, null), 3, null);
        }
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationEnd view=" + mMPAGView);
        android.view.View view = this.f418552d.f417844d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationRepeat view=" + mMPAGView);
    }
}
