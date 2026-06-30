package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149309d;

    public d3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149309d = sightCaptureUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149309d;
        if (sightCaptureUI.f149231g != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "checkPreviewStatusRunnable, not previewing now!!!");
            sightCaptureUI.i7(9);
        }
    }
}
