package qs;

/* loaded from: classes8.dex */
public class p extends com.tencent.mm.sdk.event.n {
    public p() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.f20 f20Var;
        com.tencent.mm.autogen.events.WeChatFrontBackEvent weChatFrontBackEvent = (com.tencent.mm.autogen.events.WeChatFrontBackEvent) iEvent;
        z71.i iVar = (z71.i) i95.n0.c(z71.i.class);
        iVar.getClass();
        if (weChatFrontBackEvent == null || (f20Var = weChatFrontBackEvent.f54978g) == null || f20Var.f6630a != 8) {
            return false;
        }
        iVar.wi("4", f20Var.f6631b);
        return false;
    }
}
