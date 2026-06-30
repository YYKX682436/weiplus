package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class q7 implements sy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201299a;

    public q7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201299a = imageGalleryUI;
    }

    @Override // sy3.e
    public void a(android.content.DialogInterface dialogInterface) {
    }

    @Override // sy3.e
    public void b(android.content.DialogInterface dialogInterface) {
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        this.f201299a.D8();
    }

    @Override // sy3.e
    public void c(long j17) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201299a;
        imageGalleryUI.f200671x = false;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = imageGalleryUI.f200637n;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(false);
            imageGalleryUI.f200637n.setSingleMode(true);
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var != null) {
            int I7 = imageGalleryUI.I7();
            vh5.s sVar = k1Var.f201106x;
            vh5.q a17 = sVar.a(I7);
            if (a17 != null) {
                a17.c(I7, new wh5.j0(true));
            }
            vh5.k kVar = sVar.f437241c;
            if (kVar != null) {
                kVar.c(true);
            }
        }
    }

    @Override // sy3.e
    public void d(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "dealWithImageOcr onDialogShow");
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201299a;
        imageGalleryUI.u9(true);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var != null) {
            int I7 = imageGalleryUI.I7();
            wh5.j0 j0Var = new wh5.j0(true);
            vh5.s sVar = k1Var.f201106x;
            sVar.getClass();
            vh5.q a17 = sVar.a(I7);
            if (a17 != null) {
                a17.c(I7, j0Var);
            }
        }
    }

    @Override // sy3.e
    public void onError(int i17, int i18) {
        int i19 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201299a;
        imageGalleryUI.D8();
        imageGalleryUI.u9(false);
    }
}
