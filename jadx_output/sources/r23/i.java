package r23;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final r23.i f368826d = new r23.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r23.c cVar = r23.j.f368828b;
        boolean z17 = false;
        int i17 = 1;
        if (cVar != null && cVar.f368812f) {
            if (!r23.j.f368835i) {
                if (cVar != null && cVar.a()) {
                    z17 = true;
                }
                if (!z17) {
                    if (!r23.j.f368834h) {
                        i17 = 9;
                    }
                }
            }
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i17);
        } else {
            i17 = -1;
        }
        if (i17 > 0) {
            java.lang.ref.WeakReference weakReference = r23.j.f368830d;
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = weakReference != null ? (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) weakReference.get() : null;
            if (albumPreviewUI != null && i17 > 0) {
                albumPreviewUI.Q = i17;
                albumPreviewUI.a8(albumPreviewUI.f138528m.J());
            }
            java.lang.ref.WeakReference weakReference2 = r23.j.f368831e;
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = weakReference2 != null ? (com.tencent.mm.plugin.gallery.ui.ImagePreviewUI) weakReference2.get() : null;
            if (imagePreviewUI != null) {
                imagePreviewUI.H7(i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
