package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class ka implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.eb f209039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f209040e;

    public ka(com.tencent.mm.ui.ga gaVar, com.tencent.mm.ui.eb ebVar) {
        this.f209040e = gaVar;
        this.f209039d = ebVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean onTouch;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f209040e.f208650j) {
            android.view.View.OnTouchListener onTouchListener = this.f209039d.f208390p;
            onTouch = onTouchListener != null ? onTouchListener.onTouch(view, motionEvent) : false;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "callTouchCallback screen not enable.");
            onTouch = true;
        }
        yj0.a.i(onTouch, this, "com/tencent/mm/ui/MMActivityController$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }
}
