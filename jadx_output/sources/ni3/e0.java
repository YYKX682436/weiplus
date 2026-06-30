package ni3;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView, java.lang.String str) {
        super(0);
        this.f337566d = finderStreamMonitorView;
        this.f337567e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337566d;
        finderStreamMonitorView.getGlobalPreloadTv().setText(this.f337567e);
        androidx.recyclerview.widget.f2 adapter = finderStreamMonitorView.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        finderStreamMonitorView.getGlobalPreloadTv().setOnClickListener(new ni3.d0(finderStreamMonitorView));
        return jz5.f0.f302826a;
    }
}
