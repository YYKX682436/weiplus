package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class s4 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f174279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f174280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f174281d;

    public s4(int i17, int i18, float f17, int i19) {
        this.f174278a = i17;
        this.f174279b = i18;
        this.f174280c = f17;
        this.f174281d = i19;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            float f17 = this.f174280c;
            view.setScaleX((((this.f174278a / view.getWidth()) - 1.0f) * f17) + 1.0f);
            view.setScaleY((((this.f174279b / view.getHeight()) - 1.0f) * f17) + 1.0f);
            if (f17 > 0.8d) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1 - ((f17 - 0.8f) / 0.2f)));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f174281d);
    }
}
