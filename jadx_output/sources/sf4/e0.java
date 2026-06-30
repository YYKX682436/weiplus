package sf4;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407457d;

    public e0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        this.f407457d = storyGalleryView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ze4.h hVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407457d;
        if (storyGalleryView.f172109z.size() == 1 && ((java.util.ArrayList) storyGalleryView.f172109z.get(0)).isEmpty() && (hVar = storyGalleryView.C) != null) {
            hVar.Y0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
