package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ChatroomContactUI f207187d;

    public t0(com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI) {
        this.f207187d = chatroomContactUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        bb5.g gVar;
        bb5.g gVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ChatroomContactUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI = this.f207187d;
        if (action == 0) {
            chatroomContactUI.hideVKB();
            chatroomContactUI.f206349q = (int) motionEvent.getRawX();
            chatroomContactUI.f206350r = (int) motionEvent.getRawY();
        }
        com.tencent.mm.ui.contact.s0 s0Var = chatroomContactUI.f206345m;
        if (s0Var != null && (gVar2 = s0Var.f207165q) != null) {
            gVar2.c(motionEvent);
        }
        yk5.u uVar = chatroomContactUI.f206346n;
        if (uVar != null && (gVar = uVar.f462916z) != null) {
            gVar.c(motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/ChatroomContactUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
