package ni3;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337626d;

    public l0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337626d = finderStreamMonitorView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337626d;
        if (action == 0) {
            finderStreamMonitorView.f149471w.removeCallbacksAndMessages(null);
        } else if (motionEvent.getAction() == 1) {
            finderStreamMonitorView.f149471w.removeCallbacksAndMessages(null);
            finderStreamMonitorView.f149471w.postDelayed(new ni3.k0(finderStreamMonitorView), 3000L);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
