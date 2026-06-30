package yo4;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f464304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        super(0);
        this.f464303d = multiVideoFullScreenPluginLayout;
        this.f464304e = galleryItem$MediaItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        com.tencent.mm.plugin.vlog.model.y yVar;
        android.graphics.Rect rect;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f464304e;
        java.lang.String str = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464303d;
        multiVideoFullScreenPluginLayout.D = str;
        if (multiVideoFullScreenPluginLayout.R1) {
            java.util.HashMap hashMap = so4.g.f410782g;
            if (hashMap.containsKey(galleryItem$MediaItem.f138430e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "update select image path to image enhancement result path: " + ((java.lang.String) hashMap.get(galleryItem$MediaItem.f138430e)));
                str = (java.lang.String) hashMap.get(galleryItem$MediaItem.f138430e);
                if (str == null) {
                    str = galleryItem$MediaItem.f138430e;
                    kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
                }
            }
        }
        ym5.x2 F = multiVideoFullScreenPluginLayout.f175851s.F(str);
        dw3.g0 g0Var = multiVideoFullScreenPluginLayout.S;
        g0Var.a("start", "get photo view");
        java.lang.String str2 = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str2, "getOriginalPath(...)");
        gp4.j jVar = multiVideoFullScreenPluginLayout.f175850r;
        jVar.getClass();
        jVar.f274412f.t(str2);
        bp4.k0 multiPreviewPlugin = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin();
        java.lang.String str3 = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str3, "getOriginalPath(...)");
        multiPreviewPlugin.H(F, str3, true);
        java.lang.String str4 = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str4, "getOriginalPath(...)");
        bp4.c2 c2Var = multiVideoFullScreenPluginLayout.f175863z1;
        c2Var.getClass();
        c2Var.f23132x = str4;
        java.util.Iterator it = multiVideoFullScreenPluginLayout.H.f175733g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.vlog.model.i1) obj).f175616a, galleryItem$MediaItem.f138430e)) {
                break;
            }
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
        if (i1Var != null && (yVar = i1Var.f175624i) != null && (rect = yVar.f175787d) != null) {
            jVar.f274412f.w(rect);
            multiVideoFullScreenPluginLayout.D1.setVisibleRect(rect);
            lt3.n.f321263d.set(rect);
        }
        android.content.Context context = multiVideoFullScreenPluginLayout.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(1.0f);
        multiVideoFullScreenPluginLayout.B.z();
        multiVideoFullScreenPluginLayout.M();
        multiVideoFullScreenPluginLayout.setBackgroundColor(multiVideoFullScreenPluginLayout.Q1);
        multiVideoFullScreenPluginLayout.setCurrentStyle(multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().f23211g.getStyle());
        g0Var.a("start", "load first image");
        multiVideoFullScreenPluginLayout.f175860y0.z(true);
        c2Var.D();
        return jz5.f0.f302826a;
    }
}
