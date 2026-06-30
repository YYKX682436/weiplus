package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oq implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113779d;

    public oq(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f113779d = etVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113779d;
            int i17 = etVar.U;
            etVar.getClass();
            boolean z17 = true;
            if (i17 != 0 && i17 != etVar.f112451q) {
                z17 = false;
            }
            java.lang.String str = "0";
            if (!z17) {
                if (i17 == etVar.f112452r) {
                    str = "2";
                } else if (i17 == etVar.f112453s) {
                    str = "1";
                }
            }
            r0Var.ak(2, 2, kz5.b1.e(new jz5.l(ya.b.SOURCE, str)));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
