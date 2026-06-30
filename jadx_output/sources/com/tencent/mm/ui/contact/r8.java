package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public final class r8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f207158d;

    public r8(android.widget.ImageView imageView) {
        this.f207158d = imageView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.widget.ImageView imageView = this.f207158d;
        if (action == 0) {
            imageView.setVisibility(0);
        } else if (action == 1 || action == 3) {
            imageView.setVisibility(8);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
