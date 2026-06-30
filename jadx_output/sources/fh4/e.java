package fh4;

/* loaded from: classes15.dex */
public class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame f262691d;

    public e(com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame talkRoomAvatarsFrame) {
        this.f262691d = talkRoomAvatarsFrame;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame.f172449m;
        this.f262691d.a();
        return false;
    }
}
