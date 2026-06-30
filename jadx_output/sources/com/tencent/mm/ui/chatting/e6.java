package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class e6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f200457d = new int[2];

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if ((motionEvent.getAction() & 255) == 0) {
            int rawX = (int) motionEvent.getRawX();
            int[] iArr = this.f200457d;
            iArr[0] = rawX;
            iArr[1] = (int) motionEvent.getRawY();
            view.setTag(com.tencent.mm.R.id.ohu, iArr);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
