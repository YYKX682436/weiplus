package com.tencent.mm.ui.tools;

/* loaded from: classes2.dex */
public final class h5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f210454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f210455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f210456f;

    public h5(int i17, int i18, java.lang.Float f17) {
        this.f210454d = i17;
        this.f210455e = i18;
        this.f210456f = f17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/LinkPressedUtil$setPressedBGSelector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z17 = false;
        if (action == 0) {
            if (view != null) {
                view.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(this.f210455e));
            }
            java.lang.Float f17 = this.f210456f;
            if (f17 != null) {
                f17.floatValue();
                double doubleValue = java.lang.Double.valueOf(f17.floatValue()).doubleValue();
                java.lang.Float f18 = (doubleValue > 0.0d ? 1 : (doubleValue == 0.0d ? 0 : -1)) >= 0 && (doubleValue > 1.0d ? 1 : (doubleValue == 1.0d ? 0 : -1)) <= 0 ? f17 : null;
                if (f18 != null) {
                    f18.floatValue();
                    if (view != null) {
                        float floatValue = f17.floatValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(java.lang.Float.valueOf(floatValue));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/tools/LinkPressedUtil", "press", "(Landroid/view/View;ILjava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view, "com/tencent/mm/ui/tools/LinkPressedUtil", "press", "(Landroid/view/View;ILjava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
            }
        } else if (action == 1 || action == 3) {
            if (view != null) {
                view.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(this.f210454d));
            }
            if (view != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/tools/LinkPressedUtil", "depress", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/tools/LinkPressedUtil", "depress", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        if (!view.isClickable() && !view.isLongClickable()) {
            z17 = true;
        }
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/LinkPressedUtil$setPressedBGSelector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
