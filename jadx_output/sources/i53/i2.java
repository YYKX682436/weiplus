package i53;

/* loaded from: classes8.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameRecommendVideoFragment f288602d;

    public i2(com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment) {
        this.f288602d = gameRecommendVideoFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView;
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView2;
        int i17 = com.tencent.mm.plugin.game.media.GameRecommendVideoFragment.f140061n;
        com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment = this.f288602d;
        if (gameRecommendVideoFragment.f140067i) {
            return;
        }
        o43.b bVar = gameRecommendVideoFragment.f140066h;
        if (bVar != null && (gameVideoView2 = bVar.f342844d) != null) {
            gameVideoView2.start();
        }
        o43.b bVar2 = gameRecommendVideoFragment.f140066h;
        if (bVar2 == null || (gameVideoView = bVar2.f342844d) == null) {
            return;
        }
        gameVideoView.play();
    }
}
