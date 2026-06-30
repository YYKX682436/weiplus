package com.tencent.mm.plugin.game;

/* loaded from: classes4.dex */
public class l0 implements com.tencent.mm.sdk.platformtools.a4 {
    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        d43.b bVar = d43.b.f226411d;
        b43.d dVar = d43.b.f226412e;
        synchronized (dVar) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "pauseKeepAlive");
            dVar.f17806h = true;
            dVar.f17807i = false;
            if (dVar.f17804f != null) {
                gm0.j1.d().d(dVar.f17804f);
            }
        }
        return true;
    }
}
