package ni3;

/* loaded from: classes10.dex */
public final class w implements ni3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337750a;

    public w(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337750a = finderStreamMonitorView;
    }

    @Override // ni3.a
    public void a(int i17, int i18) {
        int i19 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.B;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337750a;
        finderStreamMonitorView.g(i17).f337668c = c01.id.a();
        finderStreamMonitorView.g(i17).f337669d = i18;
    }

    @Override // ni3.a
    public void b(int i17) {
        int i18 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.B;
        this.f337750a.g(i17).f337667b = c01.id.a();
    }
}
