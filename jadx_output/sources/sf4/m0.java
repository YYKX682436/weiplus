package sf4;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(0);
        this.f407529d = storyGalleryView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407529d;
        sf4.d dVar = storyGalleryView.M;
        if (!(dVar != null ? dVar.B : false)) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_STORY_EDITOR_SHOW_PRIVACY_TIP_BOOLEAN_SYNC;
            if (c17.o(u3Var, true)) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                db5.e1.t(storyGalleryView.getContext(), "", storyGalleryView.getContext().getString(com.tencent.mm.R.string.jml), new sf4.i1(storyGalleryView));
                return jz5.f0.f302826a;
            }
        }
        lf4.l lVar = storyGalleryView.A;
        if (lVar != null) {
            int i17 = storyGalleryView.f172102u;
            int i18 = storyGalleryView.f172103v;
            sf4.d dVar2 = storyGalleryView.M;
            lVar.m(i17, i18, dVar2 != null ? dVar2.B : false);
        }
        return jz5.f0.f302826a;
    }
}
