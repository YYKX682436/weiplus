package d45;

/* loaded from: classes10.dex */
public final class m implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d45.q f226450d;

    public m(d45.q qVar) {
        this.f226450d = qVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag(com.tencent.mm.R.id.f485388hj1);
        kotlin.jvm.internal.o.f(tag, "getTag(...)");
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Number) tag).intValue();
            d45.q qVar = this.f226450d;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z17 = qVar.z(intValue);
            if (z17 != null) {
                com.tencent.mm.sdk.platformtools.b0.d(qVar.f226454d, "media info", z17.toString(), null);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
