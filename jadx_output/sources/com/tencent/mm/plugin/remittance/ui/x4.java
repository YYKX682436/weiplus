package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes3.dex */
public class x4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f158032d;

    public x4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f158032d = remittanceDetailUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$35", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158032d;
            remittanceDetailUI.f157362o2 = rawX;
            remittanceDetailUI.f157366p2 = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$35", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
