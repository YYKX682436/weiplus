package sf4;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(0);
        this.f407492d = storyGalleryView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407492d;
        if (storyGalleryView.I != null) {
            mf4.d.f326160a.a(12);
            sf4.r0 r0Var = storyGalleryView.I;
            if (r0Var != null) {
                ((of4.c) r0Var).a();
            }
        } else {
            ze4.h hVar = storyGalleryView.C;
            if (hVar != null) {
                hVar.Y0();
            }
        }
        return jz5.f0.f302826a;
    }
}
