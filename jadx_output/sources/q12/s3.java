package q12;

/* loaded from: classes12.dex */
public class s3 extends com.tencent.mm.sdk.event.n {
    public s3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ManualAuthEvent manualAuthEvent = (com.tencent.mm.autogen.events.ManualAuthEvent) iEvent;
        if (manualAuthEvent == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiEvent", "manualAuthEventListener callback");
        if (!manualAuthEvent.f54490g.f7428a) {
            return false;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c17.x(u3Var, bool);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, bool);
        return false;
    }
}
