package sf4;

/* loaded from: classes4.dex */
public final class x1 implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView f407615d;

    public x1(com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView) {
        this.f407615d = storyVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView.f172110a2;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407615d;
        java.lang.String str = storyVideoView.f189739e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localVideo onCompleted, isFakeVideo:");
        if4.h hVar = storyVideoView.W1;
        sb6.append(hVar != null ? java.lang.Boolean.valueOf(hVar.a()) : null);
        sb6.append(", fakeStartTime:0");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if4.h hVar2 = storyVideoView.W1;
        if (hVar2 == null || !hVar2.a()) {
        }
        storyVideoView.f189748q.a(0.0d, true);
        com.tencent.mm.pluginsdk.ui.b1 b1Var = storyVideoView.f189751t;
        if (b1Var != null) {
            b1Var.E(storyVideoView.getSessionId(), storyVideoView.getMediaId());
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView.f172110a2;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407615d;
        java.lang.String str = storyVideoView.f189739e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localVideo onPrepared, isLocalVideoPause:");
        sb6.append(storyVideoView.T1);
        sb6.append(", isFakeVideo:");
        if4.h hVar = storyVideoView.W1;
        sb6.append(hVar != null ? java.lang.Boolean.valueOf(hVar.a()) : null);
        sb6.append(", fakeStartTime:0, fakeEndTime:0");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (storyVideoView.T1) {
            return;
        }
        if4.h hVar2 = storyVideoView.W1;
        if (hVar2 == null || !hVar2.a()) {
        }
        storyVideoView.f189748q.start();
        storyVideoView.f189748q.setOneTimeVideoTextureUpdateCallback(new sf4.w1(storyVideoView));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        if4.h hVar = this.f407615d.W1;
        if (hVar == null) {
            return 0;
        }
        hVar.a();
        return 0;
    }
}
