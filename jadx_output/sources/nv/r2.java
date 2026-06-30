package nv;

/* loaded from: classes12.dex */
public class r2 extends com.tencent.mm.sdk.event.n {
    public r2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BackupStartMergeEvent backupStartMergeEvent = (com.tencent.mm.autogen.events.BackupStartMergeEvent) iEvent;
        if (backupStartMergeEvent == null) {
            return false;
        }
        am.k0 k0Var = backupStartMergeEvent.f53994g;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent, op:%d.", java.lang.Integer.valueOf(k0Var.f7108a));
        int i17 = k0Var.f7108a;
        if (i17 == 1) {
            if (!z65.c.a()) {
                return false;
            }
            kn1.k.f309630a = true;
            com.tencent.mm.sdk.platformtools.u3.h(new nv.n2(this));
            return false;
        }
        if (i17 == 2) {
            if (mn1.d.i().j().i()) {
                gm0.j1.e().j(new nv.p2(this));
                return false;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new nv.o2(this));
            return false;
        }
        if (i17 != 3) {
            return false;
        }
        kn1.k.h();
        kn1.k.k(kn1.k.o());
        kn1.k.k(kn1.k.p());
        com.tencent.mm.sdk.platformtools.u3.h(new nv.q2(this));
        return false;
    }
}
