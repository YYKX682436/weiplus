package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class f8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.PressImageView f210418d;

    public f8(com.tencent.mm.ui.tools.PressImageView pressImageView) {
        this.f210418d = pressImageView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/PressImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.ui.tools.PressImageView pressImageView = this.f210418d;
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            pressImageView.f210139d.removeCallbacks(pressImageView.f210140e);
        } else if (action == 1 || action == 3) {
            pressImageView.f210139d.post(pressImageView.f210140e);
        }
        boolean z17 = (pressImageView.isClickable() || pressImageView.isLongClickable()) ? false : true;
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/PressImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
