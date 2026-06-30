package sf4;

/* loaded from: classes4.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407577d;

    public s0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        this.f407577d = storyGalleryView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407577d;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView storyGalleryItemView = storyGalleryView.f172094n;
        if (storyGalleryItemView == null || storyGalleryItemView.getVideoItem() == null) {
            return;
        }
        nf4.l i18 = ef4.w.f252468t.i();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView storyGalleryItemView2 = storyGalleryView.f172094n;
        kotlin.jvm.internal.o.d(storyGalleryItemView2);
        if4.h videoItem = storyGalleryItemView2.getVideoItem();
        kotlin.jvm.internal.o.d(videoItem);
        nf4.k kVar = nf4.l.f336858m;
        long j17 = videoItem.f291254b;
        nf4.j J0 = j17 >= 0 ? i18.J0((int) j17) : i18.L0(j17);
        if (J0 != null) {
            J0.field_readCount++;
            i17 = i18.f336872h.p("MMStoryInfo", J0.convertTo(), "storyID=?", new java.lang.String[]{"" + j17});
        } else {
            i17 = -1;
        }
        int i19 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("storyId :");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView storyGalleryItemView3 = storyGalleryView.f172094n;
        kotlin.jvm.internal.o.d(storyGalleryItemView3);
        if4.h videoItem2 = storyGalleryItemView3.getVideoItem();
        kotlin.jvm.internal.o.d(videoItem2);
        sb6.append(videoItem2.f291254b);
        sb6.append(" read times + 1  ,result:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryView", sb6.toString());
    }
}
