package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class w00 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120116d;

    public w00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f120116d = m10Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (kotlin.jvm.internal.o.b(view, this.f120116d.f119011m)) {
            int action = motionEvent.getAction();
            if (action == 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(0.3f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 1) {
                view.performClick();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 3) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
