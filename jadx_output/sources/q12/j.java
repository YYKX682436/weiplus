package q12;

/* loaded from: classes12.dex */
public class j extends com.tencent.mm.sdk.event.n {
    public j() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17 = ((com.tencent.mm.autogen.events.EmojiConfigEvent) iEvent).f54100g.f7319a;
        if (i17 == 1) {
            com.tencent.mm.smiley.t1.a().g(false);
            com.tencent.mm.smiley.e1.b().e();
            new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiEvent", "unknown event.");
        } else {
            com.tencent.mm.smiley.e1.b().e();
            new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
        }
        return false;
    }
}
