package w23;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment f442607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment galleryPickerFragment) {
        super(2);
        this.f442607d = galleryPickerFragment;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList data = (java.util.LinkedList) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(data, "data");
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.T(km5.u.d(), new w23.g(data, longValue, this.f442607d));
        return jz5.f0.f302826a;
    }
}
