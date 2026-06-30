package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final /* synthetic */ class ImageGalleryUI$$y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f200740g;

    public /* synthetic */ ImageGalleryUI$$y(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.lang.Long l17) {
        this.f200737d = imageGalleryUI;
        this.f200738e = str;
        this.f200739f = f9Var;
        this.f200740g = l17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200737d;
        if (imageGalleryUI.V1 || imageGalleryUI.isFinishing() || imageGalleryUI.isDestroyed()) {
            return;
        }
        java.lang.String str = this.f200738e;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.storage.f9 f9Var = this.f200739f;
        if (K0) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f279671d;
            ((g90.u) wVar).Vi(f9Var, 2);
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(imageGalleryUI);
            e4Var.f211776c = imageGalleryUI.getText(com.tencent.mm.R.string.obn);
            e4Var.c();
            imageGalleryUI.q9();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(f9Var, false, 1);
            return;
        }
        t21.v2 h17 = t21.d3.h(f9Var.z0());
        int duration = h17 == null ? imageGalleryUI.f200611g.v().f201438p.getDuration() / 1000 : h17.f415015m;
        android.content.Intent intent = new android.content.Intent(imageGalleryUI, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShowVideoUI.class);
        intent.putExtra("KEY_PATH", str);
        intent.putExtra("KEY_URI_ID", this.f200740g);
        intent.putExtra("KEY_THUMB_PATH", ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false));
        intent.putExtra("KEY_VIDEO_DURATION", duration);
        intent.putExtra("KEY_EXTERNAL_ORIGIN_VIDEO", true);
        intent.putExtra("KEY_FAVORITE", true);
        intent.putExtra("KEY_VIDEO_FILE_NAME", f9Var.z0());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageGalleryUI, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "lambda$goToPreviewExternalVideo$21", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/Long;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        imageGalleryUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(imageGalleryUI, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "lambda$goToPreviewExternalVideo$21", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/Long;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        imageGalleryUI.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1);
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(f9Var, true, 0);
    }
}
