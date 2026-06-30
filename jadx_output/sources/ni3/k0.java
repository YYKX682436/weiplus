package ni3;

/* loaded from: classes3.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337620d;

    public k0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337620d = finderStreamMonitorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337620d;
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
        androidx.recyclerview.widget.RecyclerView recyclerView = finderStreamMonitorView.getRecyclerView();
        if (i17 <= 0) {
            i17 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
