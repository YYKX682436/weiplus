package sf4;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407548a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView f407549b;

    /* renamed from: c, reason: collision with root package name */
    public final sf4.w f407550c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f407551d;

    /* renamed from: e, reason: collision with root package name */
    public final sf4.o f407552e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f407553f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f407554g;

    public p(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView gallery, com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView recyclerView, sf4.w pageScrollHelper) {
        kotlin.jvm.internal.o.g(gallery, "gallery");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(pageScrollHelper, "pageScrollHelper");
        this.f407548a = gallery;
        this.f407549b = recyclerView;
        this.f407550c = pageScrollHelper;
        sf4.o oVar = new sf4.o(this);
        this.f407552e = oVar;
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_STORY_GALLERY_FIRST_BOOLEAN_SYNC, false)) {
            this.f407553f = sf4.l.f407524d;
            pageScrollHelper.b(recyclerView);
        } else {
            sf4.m mVar = new sf4.m(this);
            this.f407553f = mVar;
            com.tencent.mm.sdk.platformtools.u3.i(mVar, 5000L);
            recyclerView.i(oVar);
        }
    }
}
