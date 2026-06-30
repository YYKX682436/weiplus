package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f201480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201481g;

    public u6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2, int i17) {
        this.f201481g = imageGalleryUI;
        this.f201478d = f9Var;
        this.f201479e = f9Var2;
        this.f201480f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$54", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        com.tencent.mm.storage.f9 f9Var = this.f201478d;
        int Bi = ((g90.u) wVar).Bi(f9Var, 1);
        com.tencent.mm.storage.f9 f9Var2 = this.f201479e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "footer menuView clicked: talker:%s, msgId:%d, deviceFileStatus: %d", f9Var2.Q0(), java.lang.Long.valueOf(f9Var2.getMsgId()), java.lang.Integer.valueOf(Bi));
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201481g;
        if (Bi == 3) {
            int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
            imageGalleryUI.F8();
            imageGalleryUI.f200651q2.u();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(imageGalleryUI, f9Var, 1, 1);
        } else {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(imageGalleryUI);
            e4Var.f211776c = imageGalleryUI.getText(com.tencent.mm.R.string.ncy);
            e4Var.c();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(imageGalleryUI, f9Var, 1, 2);
        }
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f201481g;
        ((g90.s) vVar).uj(imageGalleryUI2, this.f201478d, imageGalleryUI2.T3, this.f201480f, 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$54", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
