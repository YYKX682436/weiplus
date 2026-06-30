package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.r f174233d = new com.tencent.mm.plugin.textstatus.ui.r();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
