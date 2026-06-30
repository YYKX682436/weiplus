package sf4;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView f407495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView galleryRecyclerView) {
        super(2);
        this.f407495d = galleryRecyclerView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        float floatValue = ((java.lang.Number) obj2).floatValue();
        yz5.p onScrollCallback = this.f407495d.getOnScrollCallback();
        if (onScrollCallback != null) {
            onScrollCallback.invoke(java.lang.Integer.valueOf(intValue), java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f302826a;
    }
}
