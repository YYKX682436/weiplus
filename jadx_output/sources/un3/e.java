package un3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.NotifyPushNewTipsEvent notifyPushNewTipsEvent = (com.tencent.mm.autogen.events.NotifyPushNewTipsEvent) iEvent;
        if (notifyPushNewTipsEvent == null) {
            return true;
        }
        am.xl xlVar = notifyPushNewTipsEvent.f54552g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(xlVar.f8383a)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("NotifyPushNewTipsEventIListener", "NotifyPushNewTipsEvent %s", xlVar.f8383a);
        rn3.l lVar = (rn3.l) rn3.m.f397960a.get(xlVar.f8383a);
        if (lVar == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "onCallback");
        ((com.tencent.mm.ui.chatting.component.bf) lVar).f198734a.E0();
        return true;
    }
}
