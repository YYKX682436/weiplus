package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class t6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201406f;

    public t6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f201406f = imageGalleryUI;
        this.f201404d = f9Var;
        this.f201405e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        com.tencent.mm.storage.f9 f9Var = this.f201404d;
        int Bi = ((g90.u) wVar).Bi(f9Var, 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "footer menuView clicked: talker:%s, msgId:%d, deviceFileStatus: %d", f9Var.Q0(), java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(Bi));
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201406f;
        if (Bi == 3) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.Y6(imageGalleryUI);
            imageGalleryUI.f200651q2.u();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(imageGalleryUI, f9Var, 1, 1);
        } else {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(imageGalleryUI);
            e4Var.f211776c = imageGalleryUI.getText(com.tencent.mm.R.string.obn);
            e4Var.c();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(imageGalleryUI, f9Var, 1, 1);
        }
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f201406f;
        ((g90.s) vVar).uj(imageGalleryUI2, this.f201404d, imageGalleryUI2.T3, this.f201405e, 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
