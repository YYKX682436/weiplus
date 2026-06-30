package q12;

/* loaded from: classes11.dex */
public class v3 extends com.tencent.mm.sdk.event.n {
    public v3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.mp mpVar;
        com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent rePullEmojiInfoDescEvent = (com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent) iEvent;
        if (rePullEmojiInfoDescEvent == null || (mpVar = rePullEmojiInfoDescEvent.f54645g) == null) {
            return false;
        }
        java.lang.String str = mpVar.f7357a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        if (!com.tencent.mm.storage.n5.f().b().D0(str)) {
            return false;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Bi().g();
        return false;
    }
}
