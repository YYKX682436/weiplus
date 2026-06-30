package com.tencent.mm.plugin.product.ui;

/* loaded from: classes3.dex */
public class c implements android.view.View.OnTouchListener {
    public c(com.tencent.mm.plugin.product.ui.HtmlTextView2 htmlTextView2) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/HtmlTextView2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z17 = motionEvent.getAction() == 2;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/product/ui/HtmlTextView2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
