package sf4;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(2);
        this.f407480d = storyGalleryView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        float floatValue = ((java.lang.Number) obj2).floatValue();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407480d;
        storyGalleryView.f172104w = intValue + floatValue;
        int i17 = intValue + 1;
        float f17 = 1 - floatValue;
        com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView galleryVerticalControlView = storyGalleryView.L;
        int b17 = galleryVerticalControlView.f172064r == ze4.k.MultiUserGallery ? i65.a.b(galleryVerticalControlView.getContext(), 52) : i65.a.b(galleryVerticalControlView.getContext(), 32);
        com.tencent.mm.plugin.story.ui.layout.AvatarLayoutManager avatarLayoutManager = galleryVerticalControlView.f172066t;
        if (avatarLayoutManager != null) {
            int i18 = (int) (b17 * f17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(avatarLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView", "setScrollOffset", "(IF)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            avatarLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(avatarLayoutManager, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView", "setScrollOffset", "(IF)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        return jz5.f0.f302826a;
    }
}
