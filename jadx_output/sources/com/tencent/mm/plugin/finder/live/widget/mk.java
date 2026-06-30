package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mk implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f119079d;

    public mk(java.lang.ref.WeakReference rWidget) {
        kotlin.jvm.internal.o.g(rWidget, "rWidget");
        this.f119079d = rWidget;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        com.tencent.mm.plugin.finder.live.widget.rk rkVar = (com.tencent.mm.plugin.finder.live.widget.rk) this.f119079d.get();
        if (rkVar != null) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                rkVar.f119653a.v1();
            }
        }
        return jz5.f0.f302826a;
    }
}
