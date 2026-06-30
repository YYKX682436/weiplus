package nx;

/* loaded from: classes8.dex */
public class z extends com.tencent.mm.sdk.event.n {
    public z() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.du duVar;
        am.du duVar2;
        java.util.LinkedList linkedList;
        com.tencent.mm.autogen.events.SetRecvTmpMsgOptionEvent setRecvTmpMsgOptionEvent = (com.tencent.mm.autogen.events.SetRecvTmpMsgOptionEvent) iEvent;
        if (!(setRecvTmpMsgOptionEvent instanceof com.tencent.mm.autogen.events.SetRecvTmpMsgOptionEvent) || (duVar = setRecvTmpMsgOptionEvent.f54769g) == null || com.tencent.mm.sdk.platformtools.t8.K0(duVar.f6501a) || (linkedList = (duVar2 = setRecvTmpMsgOptionEvent.f54769g).f6502b) == null) {
            return false;
        }
        lr1.i0 i0Var = new lr1.i0(duVar2.f6501a, linkedList);
        gm0.j1.i();
        gm0.j1.d().g(i0Var);
        return false;
    }
}
