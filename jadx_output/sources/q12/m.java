package q12;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.EmojiFileCheckerEvent emojiFileCheckerEvent = (com.tencent.mm.autogen.events.EmojiFileCheckerEvent) iEvent;
        if (y12.c.f458852b == null) {
            synchronized (y12.c.class) {
                y12.c.f458852b = new y12.c();
            }
        }
        y12.c cVar = y12.c.f458852b;
        cVar.getClass();
        if (emojiFileCheckerEvent == null) {
            return false;
        }
        am.n4 n4Var = emojiFileCheckerEvent.f54101g;
        n4Var.getClass();
        gm0.j1.e().j(new y12.b(cVar, n4Var.f7400a));
        return false;
    }
}
