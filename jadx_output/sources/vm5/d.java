package vm5;

/* loaded from: classes10.dex */
public final class d implements com.tencent.tav.player.IPlayer.PlayerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm5.g f438147a;

    public d(vm5.g gVar) {
        this.f438147a = gVar;
    }

    @Override // com.tencent.tav.player.IPlayer.PlayerListener
    public void onPositionChanged(com.tencent.tav.coremedia.CMTime cMTime) {
        vm5.a aVar;
        vm5.g gVar = this.f438147a;
        vm5.a aVar2 = gVar.f438161e;
        if (aVar2 != null) {
            aVar2.a((cMTime != null ? cMTime.getTimeUs() : 0L) / 1000);
        }
        boolean z17 = false;
        if (cMTime != null && cMTime.getTimeUs() == gVar.f438157a.h().getStartUs()) {
            z17 = true;
        }
        if (!z17 || (aVar = gVar.f438161e) == null) {
            return;
        }
        aVar.s();
    }

    @Override // com.tencent.tav.player.IPlayer.PlayerListener
    public void onStatusChanged(com.tencent.tav.player.IPlayer.PlayerStatus playerStatus) {
        vm5.a aVar;
        xm5.b.c("VideoCompositionPlayer", "onStatusChanged:" + playerStatus, new java.lang.Object[0]);
        com.tencent.tav.player.IPlayer.PlayerStatus playerStatus2 = com.tencent.tav.player.IPlayer.PlayerStatus.PLAYING;
        vm5.g gVar = this.f438147a;
        if (playerStatus == playerStatus2) {
            vm5.a aVar2 = gVar.f438161e;
            if (aVar2 != null) {
                aVar2.s();
                return;
            }
            return;
        }
        if (playerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.STOPPED) {
            vm5.a aVar3 = gVar.f438161e;
            if (aVar3 != null) {
                aVar3.i();
                return;
            }
            return;
        }
        if (playerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.FINISHED) {
            vm5.a aVar4 = gVar.f438161e;
            if (aVar4 != null) {
                aVar4.g();
                return;
            }
            return;
        }
        if (playerStatus != com.tencent.tav.player.IPlayer.PlayerStatus.ERROR || (aVar = gVar.f438161e) == null) {
            return;
        }
        aVar.e();
    }
}
