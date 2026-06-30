package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.f6 f201297d;

    public q5(com.tencent.mm.ui.chatting.gallery.f6 f6Var) {
        this.f201297d = f6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.f6 f6Var = this.f201297d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = f6Var.f200919a.f200651q2;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        f6Var.f200919a.n9(false);
        if (!f6Var.f200919a.u8() || f6Var.f200919a.H3 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "scanCode onSuccess, hide enhance bottomSheet");
        f6Var.f200919a.H3.o(zh1.y0.HIDE);
    }
}
