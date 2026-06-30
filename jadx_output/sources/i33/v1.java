package i33;

/* loaded from: classes4.dex */
public final class v1 implements al5.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.x1 f288282d;

    public v1(i33.x1 x1Var) {
        this.f288282d = x1Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        kotlin.jvm.internal.o.g(scaleGestureDetector, "scaleGestureDetector");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        java.lang.Object tag;
        kotlin.jvm.internal.o.g(scaleGestureDetector, "scaleGestureDetector");
        i33.x1 x1Var = this.f288282d;
        androidx.appcompat.app.AppCompatActivity activity = x1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
        e33.v2 v2Var = ((com.tencent.mm.plugin.gallery.ui.ImagePreviewUI) activity).f138579e;
        android.view.View e17 = v2Var.e(v2Var.f247511v);
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = x1Var.f288288d;
        if (e17 != null && (tag = e17.getTag(com.tencent.mm.R.id.tzk)) != null) {
            if (((java.lang.Integer) tag).intValue() == 6) {
                db5.e7 a17 = al5.y3.f6102a.a(e17);
                if (a17 != null) {
                    a17.setInterceptDetach(true);
                    touchMediaPreviewLayout.setEnable(true);
                }
                i33.x1.T6(x1Var, e17);
                return true;
            }
        }
        touchMediaPreviewLayout.setEnable(false);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
        kotlin.jvm.internal.o.g(scaleGestureDetector, "scaleGestureDetector");
    }
}
