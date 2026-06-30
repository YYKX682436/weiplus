package fh4;

/* loaded from: classes15.dex */
public class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262702d;

    public o(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262702d = talkRoomUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.P;
        this.f262702d.R6();
        return false;
    }
}
