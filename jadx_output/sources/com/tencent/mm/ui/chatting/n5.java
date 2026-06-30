package com.tencent.mm.ui.chatting;

/* loaded from: classes4.dex */
public class n5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f202010d = android.graphics.Color.argb(255, 136, 136, 136);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$ChangeViewBgOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.graphics.drawable.Drawable drawable = view instanceof android.widget.ImageView ? ((android.widget.ImageView) view).getDrawable() : view.getBackground();
        if (drawable != null) {
            if (action == 0) {
                drawable.setColorFilter(this.f202010d, android.graphics.PorterDuff.Mode.MULTIPLY);
            } else if (action == 3 || action == 1) {
                drawable.clearColorFilter();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$ChangeViewBgOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
