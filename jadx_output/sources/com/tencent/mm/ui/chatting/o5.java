package com.tencent.mm.ui.chatting;

/* loaded from: classes4.dex */
public class o5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.q5 f202064d;

    public o5(com.tencent.mm.ui.chatting.q5 q5Var) {
        this.f202064d = q5Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.chatting.q5 q5Var = this.f202064d;
        com.tencent.mm.ui.chatting.n5 n5Var = q5Var.f202608p;
        if (n5Var != null) {
            n5Var.onTouch(q5Var.f202600e, motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
