package fh4;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262699d;

    public k(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262699d = talkRoomUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess expired to execute");
        int i17 = com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.P;
        this.f262699d.V6();
        return false;
    }
}
