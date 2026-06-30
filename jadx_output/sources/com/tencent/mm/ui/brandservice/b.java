package com.tencent.mm.ui.brandservice;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198041d;

    public b(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198041d = brandServiceNotifyUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI = this.f198041d;
            brandServiceNotifyUI.f198030q = rawX;
            brandServiceNotifyUI.f198031r = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
