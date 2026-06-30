package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class p6 implements oc5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201267a;

    public p6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201267a = imageGalleryUI;
    }

    @Override // oc5.o
    public void a(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "handleCode callback notifyEvent: %d", java.lang.Integer.valueOf(notifyDealQBarStrResultEvent.f54539g.f7168c));
        am.kl klVar = notifyDealQBarStrResultEvent.f54539g;
        android.app.Activity activity = klVar.f7167b;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201267a;
        if (activity != imageGalleryUI || !klVar.f7166a.equals(imageGalleryUI.f200666v2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "handleCode callback not the same");
            return;
        }
        int i17 = klVar.f7168c;
        oc5.d dVar = imageGalleryUI.f200591a3;
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            dVar.a(2);
            if (imageGalleryUI.f200647p1 == null) {
                imageGalleryUI.f200647p1 = imageGalleryUI.findViewById(com.tencent.mm.R.id.f486733ma3);
            }
            imageGalleryUI.h9(imageGalleryUI.f200647p1, 8);
            imageGalleryUI.f200666v2 = null;
            return;
        }
        if (i17 != 3) {
            return;
        }
        android.os.Bundle bundle = klVar.f7169d;
        dVar.a(bundle != null ? bundle.getBoolean("key_scan_qr_code_result", true) : true ? 1 : 2);
        imageGalleryUI.f200666v2 = null;
        imageGalleryUI.finishAfterNewActivityStarted();
    }
}
