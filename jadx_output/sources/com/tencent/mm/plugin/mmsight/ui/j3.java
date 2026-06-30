package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class j3 implements com.tencent.mm.plugin.mmsight.ui.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149351a;

    public j3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149351a = sightCaptureUI;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void a() {
        di3.n nVar;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149351a;
        if (sightCaptureUI.f149231g == 0 || (nVar = sightCaptureUI.f149233i) == null || !nVar.f232742i) {
            return;
        }
        android.widget.TextView textView = sightCaptureUI.E;
        if (textView != null && sightCaptureUI.f149230f) {
            textView.animate().alpha(0.0f).setDuration(100L).setListener(new com.tencent.mm.plugin.mmsight.ui.n2(sightCaptureUI)).start();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TestCaptureUiEvent", "onLongPress %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        ei3.m mVar = sightCaptureUI.f149235m;
        if (mVar == null) {
            return;
        }
        mVar.t();
        com.tencent.mm.sdk.platformtools.z3.b(true);
        sightCaptureUI.i7(6);
        if (sightCaptureUI.f149235m.t() == ei3.l.Stop) {
            int e76 = sightCaptureUI.e7();
            sightCaptureUI.f149240p1 = e76;
            if (e76 < 0) {
                sightCaptureUI.b7();
                return;
            }
        } else if (sightCaptureUI.f149240p1 < 0) {
            sightCaptureUI.b7();
            return;
        }
        sightCaptureUI.i7(2);
        di3.n nVar2 = sightCaptureUI.f149233i;
        if (nVar2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "switchToVideoFocusMode");
            wo.d1 d1Var = nVar2.f232741h;
            if (d1Var != null && nVar2.f232742i) {
                try {
                    android.hardware.Camera.Parameters c17 = d1Var.c();
                    java.util.List<java.lang.String> supportedFocusModes = c17.getSupportedFocusModes();
                    if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraSetting", "support continuous video");
                        c17.setFocusMode("continuous-video");
                    }
                    nVar2.f232741h.f(c17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "switchToVideoFocusMode error: %s", e17.getMessage());
                }
            }
        }
        if (sightCaptureUI.V.f148829s) {
            sightCaptureUI.f149227J.c(sightCaptureUI.f149232h.f71195h);
        }
        sightCaptureUI.f149237o.i(0, 100, (sightCaptureUI.f149232h.f71195h * 1000) - 500, 0, new com.tencent.mm.plugin.mmsight.ui.p2(sightCaptureUI));
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void b() {
        di3.n nVar;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149351a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onPressDown, currentStatus: %s", java.lang.Integer.valueOf(sightCaptureUI.f149231g));
        if (sightCaptureUI.f149231g == 0 || (nVar = sightCaptureUI.f149233i) == null || !nVar.f232742i) {
            return;
        }
        int[] iArr = new int[2];
        sightCaptureUI.f149237o.getLocationOnScreen(iArr);
        di3.n nVar2 = sightCaptureUI.f149233i;
        int i17 = iArr[1];
        if (nVar2.f232738e <= 0) {
            android.graphics.Point h17 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i18 = h17.y;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", java.lang.Integer.valueOf(i17), h17);
            if (i18 / 2 < i17) {
                try {
                    wo.d1 d1Var = nVar2.f232741h;
                    if (d1Var != null) {
                        int maxZoom = d1Var.c().getMaxZoom();
                        int i19 = ((int) (maxZoom / ((i17 / 3.0d) / 10))) + 1;
                        nVar2.f232738e = i19;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "scrollSmallZoomStep: %s, maxZoom: %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(maxZoom));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "calcScrollZoomStep error: %s", e17.getMessage());
                }
            }
        }
        if (sightCaptureUI.f149228d == 0) {
            sightCaptureUI.f149240p1 = sightCaptureUI.e7();
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void c() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149351a;
        ei3.m mVar = sightCaptureUI.f149235m;
        objArr[1] = mVar;
        objArr[2] = java.lang.Long.valueOf(mVar != null ? mVar.n() : 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.TestCaptureUiEvent", "onLongPressFinish %s, recorder: %s, recordTime: %s", objArr);
        int i17 = sightCaptureUI.f149228d;
        if (i17 == 0) {
            ei3.m mVar2 = sightCaptureUI.f149235m;
            if (mVar2 == null || mVar2.n() > 1000 || sightCaptureUI.f149235m.t() != ei3.l.Start) {
                sightCaptureUI.f7();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "video record too short, cancel and convert to takepicture");
            sightCaptureUI.f149235m.cancel();
            if (sightCaptureUI.f149228d == 0) {
                com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.T6(sightCaptureUI);
                return;
            }
            return;
        }
        if (i17 == 1) {
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            ei3.m mVar3 = sightCaptureUI.f149235m;
            objArr2[0] = mVar3 == null ? "null" : mVar3.getClass().getSimpleName();
            ei3.m mVar4 = sightCaptureUI.f149235m;
            objArr2[1] = java.lang.Long.valueOf(mVar4 == null ? -1L : mVar4.n());
            com.tencent.mars.xlog.Log.i("MicroMsg.TestCaptureUiEvent", "onLongPressFinish, MODE_SIGHT, recorder=%s, recordTime=%d", objArr2);
            ei3.m mVar5 = sightCaptureUI.f149235m;
            if ((mVar5 == null || mVar5.n() > 1000) && sightCaptureUI.f149235m != null) {
                sightCaptureUI.f7();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "video record too short");
            dp.a.makeText(sightCaptureUI, com.tencent.mm.R.string.gw8, 1).show();
            sightCaptureUI.c7();
        }
    }
}
