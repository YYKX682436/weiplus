package sf4;

/* loaded from: classes4.dex */
public final class w1 implements com.tencent.mm.pluginsdk.ui.tools.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView f407607d;

    public w1(com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView) {
        this.f407607d = storyVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.e4
    public final void v() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407607d;
        long j17 = storyVideoView.X1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        storyVideoView.setFirstPlayWaitTime(android.os.SystemClock.elapsedRealtime() - j17);
        com.tencent.mm.sdk.platformtools.u3.i(new sf4.v1(storyVideoView), 50L);
    }
}
