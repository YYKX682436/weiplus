package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f171479d;

    public x2(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        this.f171479d = flipView;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jj4 cntMedia;
        com.tencent.mm.plugin.sns.storage.SnsInfo W0;
        com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f171479d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
        try {
            cntMedia = flipView.getCntMedia();
            W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(flipView.getSnsId());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlipView", th6, "[-] Exception was thrown when report.", new java.lang.Object[0]);
        }
        if (W0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "[-] Fail to get snsInfo. snsId:%s", java.lang.Long.valueOf(flipView.getSnsId()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
            return;
        }
        java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(cntMedia);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "[-] Fail to get path of media obj. snsLocalId:%s, snsId:%s, username:%s", W0.getLocalid(), W0.getSnsId(), W0.getUserName());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
            return;
        }
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(l17);
        if (n07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "[-] Fail to get bmp opts of media obj. snsLocalId:%s, snsId:%s, username:%s", W0.getLocalid(), W0.getSnsId(), W0.getUserName());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
            return;
        }
        java.lang.String[] ej6 = fo3.s.INSTANCE.ej(l17);
        java.lang.String str = ej6 != null ? ej6[0] : "";
        com.tencent.mm.app.t0 t0Var = new com.tencent.mm.app.t0(3, com.tencent.mm.app.s0.IMAGE, null);
        t0Var.f53779b = W0.getUserName();
        t0Var.f53781d = W0.field_snsId;
        t0Var.f53783f = cntMedia.f377858g;
        t0Var.f53784g = n07.outWidth;
        t0Var.f53785h = n07.outHeight;
        t0Var.f53786i = cntMedia.f377860i;
        t0Var.f53790m = kk.k.e(l17);
        t0Var.f53791n = str;
        com.tencent.mm.app.u0.a(t0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
    }
}
