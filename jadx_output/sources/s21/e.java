package s21;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FMessageConversationStateOpEvent fMessageConversationStateOpEvent = (com.tencent.mm.autogen.events.FMessageConversationStateOpEvent) iEvent;
        fMessageConversationStateOpEvent.f54225g.getClass();
        am.h9 h9Var = fMessageConversationStateOpEvent.f54225g;
        java.lang.String str = h9Var.f6827b;
        int i17 = h9Var.f6826a;
        if (i17 == 2) {
            r21.w.wi().k1(str, 2);
        } else if (i17 == 1) {
            r21.w.wi().k1(str, 1);
        } else {
            r21.w.wi().k1(str, 0);
        }
        fMessageConversationStateOpEvent.f54226h.getClass();
        return false;
    }
}
