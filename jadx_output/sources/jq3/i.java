package jq3;

/* loaded from: classes12.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnChattingUIActionEvent onChattingUIActionEvent = (com.tencent.mm.autogen.events.OnChattingUIActionEvent) iEvent;
        am.nm nmVar = onChattingUIActionEvent.f54568g;
        if (nmVar.f7437a != 1 || com.tencent.mm.sdk.platformtools.t8.K0(nmVar.f7438b)) {
            return false;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        if (nVar.f265539x == null) {
            return false;
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        mq3.b bVar = nVar2.f265539x;
        am.nm nmVar2 = onChattingUIActionEvent.f54568g;
        java.lang.String str = nmVar2.f7438b;
        long j17 = nmVar2.f7439c;
        bVar.getClass();
        fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar3.requireAccountInitialized();
        nVar3.f265536u.a(new mq3.a(bVar, str, 0, j17));
        return false;
    }
}
