package ni3;

/* loaded from: classes3.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337760d;

    public z(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337760d = finderStreamMonitorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337760d;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderStreamMonitorView.f149459h;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            throw null;
        }
        java.util.Iterator<T> it = dataBuffer.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.j5) it.next()).getItemId() == finderStreamMonitorView.f149461m) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderStreamMonitorView.getRecyclerView().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        int max = java.lang.Math.max(0, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1$3", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1$3", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
