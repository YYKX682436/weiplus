package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class i2 implements com.tencent.mm.plugin.mmsight.ui.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149345a;

    public i2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149345a = sightCaptureUI;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void a() {
        di3.n nVar;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149345a;
        if (sightCaptureUI.f149231g == 0 || (nVar = sightCaptureUI.f149233i) == null) {
            return;
        }
        nVar.q(true, false, 1);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void b() {
        di3.n nVar;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149345a;
        if (sightCaptureUI.f149231g == 0 || (nVar = sightCaptureUI.f149233i) == null) {
            return;
        }
        nVar.q(false, false, 1);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void c(float f17, float f18) {
        com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149345a;
        int i17 = sightCaptureUI.f149231g;
        if (i17 == 0 || i17 == 3 || i17 == 4 || (mMSightCameraGLSurfaceView = sightCaptureUI.C) == null) {
            return;
        }
        di3.n nVar = sightCaptureUI.f149233i;
        int width = mMSightCameraGLSurfaceView.getWidth();
        int height = sightCaptureUI.C.getHeight();
        if (fp.h.a(14)) {
            nVar.getClass();
        } else {
            di3.m mVar = nVar.P;
            mVar.removeMessages(4354);
            mVar.f232731b = f17;
            mVar.f232732c = f18;
            mVar.f232733d = width;
            mVar.f232734e = height;
            mVar.sendMessageDelayed(mVar.obtainMessage(4354, nVar.f232741h), 400L);
        }
        com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView cameraFrontSightView = sightCaptureUI.f149254z;
        if (cameraFrontSightView == null) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) cameraFrontSightView.getLayoutParams();
        com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView cameraFrontSightView2 = sightCaptureUI.f149254z;
        layoutParams.leftMargin = ((int) f17) - (cameraFrontSightView2.f149123i / 2);
        layoutParams.topMargin = ((int) f18) - (cameraFrontSightView2.f149124m / 2);
        cameraFrontSightView2.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView cameraFrontSightView3 = sightCaptureUI.f149254z;
        cameraFrontSightView3.setVisibility(0);
        cameraFrontSightView3.f149119e = true;
        cameraFrontSightView3.f149120f = false;
        cameraFrontSightView3.f149121g = false;
        cameraFrontSightView3.f149122h = java.lang.System.currentTimeMillis();
        cameraFrontSightView3.invalidate();
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void d() {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149345a;
        if (sightCaptureUI.f149231g == 0 || sightCaptureUI.f149252y0 <= 1) {
            return;
        }
        sightCaptureUI.f149233i.P.removeMessages(4354);
        sightCaptureUI.g7();
    }
}
