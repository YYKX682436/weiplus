package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class b5 implements kd0.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200813d;

    public b5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200813d = imageGalleryUI;
    }

    @Override // kd0.o2
    public void K0(java.lang.String str, r45.aq3 aq3Var) {
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200813d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = imageGalleryUI.f200651q2;
        if (k0Var != null && k0Var.i() && (imageQBarDataBean = imageGalleryUI.f200663u2.f344453c) != null && com.tencent.mm.sdk.platformtools.t8.D0(str, imageQBarDataBean.f158619d)) {
            imageGalleryUI.n9(false);
        }
        imageGalleryUI.f200663u2.f344453c = null;
    }
}
