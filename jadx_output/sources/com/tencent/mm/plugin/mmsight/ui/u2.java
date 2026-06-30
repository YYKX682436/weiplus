package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149431d;

    public u2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149431d = sightCaptureUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149431d;
        java.lang.String i17 = ai3.d.i(sightCaptureUI.f149235m.getFilePath());
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.t2(this, ((i17 + "\n" + java.lang.String.format("FPS: %s", java.lang.Float.valueOf(sightCaptureUI.f149235m.c()))) + "\n" + java.lang.String.format("TIME_RECODER_2_PLAY: %s", java.lang.Long.valueOf(ai3.d.n("TIME_RECODER_2_PLAY")))) + "\n" + java.lang.String.format("CPU: cur %s max:%s", wo.r.d(), wo.r.e())));
    }
}
