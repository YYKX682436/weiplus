package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class h7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f190348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f190349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190350f;

    public h7(android.view.View view, com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190349e = view;
        this.f190350f = c8Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f190348d = motionEvent.getRawY();
        } else {
            float f17 = 0.0f;
            com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190350f;
            android.view.View view2 = this.f190349e;
            if (valueOf != null && valueOf.intValue() == 2) {
                float rawY = motionEvent.getRawY() - this.f190348d;
                int height = view2.getHeight() / 2;
                c8Var.f190221c.getSelectHelper().a();
                if (rawY > 0.0f) {
                    f17 = height;
                    if (rawY < f17) {
                        f17 = rawY;
                    }
                }
                view2.setTranslationY(f17);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                int height2 = view2.getHeight() / 8;
                float translationY = view2.getTranslationY();
                if (translationY > height2) {
                    c8Var.a();
                } else {
                    if (translationY < ((java.lang.Number) ((jz5.n) c8Var.f190227i).getValue()).intValue() && view != null) {
                        view.performClick();
                    }
                    view2.animate().translationY(0.0f).start();
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
