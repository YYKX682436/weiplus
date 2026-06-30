package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class a1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ChatroomContactUI f206576d;

    public a1(com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI) {
        this.f206576d = chatroomContactUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ChatroomContactUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        a31.v vVar = this.f206576d.f206343h;
        vVar.b();
        vVar.s();
        yj0.a.i(true, this, "com/tencent/mm/ui/contact/ChatroomContactUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
