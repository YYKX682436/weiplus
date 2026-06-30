package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class im implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f112989d;

    public im(com.tencent.mm.plugin.finder.live.plugin.bn bnVar) {
        this.f112989d = bnVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.bn bnVar = this.f112989d;
            android.view.View view2 = bnVar.f112053q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = bnVar.f112053q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.ViewPropertyAnimator viewPropertyAnimator = bnVar.f112054r;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.finder.live.plugin.ap apVar = (com.tencent.mm.plugin.finder.live.plugin.ap) bnVar.X0(com.tencent.mm.plugin.finder.live.plugin.ap.class);
            if (apVar != null) {
                apVar.R1(true);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
