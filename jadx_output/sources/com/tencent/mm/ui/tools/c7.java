package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class c7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MaskImageButton f210314d;

    public c7(com.tencent.mm.ui.tools.MaskImageButton maskImageButton) {
        this.f210314d = maskImageButton;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/MaskImageButton$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.ui.tools.MaskImageButton maskImageButton = this.f210314d;
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            maskImageButton.f210085f.removeCallbacks(maskImageButton.f210086g);
        } else if (action == 1 || action == 3) {
            maskImageButton.f210085f.post(maskImageButton.f210086g);
        }
        boolean z17 = (maskImageButton.isClickable() || maskImageButton.isLongClickable()) ? false : true;
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/MaskImageButton$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
