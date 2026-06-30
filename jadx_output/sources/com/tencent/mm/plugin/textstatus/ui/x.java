package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class x implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f174414d;

    public x(android.content.Context context) {
        this.f174414d = context;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 1) {
            qj4.s.m(qj4.s.f363958a, this.f174414d, 85L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
