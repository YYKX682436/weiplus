package sf4;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(1);
        this.f407472d = storyGalleryView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = intValue == 3;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407472d;
        storyGalleryView.B = z17;
        storyGalleryView.f172107y.setScrollEnable(!z17);
        storyGalleryView.H = intValue == 1;
        oj5.a0 a0Var = storyGalleryView.f172086J;
        com.tencent.mm.sdk.platformtools.u3.l(a0Var.f345833j);
        a0Var.f345832i = !storyGalleryView.B;
        return jz5.f0.f302826a;
    }
}
