package fh4;

/* loaded from: classes15.dex */
public class l implements com.tencent.mm.sdk.platformtools.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262700a;

    public l(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262700a = talkRoomUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.t5
    public void onCompletion() {
        com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI = this.f262700a;
        talkRoomUI.f172473x.d();
        if (talkRoomUI.f172471v != 5) {
            return;
        }
        talkRoomUI.f172471v = 3;
        dh4.l.Di().s();
        talkRoomUI.A.c(100L, 100L);
    }
}
