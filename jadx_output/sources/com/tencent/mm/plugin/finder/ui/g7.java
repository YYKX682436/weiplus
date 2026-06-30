package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class g7 implements com.tencent.mm.ui.tools.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129289a;

    public g7(com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI) {
        this.f129289a = finderImagePreviewUI;
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void a(float f17, float f18) {
        float f19 = 1;
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129289a;
        if (finderImagePreviewUI.f128588w == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        float height = f19 - (f18 / r2.getHeight());
        if (height > 1.0f) {
            height = 1.0f;
        }
        java.lang.String str = finderImagePreviewUI.f128586u;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = finderImagePreviewUI.f128588w;
        if (mMGestureGallery == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        android.view.View selectedView = mMGestureGallery.getSelectedView();
        kotlin.jvm.internal.o.e(selectedView, "null cannot be cast to non-null type com.tencent.mm.ui.base.MultiTouchImageView");
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) selectedView;
        if (finderImagePreviewUI.f128588w == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        multiTouchImageView.setPivotX(r5.getWidth() / 2);
        if (finderImagePreviewUI.f128588w == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        multiTouchImageView.setPivotY(r5.getHeight() / 2);
        multiTouchImageView.setScaleX(height);
        multiTouchImageView.setScaleY(height);
        multiTouchImageView.setTranslationX(f17);
        multiTouchImageView.setTranslationY(f18);
        android.view.View view = finderImagePreviewUI.f128587v;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(height));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$initDragGallery$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$initDragGallery$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void b(float f17, float f18) {
    }
}
