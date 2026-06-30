package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149417d;

    public s2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI, int i17, int i18) {
        this.f149417d = sightCaptureUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149417d;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SightCaptureUI", "call stop callback now, currentStatus: %s", sightCaptureUI.h7(sightCaptureUI.f149231g));
        this.f149417d.f149233i.m(di3.l.Stoping);
        this.f149417d.Z6();
        long n17 = ai3.d.n("TIME_RECODER_2_PLAY");
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.mmsight.ui.r2(this, n17));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "stop finish, filepath: %s %s time_takevideo %s", this.f149417d.f149235m.getFilePath(), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(this.f149417d.f149235m.getFilePath())), java.lang.Long.valueOf(n17));
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI2 = this.f149417d;
        sightCaptureUI2.C1 = sightCaptureUI2.f149235m.getMd5();
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.U6(this.f149417d);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI3 = this.f149417d;
        sightCaptureUI3.getClass();
        di3.u.f232763a.postToWorker(new com.tencent.mm.plugin.mmsight.ui.u2(sightCaptureUI3));
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI4 = this.f149417d;
        sightCaptureUI4.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "start preview");
        fp.e eVar = sightCaptureUI4.f149249x0;
        if (eVar != null) {
            eVar.b();
        }
        sightCaptureUI4.H.setVisibility(0);
        sightCaptureUI4.H.setAlpha(0.0f);
        sightCaptureUI4.H.setVideoPath(sightCaptureUI4.f149235m.getFilePath());
        sightCaptureUI4.H.setLoop(true);
        sightCaptureUI4.H.setForceScaleFullScreen(true);
        sightCaptureUI4.H.setVideoCallback(sightCaptureUI4.M1);
        com.tencent.mm.sdk.platformtools.u3.i(this.f149417d.L1, 1000L);
        int i17 = this.f149417d.V.f148825o;
        if (i17 == 1 || i17 == 2 || i17 == 7) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13819, 2, java.lang.Integer.valueOf(this.f149417d.V.f148825o), this.f149417d.V.f148827q, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        }
    }
}
