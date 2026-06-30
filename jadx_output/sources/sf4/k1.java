package sf4;

/* loaded from: classes4.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407520e;

    public k1(int i17, com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        this.f407519d = i17;
        this.f407520e = storyGalleryView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407520e;
        storyGalleryView.f172109z.size();
        int size = storyGalleryView.f172109z.size();
        int i18 = this.f407519d;
        if (i18 < size) {
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView galleryRecyclerView = storyGalleryView.f172107y;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(galleryRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentVItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            galleryRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(galleryRecyclerView, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentVItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
