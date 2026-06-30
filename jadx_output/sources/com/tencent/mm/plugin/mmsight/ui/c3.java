package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149301d;

    public c3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149301d = sightCaptureUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149301d;
        if (sightCaptureUI.f149231g != 7 || sightCaptureUI.f149237o == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "showRecoderProgressBar");
        sightCaptureUI.f149237o.h();
    }
}
