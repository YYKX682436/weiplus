package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vh0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ai0 f114726d;

    public vh0(com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var) {
        this.f114726d = ai0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGamePlugin$mount$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = this.f114726d;
        if (action == 2 && ai0Var.f111895w == 0 && java.lang.Math.abs(ai0Var.f111896x - motionEvent.getY()) > ai0Var.f111897y && ((mm2.c1) ai0Var.P0(mm2.c1.class)).Z2) {
            db5.t7.m(ai0Var.f365323d.getContext(), ai0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.leb));
        }
        ai0Var.f111896x = (int) motionEvent.getY();
        ai0Var.f111895w = motionEvent.getAction();
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGamePlugin$mount$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
