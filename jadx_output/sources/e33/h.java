package e33;

/* loaded from: classes10.dex */
public class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247242d;

    public h(e33.b0 b0Var) {
        this.f247242d = b0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485388hj1);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) tag).intValue();
            e33.b0 b0Var = this.f247242d;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = b0Var.E(intValue);
            if (E != null) {
                com.tencent.mm.sdk.platformtools.b0.d(b0Var.f247129e, "media info", E.toString(), null);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
