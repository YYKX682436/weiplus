package dt;

/* loaded from: classes15.dex */
public class y4 extends com.tencent.mm.sdk.event.n {
    public y4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.zr zrVar = ((com.tencent.mm.autogen.events.RetransmitMsgEvent) iEvent).f54710g;
        com.tencent.mm.ui.chatting.x3.d(zrVar.f8599a, zrVar.f8600b, zrVar.f8601c, zrVar.f8602d, zrVar.f8603e);
        return false;
    }
}
