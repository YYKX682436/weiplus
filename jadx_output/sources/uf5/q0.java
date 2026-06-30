package uf5;

/* loaded from: classes4.dex */
public class q0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427284d;

    public q0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427284d = contactMgrUIBase;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase = this.f427284d;
            contactMgrUIBase.hideVKB();
            contactMgrUIBase.f207117x = (int) motionEvent.getRawX();
            contactMgrUIBase.f207118y = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
