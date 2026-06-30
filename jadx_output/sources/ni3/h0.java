package ni3;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f337603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView, fc2.a aVar) {
        super(0);
        this.f337602d = finderStreamMonitorView;
        this.f337603e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = ((fc2.t) this.f337603e).f260992k;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337602d;
        finderStreamMonitorView.f149461m = j17;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
        finderStreamMonitorView.getRecyclerView().post(new ni3.g0(finderStreamMonitorView));
        return jz5.f0.f302826a;
    }
}
