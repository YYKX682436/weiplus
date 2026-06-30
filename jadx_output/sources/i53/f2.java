package i53;

/* loaded from: classes8.dex */
public final class f2 implements k53.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameRecommendVideoFragment f288575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoView f288576b;

    public f2(com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment, com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView) {
        this.f288575a = gameRecommendVideoFragment;
        this.f288576b = gameVideoView;
    }

    public final void a(boolean z17) {
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = this.f288576b;
        com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment = this.f288575a;
        if (z17) {
            if (gameRecommendVideoFragment.f140063e == 0) {
                gameVideoView.setMute(true);
            }
            gameRecommendVideoFragment.f140067i = true;
            o43.b bVar = gameRecommendVideoFragment.f140066h;
            kotlin.jvm.internal.o.d(bVar);
            bVar.f342843c.setVisibility(8);
        } else {
            o43.b bVar2 = gameRecommendVideoFragment.f140066h;
            kotlin.jvm.internal.o.d(bVar2);
            bVar2.f342843c.setVisibility(0);
        }
        gameVideoView.setIsShowBasicControls(false);
    }
}
