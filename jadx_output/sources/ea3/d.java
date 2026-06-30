package ea3;

/* loaded from: classes10.dex */
public class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.n f250608d;

    public d(ea3.n nVar) {
        this.f250608d = nVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485388hj1);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) tag).intValue();
            ea3.n nVar = this.f250608d;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z17 = nVar.z(intValue);
            if (z17 != null) {
                com.tencent.mm.sdk.platformtools.b0.d(nVar.f250628e, "media info", z17.toString(), null);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
