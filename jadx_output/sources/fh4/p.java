package fh4;

/* loaded from: classes15.dex */
public class p implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262703d;

    public p(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262703d = talkRoomUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "seizeMicTimer reach");
        com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI = this.f262703d;
        if (talkRoomUI.f172471v != 5) {
            return false;
        }
        talkRoomUI.f172471v = 3;
        dh4.l.Di().s();
        talkRoomUI.A.c(100L, 100L);
        return false;
    }
}
