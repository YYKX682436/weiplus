package sf4;

/* loaded from: classes4.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407606e;

    public w0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, int i17) {
        this.f407605d = storyGalleryView;
        this.f407606e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f407605d.f172105x.notifyItemChanged(this.f407606e);
    }
}
