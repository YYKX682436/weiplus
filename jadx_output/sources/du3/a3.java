package du3;

/* loaded from: classes10.dex */
public final class a3 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243511a;

    public a3(du3.t3 t3Var) {
        this.f243511a = t3Var;
    }

    @Override // qk.y7
    public void a(qk.g6 features) {
        bn5.f baseBoardView;
        kotlin.jvm.internal.o.g(features, "features");
        if (features == qk.g6.DOODLE || features == qk.g6.TEXT || features == qk.g6.MOSAIC) {
            du3.t3 t3Var = this.f243511a;
            if (!t3Var.f243733w) {
                ym5.x2 x2Var = t3Var.f243730t;
                if ((x2Var == null || (baseBoardView = x2Var.getBaseBoardView()) == null || !baseBoardView.g()) ? false : true) {
                    t3Var.f243733w = true;
                    android.view.ViewGroup viewGroup = t3Var.f243719f;
                    android.content.Context context = viewGroup.getContext();
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211776c = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ode);
                    e4Var.c();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "[onSelectedFeature] features:%s", features.name());
    }

    @Override // qk.y7
    public void b(qk.g6 features, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(features, "features");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "[onSelectedDetailFeature] features:%s index:%s", features.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
