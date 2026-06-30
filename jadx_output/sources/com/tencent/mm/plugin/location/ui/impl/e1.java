package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class e1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144798d;

    public e1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144798d = x1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$21", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144798d;
        if (x1Var.S) {
            x1Var.C();
        } else if (x1Var.Q) {
            x1Var.y(com.tencent.mm.plugin.location.ui.impl.w1.OPENED);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$21", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
