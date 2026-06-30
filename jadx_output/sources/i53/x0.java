package i53;

/* loaded from: classes8.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameLocalGalleryView f288780d;

    public x0(com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView) {
        this.f288780d = gameLocalGalleryView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView = this.f288780d;
        java.util.ArrayList arrayList2 = gameLocalGalleryView.f140046e.f288595e;
        if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(gameLocalGalleryView.getContext(), "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
            intent.putStringArrayListExtra("preview_image_list", gameLocalGalleryView.f140046e.x());
            intent.putParcelableArrayListExtra("preview_media_item_list", gameLocalGalleryView.f140046e.f288595e);
            intent.putExtra("max_select_count", gameLocalGalleryView.f140049h);
            intent.putExtra("send_raw_img", false);
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8767, 3, 1, 87, nj0.a.c(new java.util.HashMap()));
            android.content.Context context = gameLocalGalleryView.getContext();
            int i17 = com.tencent.mm.plugin.game.media.GameLocalGalleryView.f140044q;
            j45.l.n(context, "gallery", ".ui.ImagePreviewUI", intent, 63802);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_game_haowan_text", true);
            ((android.app.Activity) gameLocalGalleryView.getContext()).setResult(-1, intent2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("content", "3");
            hashMap.put("way", "2");
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8767, 4, 7, 87, nj0.a.c(hashMap));
            ((android.app.Activity) gameLocalGalleryView.getContext()).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
