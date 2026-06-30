package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class w6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI f158014d;

    public w6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI) {
        this.f158014d = remittanceF2fLargeMoneyUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f158014d.handleKeyboardTouchEvent(motionEvent);
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
