package k13;

/* loaded from: classes10.dex */
public final class t0 implements l13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303266a;

    public t0(k13.l1 l1Var) {
        this.f303266a = l1Var;
    }

    @Override // l13.c
    public void a(android.view.View view) {
        android.graphics.drawable.Drawable background;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        background.clearColorFilter();
    }

    @Override // l13.c
    public void b(android.view.View view, int i17, int i18, float f17, android.view.View view2, android.view.View view3) {
        android.view.View view4;
        android.view.View view5;
        int i19 = i17 - i18;
        k13.l1 l1Var = this.f303266a;
        int max = 255 - ((int) ((java.lang.Math.max(0.0f, i19 - f17) * (l1Var.f303213g ? 0.2f : 0.05f)) * 255));
        int rgb = android.graphics.Color.rgb(max, max, max);
        android.graphics.drawable.Drawable background = view != null ? view.getBackground() : null;
        if (background != null) {
            background.setColorFilter(new android.graphics.PorterDuffColorFilter(rgb, android.graphics.PorterDuff.Mode.MULTIPLY));
        }
        if (i19 == 0 && i18 == l1Var.f303239q.size() - 2 && (view5 = l1Var.f303237o) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1 - f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (i19 == 0 && i18 == l1Var.f303239q.size() - 1 && (view4 = l1Var.f303237o) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
