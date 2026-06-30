package sf4;

/* loaded from: classes4.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407601e;

    public v0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, int i17) {
        this.f407600d = storyGalleryView;
        this.f407601e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f407600d.f172105x.notifyItemChanged(this.f407601e);
    }
}
