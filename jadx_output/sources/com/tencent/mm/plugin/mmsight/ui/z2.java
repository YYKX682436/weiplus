package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class z2 implements com.tencent.mm.plugin.mmsight.ui.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149454a;

    public z2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149454a = sightCaptureUI;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.z1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "on video edit error");
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149454a;
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = sightCaptureUI.K;
        if (a2Var != null) {
            a2Var.e();
            sightCaptureUI.K = null;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.y2(this));
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.z1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "on video edit finish");
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149454a;
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = sightCaptureUI.K;
        if (a2Var != null) {
            java.lang.String str = a2Var.A;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            sightCaptureUI.C1 = str;
            a2Var.f(false, sightCaptureUI.V.f148827q);
            this.f149454a.K.e();
            this.f149454a.K = null;
        }
        this.f149454a.f149238p.setVisibility(0);
        this.f149454a.f149241q.setVisibility(0);
        this.f149454a.f149248x.setVisibility(0);
        this.f149454a.H.stop();
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI2 = this.f149454a;
        sightCaptureUI2.H.setVideoPath(sightCaptureUI2.f149235m.getFilePath());
        this.f149454a.H.setLoop(true);
        this.f149454a.H.setForceScaleFullScreen(true);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI3 = this.f149454a;
        sightCaptureUI3.H.setVideoCallback(sightCaptureUI3.M1);
        this.f149454a.setSelfNavigationBarVisible(8);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.mmsight.ui.x2(this));
        this.f149454a.A1 = true;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.z1
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "on video edit exit");
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149454a;
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = sightCaptureUI.K;
        if (a2Var != null) {
            a2Var.f(true, sightCaptureUI.V.f148827q);
            sightCaptureUI.K.e();
            sightCaptureUI.K = null;
        }
        sightCaptureUI.setSelfNavigationBarVisible(8);
        sightCaptureUI.f149238p.setVisibility(0);
        sightCaptureUI.f149241q.setVisibility(0);
        sightCaptureUI.f149248x.setVisibility(0);
    }
}
