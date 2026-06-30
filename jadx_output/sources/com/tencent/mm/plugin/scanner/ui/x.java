package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class x implements android.view.View.OnTouchListener {
    public x(com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI productFurtherInfoUI) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductFurtherInfoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (view != null && view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/scanner/ui/ProductFurtherInfoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
