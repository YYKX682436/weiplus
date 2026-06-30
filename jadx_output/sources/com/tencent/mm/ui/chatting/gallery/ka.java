package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class ka implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ma f201154e;

    public ka(com.tencent.mm.ui.chatting.gallery.ma maVar, java.lang.String str) {
        this.f201154e = maVar;
        this.f201153d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f201153d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.ui.chatting.gallery.ma maVar = this.f201154e;
        if (K0) {
            db5.e1.i(maVar.f201202d.f201424b.f201092g, com.tencent.mm.R.string.k7_, com.tencent.mm.R.string.b58);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.f(maVar.f201202d.f201424b.f201092g, intent, new com.tencent.mm.vfs.r6(str), "video/*", false);
        try {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = maVar.f201202d.f201424b.f201092g;
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, imageGalleryUI.getContext().getString(com.tencent.mm.R.string.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageGalleryUI, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            imageGalleryUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(imageGalleryUI, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryViewHolder", "startActivity fail, activity not found");
            db5.e1.i(maVar.f201202d.f201424b.f201092g, com.tencent.mm.R.string.cbm, com.tencent.mm.R.string.cbn);
        }
    }
}
