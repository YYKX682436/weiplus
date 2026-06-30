package nv;

/* loaded from: classes9.dex */
public class b2 extends com.tencent.mm.sdk.event.n {
    public b2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BackupGetA8keyRedirectEvent backupGetA8keyRedirectEvent = (com.tencent.mm.autogen.events.BackupGetA8keyRedirectEvent) iEvent;
        if (backupGetA8keyRedirectEvent == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore", "receive BackupGetA8keyRedirectEvent.");
        java.lang.String url = backupGetA8keyRedirectEvent.f53992g.f6888a;
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        nv.b2$$a b2__a = new nv.b2$$a();
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, null, null, new sn1.v(url, b2__a, null), 3, null);
            return false;
        }
        b2__a.accept(new sn1.j(null, 3, -1, "No account scope"));
        return false;
    }
}
