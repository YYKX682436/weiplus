package kr;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f311298d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f311299e;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/TouchToClick", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f311299e = false;
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new kr.h(this, v17), true);
            this.f311298d = b4Var;
            b4Var.c(android.view.ViewConfiguration.getKeyRepeatTimeout(), android.view.ViewConfiguration.getKeyRepeatDelay());
        } else if (actionMasked == 1 || actionMasked == 3) {
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f311298d;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            this.f311298d = null;
            if (!this.f311299e && event.getActionMasked() == 1) {
                v17.performClick();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/emoji/panel/TouchToClick", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
