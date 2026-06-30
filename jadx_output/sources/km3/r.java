package km3;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.t f309258d;

    public r(km3.t tVar) {
        this.f309258d = tVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485389hj2);
        kotlin.jvm.internal.o.f(tag, "getTag(...)");
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Number) tag).intValue();
            km3.t tVar = this.f309258d;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x17 = tVar.x(intValue);
            if (x17 != null) {
                com.tencent.mm.sdk.platformtools.b0.d(tVar.f309260d, "media info", x17.toString(), null);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
