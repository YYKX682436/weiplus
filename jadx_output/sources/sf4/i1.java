package sf4;

/* loaded from: classes4.dex */
public final class i1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407493d;

    public i1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        this.f407493d = storyGalleryView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407493d;
        lf4.l lVar = storyGalleryView.A;
        if (lVar != null) {
            int i18 = storyGalleryView.f172102u;
            int i19 = storyGalleryView.f172103v;
            sf4.d dVar = storyGalleryView.M;
            lVar.m(i18, i19, dVar != null ? dVar.B : false);
        }
    }
}
