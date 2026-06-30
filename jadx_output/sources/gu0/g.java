package gu0;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f275675d;

    public g(hu0.a0 a0Var) {
        this.f275675d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu0.a0 a0Var = this.f275675d;
        int R6 = a0Var.R6();
        com.tencent.mars.xlog.Log.i("MJCC.RenderUIC", "onEditPanelOpenStart: estimatedHeightPx=" + R6);
        a0Var.f285014m = hu0.p.f285046e;
        a0Var.f285015n = R6;
        android.view.View view = a0Var.f285012h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "onEditPanelOpenStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "onEditPanelOpenStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setEnabled(false);
        }
        android.widget.FrameLayout frameLayout = a0Var.f285011g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        a0Var.V6(a0Var.f285016o, 1.0f, R6);
    }
}
