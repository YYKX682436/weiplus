package hu0;

/* loaded from: classes5.dex */
public final class o extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f285044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(hu0.m.f285042d);
    }

    public static void P6(hu0.o oVar, java.lang.String str, yz5.a aVar, int i17, java.lang.Object obj) {
        android.view.Window window;
        android.view.View decorView;
        if ((i17 & 1) != 0) {
            str = null;
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        oVar.getClass();
        com.tencent.mars.xlog.Log.i("MJCC.LoadingUIC", "showError: " + str);
        oVar.O6();
        androidx.appcompat.app.AppCompatActivity activity = oVar.getActivity();
        if (str == null) {
            str = oVar.getString(com.tencent.mm.R.string.o_b);
        }
        db5.t7.g(activity, str);
        if (aVar == null || (window = oVar.getActivity().getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.postDelayed(new hu0.n(aVar), 2500L);
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i("MJCC.LoadingUIC", "hideLoading");
        try {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f285044d;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.LoadingUIC", "hideLoading: dismiss failed: " + e17.getMessage());
        }
        this.f285044d = null;
    }

    public final void Q6() {
        com.tencent.mars.xlog.Log.i("MJCC.LoadingUIC", "showLoading");
        O6();
        try {
            this.f285044d = com.tencent.mm.ui.widget.dialog.u3.f(getActivity(), getString(com.tencent.mm.R.string.f490468vx), false, 0, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.LoadingUIC", "showLoading: failed to show MMProgressDialog: " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        com.tencent.mars.xlog.Log.i("MJCC.LoadingUIC", "onViewCreated");
    }
}
