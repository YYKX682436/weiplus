package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201193d;

    public m5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201193d = imageGalleryUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.CheckBox checkBox;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201193d;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var == null) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        if (r4Var.f201334b && (checkBox = imageGalleryUI.f200667v3) != null) {
            checkBox.setChecked(r4Var.d(k1Var.w()));
            imageGalleryUI.f200670w3.setOnClickListener(imageGalleryUI);
        }
        int i17 = com.tencent.mm.ui.chatting.gallery.d2.f200849o;
        if (imageGalleryUI.f200637n.getCurrentItem() != i17) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.f2 B = com.tencent.mm.ui.chatting.gallery.k1.B(imageGalleryUI.f200611g.y(i17));
        if (!imageGalleryUI.C2 && B == com.tencent.mm.ui.chatting.gallery.f2.video) {
            com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = imageGalleryUI.f200611g;
            k1Var2.f201098p.A(k1Var2.y(i17), i17);
        }
        if (B == com.tencent.mm.ui.chatting.gallery.f2.sight) {
            imageGalleryUI.f200611g.P(i17);
        }
    }
}
