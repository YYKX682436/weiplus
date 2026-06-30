package yo4;

/* loaded from: classes10.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f464274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        super(0);
        this.f464273d = multiVideoPluginLayout;
        this.f464274e = galleryItem$MediaItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f464274e;
        java.lang.String str = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
        com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464273d;
        multiVideoPluginLayout.C = str;
        if (multiVideoPluginLayout.K1) {
            java.util.HashMap hashMap = so4.g.f410782g;
            if (hashMap.containsKey(galleryItem$MediaItem.f138430e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "update select image path to image enhancement result path: " + ((java.lang.String) hashMap.get(galleryItem$MediaItem.f138430e)));
                str = (java.lang.String) hashMap.get(galleryItem$MediaItem.f138430e);
                if (str == null) {
                    str = galleryItem$MediaItem.f138430e;
                    kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
                }
            }
        }
        ym5.x2 F = multiVideoPluginLayout.f175876s.F(str);
        dw3.g0 g0Var = multiVideoPluginLayout.R;
        g0Var.a("start", "get photo view");
        java.lang.String str2 = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str2, "getOriginalPath(...)");
        gp4.j jVar = multiVideoPluginLayout.f175875r;
        jVar.getClass();
        jVar.f274412f.t(str2);
        bp4.k0 multiPreviewPlugin = multiVideoPluginLayout.getMultiPreviewPlugin();
        java.lang.String str3 = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str3, "getOriginalPath(...)");
        multiPreviewPlugin.H(F, str3, true);
        android.content.Context context = multiVideoPluginLayout.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(1.0f);
        multiVideoPluginLayout.A.z();
        multiVideoPluginLayout.J();
        multiVideoPluginLayout.setBackgroundColor(multiVideoPluginLayout.J1);
        multiVideoPluginLayout.setCurrentStyle(multiVideoPluginLayout.getMultiPreviewPlugin().f23211g.getStyle());
        g0Var.a("start", "load first image");
        multiVideoPluginLayout.f175882x0.z(true);
        return jz5.f0.f302826a;
    }
}
