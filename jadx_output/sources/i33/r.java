package i33;

/* loaded from: classes.dex */
public final class r implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u f288239d;

    public r(i33.u uVar) {
        this.f288239d = uVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        h33.c data = (h33.c) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        super.g(itemView, data, i17);
        i33.u uVar = this.f288239d;
        uVar.getClass();
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = data.f278456e;
        if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
            ct.b3 b3Var = (ct.b3) i95.n0.c(ct.b3.class);
            android.app.Activity context = uVar.getContext();
            java.lang.String str = ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138430e;
            java.lang.String f17 = j33.d0.f(str);
            kotlin.jvm.internal.o.f(f17, "getFileName(...)");
            ((com.tencent.mm.pluginsdk.model.app.r3) b3Var).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            if (r26.n0.N(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaPreviewFeatureService", "startVideoMediaPreviewUI: filePath is null or blank");
                return;
            }
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
            pf5.j0.a(intent, re5.g0.class);
            intent.putExtra("KEY_PATH", str);
            intent.putExtra("KEY_VIDEO_FILE_NAME", f17);
            intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL, true);
            intent.putExtra("KEY_VIDEO_HIDE_MENU", true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startVideoMediaPreviewUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startVideoMediaPreviewUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
            ct.b3 b3Var2 = (ct.b3) i95.n0.c(ct.b3.class);
            android.app.Activity context2 = uVar.getContext();
            java.lang.String str2 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem).f138430e;
            if (str2 == null) {
                str2 = "";
            }
            ((com.tencent.mm.pluginsdk.model.app.r3) b3Var2).getClass();
            kotlin.jvm.internal.o.g(context2, "context");
            if (r26.n0.N(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaPreviewFeatureService", "startFileMediaPreviewUI: filePath is null or blank");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShowImageUI.class);
            intent2.putExtra("key_image_path", str2);
            intent2.putExtra("key_favorite", false);
            intent2.putExtra("key_scene", 3);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startImageMediaPreviewUI", "(Landroid/content/Context;Lcom/tencent/mm/media/model/ImagePreviewParams;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startImageMediaPreviewUI", "(Landroid/content/Context;Lcom/tencent/mm/media/model/ImagePreviewParams;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
