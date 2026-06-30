package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class lg implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.mg f174061d;

    public lg(com.tencent.mm.plugin.textstatus.ui.mg mgVar) {
        this.f174061d = mgVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.textstatus.ui.mg mgVar = this.f174061d;
        if (mgVar.f174109f != null) {
            mgVar.f174109f = null;
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
