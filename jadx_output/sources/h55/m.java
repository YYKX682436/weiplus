package h55;

/* loaded from: classes8.dex */
public final class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WeChatTabRedDotEvent event = (com.tencent.mm.autogen.events.WeChatTabRedDotEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.g20 g20Var = event.f54979g;
        if (g20Var != null) {
            int i17 = g20Var.f6732b ? 3 : !kotlin.jvm.internal.o.b(g20Var.f6734d, "") ? 2 : g20Var.f6733c > 0 ? 1 : 0;
            f55.g gVar = (f55.g) i95.n0.c(f55.g.class);
            boolean z17 = i17 > 0;
            int i18 = g20Var.f6731a;
            java.lang.String str = g20Var.f6734d;
            int i19 = g20Var.f6733c;
            ((e55.f) gVar).getClass();
            if (e55.e.f249667a.n()) {
                e55.m mVar = e55.m.f249681a;
                int i27 = i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? -1 : 1012 : 1011 : 1010 : 1009;
                mVar.g().removeMessages(i27);
                com.tencent.mm.sdk.platformtools.n3 g17 = mVar.g();
                android.os.Message obtainMessage = mVar.g().obtainMessage();
                obtainMessage.what = i27;
                obtainMessage.obj = nm5.j.f(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str != null ? str : "", java.lang.Integer.valueOf(i19));
                g17.sendMessageDelayed(obtainMessage, 500L);
            }
        }
        return false;
    }
}
