package sf4;

/* loaded from: classes4.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(2);
        this.f407481d = storyGalleryView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View child = (android.view.View) obj2;
        kotlin.jvm.internal.o.g(child, "child");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.s(this.f407481d, intValue, child);
        return jz5.f0.f302826a;
    }
}
