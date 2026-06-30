package xx2;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx2.l f457967d;

    public c(xx2.l lVar) {
        this.f457967d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xx2.l lVar = this.f457967d;
        int height = lVar.f457982d.getHeight();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = lVar.f457984f;
        int width = constraintLayout.getWidth();
        int i17 = com.tencent.mm.ui.bk.h(lVar.f457980b).x;
        lVar.f457988j = width;
        lVar.f457989k = i17 - width;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = lVar.f457981c;
        lVar.f457990l = constraintLayout2.getBottom();
        lVar.f457991m = height;
        android.view.ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout = lVar.f457983e;
        ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams)).height = (int) (draggableConstraintLayout.getHeight() * (lVar.f457989k / draggableConstraintLayout.getWidth()));
        constraintLayout.setY(lVar.f457990l);
        constraintLayout.requestLayout();
        constraintLayout.setTranslationX(i17);
        constraintLayout2.setTranslationY(-constraintLayout2.getBottom());
        com.tencent.mars.xlog.Log.i(lVar.f457979a, "totalDistance:" + lVar.f457988j + ", targetBodyWidth:" + lVar.f457989k + ", targetBodyMarginTop:" + lVar.f457990l + " targetBodyMarginBottom:" + lVar.f457991m);
    }
}
