package sf4;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(0);
        this.f407417d = storyGalleryView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if4.h videoItem;
        boolean f17 = bf4.f.f19715b.f();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407417d;
        if (f17) {
            java.lang.String e17 = ef4.w.f252468t.e();
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView storyGalleryItemView = storyGalleryView.f172094n;
            if (com.tencent.mm.sdk.platformtools.t8.D0(e17, (storyGalleryItemView == null || (videoItem = storyGalleryItemView.getVideoItem()) == null) ? null : videoItem.f291256d)) {
                int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryView", "toggleActiveState  skip");
                return java.lang.Boolean.TRUE;
            }
        }
        boolean z17 = !storyGalleryView.R;
        storyGalleryView.R = z17;
        storyGalleryView.z(z17);
        return java.lang.Boolean.TRUE;
    }
}
