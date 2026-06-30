package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class z7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207274d;

    public z7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207274d = openIMAddressUIFragment;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f207274d;
            openIMAddressUIFragment.hideVKB();
            openIMAddressUIFragment.f206524m = (int) motionEvent.getRawX();
            openIMAddressUIFragment.f206525n = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
