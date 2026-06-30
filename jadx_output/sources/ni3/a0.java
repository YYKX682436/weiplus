package ni3;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337524g;

    public a0(android.view.View view, android.view.View view2, android.view.View view3, com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337521d = view;
        this.f337522e = view2;
        this.f337523f = view3;
        this.f337524g = finderStreamMonitorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        float translateOffset;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f337521d;
        java.lang.Object tag = view2.getTag();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = kotlin.jvm.internal.o.b(tag, bool);
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337524g;
        android.view.View view3 = this.f337522e;
        android.view.View view4 = this.f337523f;
        if (b17) {
            view3.animate().cancel();
            android.view.View view5 = this.f337522e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.animate().alpha(1.0f).setDuration(360L).start();
            view2.animate().cancel();
            view2.animate().alpha(0.0f).setDuration(360L).start();
            view4.animate().cancel();
            android.view.ViewPropertyAnimator animate = view4.animate();
            translateOffset = finderStreamMonitorView.getTranslateOffset();
            animate.translationX(-translateOffset).setListener(new ni3.x(finderStreamMonitorView)).setInterpolator(new android.view.animation.DecelerateInterpolator(1.6f)).setDuration(250L).start();
            view2.setTag(java.lang.Boolean.FALSE);
        } else {
            view2.animate().cancel();
            android.view.View view6 = this.f337521d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.animate().alpha(1.0f).setDuration(360L).start();
            view3.animate().cancel();
            view3.animate().alpha(0.0f).setDuration(360L).start();
            view4.animate().cancel();
            view4.animate().translationX(0.0f).setListener(new ni3.y(view4, finderStreamMonitorView)).setInterpolator(new android.view.animation.DecelerateInterpolator(1.6f)).setDuration(250L).start();
            finderStreamMonitorView.f149471w.postDelayed(new ni3.z(finderStreamMonitorView), 20L);
            view2.setTag(bool);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
