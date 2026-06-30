package sf4;

/* loaded from: classes4.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407498e;

    public j1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, int i17) {
        this.f407497d = storyGalleryView;
        this.f407498e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407497d;
        int i17 = storyGalleryView.f172102u;
        if (i17 == -1 || i17 >= storyGalleryView.f172109z.size()) {
            return;
        }
        int size = ((java.util.ArrayList) storyGalleryView.f172109z.get(storyGalleryView.f172102u)).size();
        int i18 = this.f407498e;
        if (i18 < size) {
            int i19 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
            int i27 = storyGalleryView.f172102u;
            storyGalleryView.f172109z.size();
            ((java.util.ArrayList) storyGalleryView.f172109z.get(storyGalleryView.f172102u)).size();
            java.util.Objects.toString(storyGalleryView.f172096p);
            androidx.recyclerview.widget.RecyclerView recyclerView = storyGalleryView.f172096p;
            if (recyclerView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentHItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentHItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }
}
