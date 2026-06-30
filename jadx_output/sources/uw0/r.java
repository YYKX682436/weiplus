package uw0;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431597d;

    public r(uw0.x xVar) {
        this.f431597d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View recommendTitleView;
        android.view.View recommendTitleView2;
        uw0.x xVar = this.f431597d;
        recommendTitleView = xVar.getRecommendTitleView();
        kotlin.jvm.internal.o.f(recommendTitleView, "access$getRecommendTitleView(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recommendTitleView, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$appearView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recommendTitleView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recommendTitleView, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$appearView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recommendTitleView2 = xVar.getRecommendTitleView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recommendTitleView2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$appearView$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        recommendTitleView2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(recommendTitleView2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$appearView$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
