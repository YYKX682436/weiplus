package sf4;

/* loaded from: classes4.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(3);
        this.f407447d = storyGalleryView;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        boolean z17 = intValue == 3;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407447d;
        storyGalleryView.B = z17;
        storyGalleryView.f172107y.setScrollEnable(!z17);
        storyGalleryView.H = intValue == 1;
        oj5.a0 a0Var = storyGalleryView.f172086J;
        com.tencent.mm.sdk.platformtools.u3.l(a0Var.f345833j);
        a0Var.f345832i = true ^ storyGalleryView.B;
        lf4.l lVar = storyGalleryView.A;
        if (lVar != null) {
            lVar.h(intValue, intValue2, booleanValue);
        }
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView galleryVerticalControlView = storyGalleryView.L;
        if (intValue == 3) {
            galleryVerticalControlView.setVisibility(4);
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView galleryHorizontalControlView = storyGalleryView.f172098q;
            if (galleryHorizontalControlView != null) {
                galleryHorizontalControlView.setVisibility(4);
            }
        } else {
            galleryVerticalControlView.setVisibility(0);
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView galleryHorizontalControlView2 = storyGalleryView.f172098q;
            if (galleryHorizontalControlView2 != null) {
                galleryHorizontalControlView2.setVisibility(0);
            }
        }
        return jz5.f0.f302826a;
    }
}
