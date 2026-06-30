package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.w f144898d;

    public t(com.tencent.mm.plugin.location.ui.impl.w wVar) {
        this.f144898d = wVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/MMBaseMapUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.location.ui.impl.w wVar = this.f144898d;
        if (action == 0) {
            wVar.f144912g = motionEvent.getX();
            wVar.f144913h = motionEvent.getY();
            ((com.tencent.mm.plugin.location.ui.impl.x1) wVar).y(com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED);
        } else if (action == 1 && (java.lang.Math.abs(motionEvent.getX() - wVar.f144912g) > 10.0f || java.lang.Math.abs(motionEvent.getY() - wVar.f144913h) > 10.0f)) {
            wVar.m();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/location/ui/impl/MMBaseMapUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
