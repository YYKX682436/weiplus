package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class g4 implements com.tencent.mm.ui.tools.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.TranslationResultUI f159556a;

    public g4(com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI) {
        this.f159556a = translationResultUI;
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void a(float f17, float f18) {
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159556a;
        float height = 1.0f - (f18 / translationResultUI.f159477p.getHeight());
        float f19 = height <= 1.0f ? height : 1.0f;
        if (translationResultUI.f159478q != null) {
            if (f17 == 0.0f && f18 == 0.0f) {
                android.view.View view = translationResultUI.f159480s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = translationResultUI.f159480s;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            translationResultUI.f159478q.setPivotX(translationResultUI.f159477p.getWidth() / 2);
            translationResultUI.f159478q.setPivotY(translationResultUI.f159477p.getHeight() / 2);
            translationResultUI.f159478q.setScaleX(f19);
            translationResultUI.f159478q.setScaleY(f19);
            translationResultUI.f159478q.setTranslationX(f17);
            translationResultUI.f159478q.setTranslationY(f18);
            android.view.View view3 = translationResultUI.f159481t;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(f19));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void b(float f17, float f18) {
    }
}
