package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e60.a1 f186598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs f186600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186601g;

    public w3(e60.a1 a1Var, nw4.k kVar, com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs bizPhotoAccountGalleryArgs, nw4.y2 y2Var) {
        this.f186598d = a1Var;
        this.f186599e = kVar;
        this.f186600f = bizPhotoAccountGalleryArgs;
        this.f186601g = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.k kVar = this.f186599e;
        android.content.Context context = kVar.f340860a;
        ((th5.g) this.f186598d).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs args = this.f186600f;
        kotlin.jvm.internal.o.g(args, "args");
        if (!args.f67089d.isEmpty()) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
            intent.putExtra("biz_photo_account_gallery_args", args);
            com.tencent.mm.feature.gallery.api.BizPhotoTargetRect bizPhotoTargetRect = args.f67091f;
            if (bizPhotoTargetRect != null) {
                int i17 = bizPhotoTargetRect.f67103f;
                int i18 = bizPhotoTargetRect.f67101d;
                int i19 = i17 - i18;
                if (i19 < 0) {
                    i19 = 0;
                }
                int i27 = bizPhotoTargetRect.f67104g;
                int i28 = bizPhotoTargetRect.f67102e;
                int i29 = i27 - i28;
                if (i29 < 0) {
                    i29 = 0;
                }
                if (i19 > 0 && i29 > 0) {
                    intent.putExtra("img_gallery_left", i18);
                    intent.putExtra("img_gallery_top", i28);
                    intent.putExtra("img_gallery_width", i19);
                    intent.putExtra("img_gallery_height", i29);
                }
            }
            pf5.j0.a(intent, th5.i.class);
            android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/media/bizphoto/BizPhotoAccountGalleryOpener", "open", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/BizPhotoAccountGalleryArgs;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/media/bizphoto/BizPhotoAccountGalleryOpener", "open", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/BizPhotoAccountGalleryArgs;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        nw4.g gVar = kVar.f340863d;
        nw4.y2 y2Var = this.f186601g;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
    }
}
