package sf4;

/* loaded from: classes4.dex */
public final class b1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407418d;

    public b1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        this.f407418d = storyGalleryView;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete click and click cancel it ");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407418d;
        sb6.append(storyGalleryView.f172102u);
        sb6.append(' ');
        sb6.append(storyGalleryView.f172103v);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryView", sb6.toString());
        lf4.l lVar = storyGalleryView.A;
        if (lVar != null) {
            lVar.a(storyGalleryView.f172102u, storyGalleryView.f172103v);
        }
    }
}
