package e33;

/* loaded from: classes10.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247210d;

    public e1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247210d = albumPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean F7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247210d;
        albumPreviewUI.f138520h = true;
        F7 = albumPreviewUI.F7();
        if (F7) {
            albumPreviewUI.L7(-1, false);
        } else {
            android.content.Intent intent = new android.content.Intent(albumPreviewUI, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
            t23.p0.p(albumPreviewUI.f138528m.f247131g);
            intent.putExtra("key_send_as_media_group", albumPreviewUI.V1);
            intent.putExtra("query_source_type", albumPreviewUI.E1);
            intent.putStringArrayListExtra("preview_image_list", albumPreviewUI.f138528m.K());
            intent.putParcelableArrayListExtra("preview_media_item_list", albumPreviewUI.f138528m.f247131g);
            intent.putExtra("key_edit_video_max_time_length", albumPreviewUI.getIntent().getIntExtra("key_edit_video_max_time_length", 10));
            intent.putExtra("max_select_count", albumPreviewUI.Q);
            intent.putExtra("send_raw_img", albumPreviewUI.D);
            intent.putExtra("isSelectAlbum", albumPreviewUI.H1);
            intent.putExtra("key_force_hide_edit_image_button", albumPreviewUI.E);
            intent.putExtra("key_force_show_raw_image_button", albumPreviewUI.G);
            intent.putExtra("key_is_raw_image_button_disable", albumPreviewUI.I);
            intent.putExtra("GalleryUI_FromUser", albumPreviewUI.U);
            intent.putExtra("GalleryUI_ToUser", albumPreviewUI.V);
            intent.putExtra("key_filter_hdr_video", albumPreviewUI.getIntent().getBooleanExtra("key_filter_hdr_video", false));
            intent.putExtra("select_type_tag", albumPreviewUI.J1);
            intent.putExtra("album_business_tag", albumPreviewUI.f138548x0);
            intent.putExtra("album_video_max_duration", albumPreviewUI.f138551y0);
            intent.putExtra("album_video_min_duration", albumPreviewUI.f138526l1);
            albumPreviewUI.getClass();
            intent.putExtra("key_from_sns_post_album_multi_tab", albumPreviewUI instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI);
            r15.b bVar = albumPreviewUI.M;
            if (bVar != null) {
                ok5.d.b(intent, "key_quote_extcommon", bVar, new ok5.h());
            }
            albumPreviewUI.startActivityForResult(intent, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
