package sf4;

/* loaded from: classes4.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407614e;

    public x0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, int i17) {
        this.f407613d = storyGalleryView;
        this.f407614e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f407613d.f172105x.notifyItemChanged(this.f407614e);
    }
}
