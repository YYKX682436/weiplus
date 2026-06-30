package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class q4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.MMBaseSelectContactUI f207135d;

    public q4(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI) {
        this.f207135d = mMBaseSelectContactUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI = this.f207135d;
        mMBaseSelectContactUI.s7();
        mMBaseSelectContactUI.Y6();
        mMBaseSelectContactUI.X6();
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
