package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public class x0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f205964d;

    public x0(com.tencent.mm.ui.chatting.viewitems.i1 i1Var) {
        this.f205964d = i1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if ((motionEvent.getAction() & 255) == 0) {
            com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f205964d;
            i1Var.B[0] = (int) motionEvent.getRawX();
            i1Var.B[1] = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
