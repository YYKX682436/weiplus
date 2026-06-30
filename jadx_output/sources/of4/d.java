package of4;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.StoryBrowseUI f345106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345109g;

    public d(com.tencent.mm.plugin.story.ui.StoryBrowseUI storyBrowseUI, kotlin.jvm.internal.h0 h0Var, java.lang.String str, kotlin.jvm.internal.h0 h0Var2) {
        this.f345106d = storyBrowseUI;
        this.f345107e = h0Var;
        this.f345108f = str;
        this.f345109g = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.story.ui.StoryBrowseUI storyBrowseUI = this.f345106d;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = storyBrowseUI.f171865f;
        if (storyGalleryView != null) {
            storyGalleryView.o(false, true);
            storyGalleryView.setCurrentHItem(storyBrowseUI.f171864e);
        }
        kotlin.jvm.internal.h0 h0Var = this.f345107e;
        if (h0Var.f310123d == null) {
            h0Var.f310123d = new java.util.ArrayList();
        }
        mf4.d dVar = mf4.d.f326160a;
        long j17 = mf4.d.f326163d.f60919e;
        if (j17 == 4 || j17 == 6) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Di((java.util.List) h0Var.f310123d, mf4.d.f326163d.f60919e);
        } else if (j17 == 5) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Di(kz5.c0.d(this.f345108f), mf4.d.f326163d.f60919e);
        } else if (j17 == 12 || j17 == 13) {
            java.lang.Object obj = this.f345109g.f310123d;
        }
    }
}
