package of4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.StoryBrowseUI f345104d;

    public b(com.tencent.mm.plugin.story.ui.StoryBrowseUI storyBrowseUI) {
        this.f345104d = storyBrowseUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new com.tencent.mm.sdk.platformtools.n3().post(new of4.a(this.f345104d));
    }
}
