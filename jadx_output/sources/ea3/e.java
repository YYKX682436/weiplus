package ea3;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.n f250609d;

    public e(ea3.n nVar) {
        this.f250609d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485388hj1);
        if (!(tag instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) tag).intValue();
        ea3.n nVar = this.f250609d;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z17 = nVar.z(intValue);
        if (z17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z17.f138430e)) {
            nVar.J(intValue, z17, view);
            yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mars.xlog.Log.e("LiteAppAlbumAdapter", "[onClick] null == item!");
            nVar.notifyItemChanged(intValue);
            yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
