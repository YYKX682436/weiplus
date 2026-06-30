package i33;

/* loaded from: classes4.dex */
public final class x1 extends i33.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.TouchMediaPreviewLayout f288288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288288d = new com.tencent.mm.ui.widget.TouchMediaPreviewLayout(activity);
    }

    public static final void T6(i33.x1 x1Var, android.view.View view) {
        x1Var.getClass();
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
                if (childAt instanceof y51.c) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewMediaScaleUIC", "scaleTouchView >> " + i17 + " is MMLivePhotoPlayerBasicView");
                    y51.b bVar = (y51.b) ((y51.c) childAt);
                    android.view.View scaleParent = bVar.getScaleParent();
                    android.view.View scaleParent2 = bVar.getScaleParent();
                    if (scaleParent2 != null && scaleParent != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        scaleParent2.getGlobalVisibleRect(rect);
                        int i18 = rect.bottom - rect.top;
                        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = x1Var.f288288d;
                        if (i18 > 0) {
                            touchMediaPreviewLayout.setRealViewHeight(i18);
                            touchMediaPreviewLayout.setViewRect(rect);
                        }
                        touchMediaPreviewLayout.b(scaleParent);
                    }
                }
            }
        }
    }
}
