package of4;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.StoryBrowseUI f345103d;

    public a(com.tencent.mm.plugin.story.ui.StoryBrowseUI storyBrowseUI) {
        this.f345103d = storyBrowseUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.story.ui.StoryBrowseUI.f171862h;
        com.tencent.mm.plugin.story.ui.StoryBrowseUI storyBrowseUI = this.f345103d;
        storyBrowseUI.T6(-1);
        storyBrowseUI.overridePendingTransition(0, 0);
    }
}
