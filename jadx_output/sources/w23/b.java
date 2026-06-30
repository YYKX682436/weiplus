package w23;

/* loaded from: classes8.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment f442598d;

    public b(com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment galleryPickerFragment) {
        this.f442598d = galleryPickerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/picker/GalleryPickerFragment$initGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f442598d.f138456g = !r7.f138456g;
        throw null;
    }
}
