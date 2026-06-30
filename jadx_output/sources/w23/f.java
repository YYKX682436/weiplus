package w23;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment f442603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment galleryPickerFragment) {
        super(3);
        this.f442603d = galleryPickerFragment;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.LinkedList data = (java.util.LinkedList) obj2;
        long longValue = ((java.lang.Number) obj3).longValue();
        kotlin.jvm.internal.o.g(data, "data");
        if (booleanValue) {
            java.util.List V0 = kz5.n0.V0(data);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            pm0.v.T(km5.u.d(), new w23.e(longValue, V0, this.f442603d));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GalleryPickerFragment", "[onActivityCreated] onLoad failure!");
        }
        return jz5.f0.f302826a;
    }
}
