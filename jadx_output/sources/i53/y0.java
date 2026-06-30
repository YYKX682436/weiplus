package i53;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameLocalGalleryView f288787d;

    public y0(com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView) {
        this.f288787d = gameLocalGalleryView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView = this.f288787d;
        java.util.ArrayList arrayList2 = gameLocalGalleryView.f140046e.f288595e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (!galleryItem$MediaItem.f138438p.equals("edit") || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem.f138432g)) {
                arrayList3.add(galleryItem$MediaItem.f138430e);
            } else {
                arrayList3.add(galleryItem$MediaItem.f138432g);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList3)) {
            gameLocalGalleryView.getClass();
            i53.t.g(2);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_OutputPath_List", arrayList3);
        ((android.app.Activity) gameLocalGalleryView.getContext()).setResult(-1, intent);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("content", "1");
        hashMap.put("way", "2");
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8767, 4, 7, 87, nj0.a.c(hashMap));
        ((android.app.Activity) gameLocalGalleryView.getContext()).finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
