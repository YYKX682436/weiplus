package sf4;

/* loaded from: classes4.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407618e;

    public y0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, int i17) {
        this.f407617d = storyGalleryView;
        this.f407618e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f407617d.f172105x.notifyItemChanged(this.f407618e);
    }
}
