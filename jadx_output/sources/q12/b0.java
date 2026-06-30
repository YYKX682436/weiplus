package q12;

/* loaded from: classes5.dex */
public class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent = (com.tencent.mm.autogen.events.RevokeMsgEvent) iEvent;
        if (!(revokeMsgEvent instanceof com.tencent.mm.autogen.events.RevokeMsgEvent)) {
            return false;
        }
        if (revokeMsgEvent.f54713g.f6394a != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiRevokeMsgListener", "has handle in sys cmd msg extension.");
            return false;
        }
        com.tencent.mm.feature.emoji.b0 b0Var = (com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class);
        am.cs csVar = revokeMsgEvent.f54713g;
        long j17 = csVar.f6398e;
        b0Var.f66172g.put(java.lang.Long.valueOf(j17), csVar.f6395b);
        return false;
    }
}
