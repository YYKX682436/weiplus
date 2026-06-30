package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class f6 implements oc5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200919a;

    public f6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200919a = imageGalleryUI;
    }

    @Override // oc5.n
    public void a(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        java.lang.Integer e17;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200919a;
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        java.lang.String x27 = imageGalleryUI.x2();
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(x27, false);
        if (i18 == null || !i18.equals(recogQBarOfImageFileResultEvent.f54661g.f6368a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "not same filepath");
            return;
        }
        this.f200919a.W2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f200919a.X2.longValue());
        com.tencent.mm.ui.chatting.gallery.n8 n8Var = this.f200919a.E3;
        n8Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onScanFinishPathChecked#ScanState");
        n8Var.f201220a = 2;
        com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
        java.util.ArrayList a17 = s6Var.a(recogQBarOfImageFileResultEvent);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "scanCode onSuccess data size: %d, recognizeType: %d, curPath: %s, path: %s", java.lang.Integer.valueOf(a17.size()), java.lang.Integer.valueOf(recogQBarOfImageFileResultEvent.f54661g.f6378k), i18, x27);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(a17)) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f200919a;
            oc5.g0 g0Var = imageGalleryUI2.f200669w2;
            if (g0Var != null) {
                g0Var.f344430n = recogQBarOfImageFileResultEvent.f54661g.f6381n;
            }
            com.tencent.mm.storage.f9 y17 = imageGalleryUI2.f200611g.y(imageGalleryUI2.O3);
            java.lang.String valueOf = y17 != null ? java.lang.String.valueOf(y17.I0()) : null;
            oc5.l0 l0Var = this.f200919a.f200663u2;
            l0Var.getClass();
            l0Var.f344451a.clear();
            l0Var.f344452b = null;
            l0Var.f344453c = null;
            l0Var.f344451a = s6Var.a(recogQBarOfImageFileResultEvent);
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI3 = this.f200919a;
            oc5.l0 l0Var2 = imageGalleryUI3.f200663u2;
            l0Var2.f344463m = i18;
            l0Var2.f344464n = valueOf;
            imageGalleryUI3.f200674x2.g(2, 1);
            oc5.m mVar = this.f200919a.f200674x2;
            com.tencent.mm.ui.chatting.gallery.q5 q5Var = new com.tencent.mm.ui.chatting.gallery.q5(this);
            mVar.getClass();
            oc5.e eVar = (oc5.e) mVar.f344466b.get(2);
            if (eVar != null) {
                oc5.f fVar = (oc5.f) eVar;
                if (!fVar.f344409b || ((e17 = mVar.e(2)) != null && e17.intValue() == 4)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ImageScanButtonStatusManager", "postAction action not enable or overTimeLimit: %d", 2);
                } else if (fVar.b()) {
                    mVar.c(2, new oc5.j(mVar));
                    q5Var.run();
                } else {
                    eVar.a();
                    mVar.b(2);
                    java.util.HashMap hashMap = mVar.f344468d;
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    oc5.k kVar = new oc5.k(mVar, 2, q5Var);
                    long a18 = eVar.a();
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    wu5.c z17 = t0Var.z(kVar, a18, false);
                    kotlin.jvm.internal.o.f(z17, "uiDelay(...)");
                    hashMap.put(2, z17);
                }
            }
            if (2 == recogQBarOfImageFileResultEvent.f54661g.f6378k) {
                if (this.f200919a.f200663u2.f344451a.size() == 1) {
                    com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) this.f200919a.f200663u2.f344451a.get(0);
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI4 = this.f200919a;
                    oc5.l0 l0Var3 = imageGalleryUI4.f200663u2;
                    l0Var3.f344453c = imageQBarDataBean;
                    l0Var3.f344452b = null;
                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) imageGalleryUI4.Z2).j(imageQBarDataBean.f158620e, imageGalleryUI4.N7(imageQBarDataBean.f158619d), 1000L);
                } else {
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI5 = this.f200919a;
                    java.util.ArrayList arrayList = (java.util.ArrayList) com.tencent.mm.plugin.scanner.c0.a(imageGalleryUI5, imageGalleryUI5.L7(imageGalleryUI5.f200611g, imageGalleryUI5.f200637n), this.f200919a.f200663u2.f344451a, 0).f302833d;
                    if (arrayList.size() == 1) {
                        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean2 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList.get(0);
                        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI6 = this.f200919a;
                        oc5.l0 l0Var4 = imageGalleryUI6.f200663u2;
                        l0Var4.f344452b = imageQBarDataBean2;
                        l0Var4.f344453c = imageQBarDataBean2;
                        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) imageGalleryUI6.Z2).j(imageQBarDataBean2.f158620e, imageGalleryUI6.N7(imageQBarDataBean2.f158619d), 1000L);
                    } else {
                        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI7 = this.f200919a;
                        oc5.l0 l0Var5 = imageGalleryUI7.f200663u2;
                        l0Var5.f344452b = null;
                        l0Var5.f344453c = null;
                        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = imageGalleryUI7.f200651q2;
                        if (k0Var2 != null && k0Var2.i()) {
                            this.f200919a.n9(false);
                        }
                    }
                }
            }
        }
        if (this.f200919a.u8()) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI8 = this.f200919a;
        if (c01.ia.C(imageGalleryUI8.f200611g.y(imageGalleryUI8.O3)) || (k0Var = this.f200919a.f200651q2) == null || !k0Var.i() || this.f200919a.H3 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "scanCode onSuccess, show enhance bottomSheet");
        this.f200919a.H3.o(zh1.y0.ENABLE);
    }

    @Override // oc5.n
    public void b(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200919a;
        java.lang.String x27 = imageGalleryUI.x2();
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(x27, false);
        if (i18 == null || !i18.equals(recogQBarOfImageFileFailedEvent.f54660g.f6278a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "not same filepath");
            return;
        }
        am.bq bqVar = recogQBarOfImageFileFailedEvent.f54660g;
        if (bqVar.f6280c && bqVar.f6279b == 2) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f200919a;
            imageGalleryUI2.u7(2, imageGalleryUI2.K7(imageGalleryUI2.f200611g, imageGalleryUI2.f200637n), com.tencent.mm.vfs.w6.i(x27, false), null, true, imageGalleryUI.f200624j3);
        }
        com.tencent.mm.ui.chatting.gallery.n8 n8Var = imageGalleryUI.E3;
        n8Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onScanFinishPathChecked#ScanState");
        n8Var.f201220a = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "scanCode onFailed result: %s, curPath: %s, path: %s", null, i18, x27);
        if (imageGalleryUI.f200674x2.d(2, 2) != 1) {
            imageGalleryUI.f200674x2.g(2, 2);
        }
        if (imageGalleryUI.u8() || (k0Var = imageGalleryUI.f200651q2) == null || !k0Var.i() || imageGalleryUI.H3 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "scanCode onFailed, show enhance bottomSheet");
        imageGalleryUI.H3.o(zh1.y0.ENABLE);
    }

    @Override // oc5.n
    public void c(java.lang.String str) {
        com.tencent.mm.ui.chatting.gallery.n8 n8Var = this.f200919a.E3;
        if (n8Var != null) {
            n8Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onScanStart#ScanState, realScanImgPath: " + str);
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = n8Var.f201221b;
            int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
            if (com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.vfs.w6.i(imageGalleryUI.x2(), false), str)) {
                n8Var.f201220a = 1;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onScanStart#ScanState, not match");
            }
        }
    }
}
