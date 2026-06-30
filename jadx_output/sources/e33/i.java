package e33;

/* loaded from: classes10.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247279d;

    public i(e33.b0 b0Var) {
        this.f247279d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485388hj1);
        if (!(tag instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) tag).intValue();
        e33.b0 b0Var = this.f247279d;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = b0Var.E(intValue);
        if (E != null && !com.tencent.mm.sdk.platformtools.t8.K0(E.f138430e)) {
            b0Var.Q(intValue, E, view);
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
            b0Var.notifyItemChanged(intValue);
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
