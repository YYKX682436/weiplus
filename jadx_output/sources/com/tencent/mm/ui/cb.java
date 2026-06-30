package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class cb implements android.view.View.OnTouchListener {
    public cb(com.tencent.mm.ui.ga gaVar) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            java.lang.System.currentTimeMillis();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/MMActivityController$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
