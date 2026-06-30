package ni3;

/* loaded from: classes10.dex */
public final class j0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337616g;

    public j0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337616g = finderStreamMonitorView;
    }

    @Override // fc2.d
    public boolean E0() {
        return true;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        if (event instanceof fc2.t) {
            int i17 = ((fc2.t) event).f260985d;
            return i17 == 0 || i17 == 7 || i17 == 6;
        }
        if (!(event instanceof ec2.f)) {
            return false;
        }
        int i18 = ((ec2.f) event).f250959d;
        return i18 == 1 || i18 == 19 || i18 == 3 || i18 == 4 || i18 == 6 || i18 == 11 || i18 == 22 || i18 == 23;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.t;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337616g;
        if (z17) {
            pm0.v.X(new ni3.h0(finderStreamMonitorView, ev6));
        } else if (ev6 instanceof ec2.f) {
            pm0.v.X(new ni3.i0(ev6, finderStreamMonitorView));
        }
    }
}
