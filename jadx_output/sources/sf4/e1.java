package sf4;

/* loaded from: classes4.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(2);
        this.f407458d = storyGalleryView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        lf4.l lVar = this.f407458d.A;
        if (lVar != null) {
            lVar.h(3, intValue, booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
