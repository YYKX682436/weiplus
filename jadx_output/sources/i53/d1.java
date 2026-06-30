package i53;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f288542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.i1 f288543e;

    public d1(i53.i1 i1Var, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        this.f288543e = i1Var;
        this.f288542d = galleryItem$MediaItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f288542d;
        int type = galleryItem$MediaItem.getType();
        i53.i1 i1Var = this.f288543e;
        if (type != 2) {
            int type2 = galleryItem$MediaItem.getType();
            i1Var.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = i1Var.f288594d.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (galleryItem$MediaItem2.getType() == type2) {
                    arrayList2.add(galleryItem$MediaItem2);
                }
            }
            ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
            t23.p0.p(arrayList2);
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(i1Var.f288596f, "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
            intent.putStringArrayListExtra("preview_image_list", i1Var.x());
            intent.putParcelableArrayListExtra("preview_media_item_list", i1Var.f288595e);
            intent.putExtra("preview_all", true);
            intent.putExtra("preview_position", arrayList2.indexOf(galleryItem$MediaItem));
            intent.putExtra("send_raw_img", false);
            intent.putExtra("max_select_count", i1Var.f288598h);
            android.content.Context context = i1Var.f288596f;
            int i17 = com.tencent.mm.plugin.game.media.GameLocalGalleryView.f140044q;
            j45.l.n(context, "gallery", ".ui.ImagePreviewUI", intent, 63802);
        } else {
            if (i1Var.f288595e.size() != 0) {
                db5.e1.T(i1Var.f288601n.getContext(), i65.a.r(i1Var.f288601n.getContext(), com.tencent.mm.R.string.fiq));
                yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("game_straight_to_publish", i1Var.f288601n.f140052n);
            m33.v1 v1Var = (m33.v1) i95.n0.c(m33.v1.class);
            android.content.Context context2 = i1Var.f288596f;
            java.lang.String str = galleryItem$MediaItem.f138430e;
            int i18 = com.tencent.mm.plugin.game.media.GameLocalGalleryView.f140044q;
            int i19 = i1Var.f288601n.f140053o;
            ((i53.x3) v1Var).getClass();
            i53.x3.wi(context2, 4, null, null, str, null, null, true, null, 25690, bundle, i19);
            i1Var.f288601n.c(2, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
