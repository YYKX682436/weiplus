package e33;

/* loaded from: classes10.dex */
public class s5 implements e33.z5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SmartGalleryUI f247464a;

    public s5(com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI) {
        this.f247464a = smartGalleryUI;
    }

    public void a(t23.f2 f2Var) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "onAlbumClick, albumId: %s, albumName: %s.", f2Var.f415148c, f2Var.f415149d);
        com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI = this.f247464a;
        android.content.Intent intent = new android.content.Intent(smartGalleryUI, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.class);
        intent.putExtras(smartGalleryUI.getIntent());
        intent.putExtra("send_raw_img", smartGalleryUI.f138637v);
        if (smartGalleryUI.f138632q) {
            t23.g2 g2Var = f2Var.f415153h;
            if (g2Var == null || !g2Var.f415154a) {
                intent.putExtra("select_type_tag", 0);
            } else {
                intent.putExtra("select_type_tag", 1);
            }
        } else {
            intent.putExtra("select_type_tag", 2);
        }
        try {
            t23.i2 i2Var = f2Var.f415147b;
            if (i2Var == null || (str = i2Var.f415185c) == null) {
                str = "";
            }
            java.lang.String str2 = f2Var.f415149d;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18269, java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), java.net.URLEncoder.encode(str2 != null ? str2 : "", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        } catch (java.lang.Exception unused) {
        }
        intent.putExtra("is_from_smart_gallery", true);
        java.lang.String str3 = f2Var.f415149d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = f2Var.f415147b.f415185c;
        }
        intent.putExtra("title_from_smart_gallery", str3);
        intent.putExtra("album_id_from_smart_gallery", f2Var.f415148c);
        smartGalleryUI.startActivityForResult(intent, 1);
    }
}
