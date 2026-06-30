package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes14.dex */
public class w1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159663d;

    public w1(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159663d = scanTranslationCaptureUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.List<java.lang.String> supportedFocusModes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159663d;
        if (scanTranslationCaptureUI.H != 0 || view != scanTranslationCaptureUI.E) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "event down, (%f, %f)", java.lang.Float.valueOf(motionEvent.getX()), java.lang.Float.valueOf(motionEvent.getY()));
            float x17 = motionEvent.getX() / this.f159663d.E.getWidth();
            float y17 = motionEvent.getY() / this.f159663d.E.getHeight();
            xy3.a aVar = this.f159663d.f159352f;
            com.tencent.mm.plugin.scanner.ui.v1 v1Var = new com.tencent.mm.plugin.scanner.ui.v1(this);
            aVar.getClass();
            int i17 = (int) (x17 * 2000.0f);
            int i18 = (int) (2000.0f * y17);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", java.lang.String.format("fx %f, fy %f, x %d, y %d", java.lang.Float.valueOf(x17), java.lang.Float.valueOf(y17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
                android.graphics.Rect rect = new android.graphics.Rect();
                if (aVar.f366666k) {
                    int i19 = i18 - 1000;
                    rect.left = i19 - 250;
                    rect.right = i19 + 250;
                    int i27 = (2000 - i17) - 1000;
                    rect.top = i27 - 250;
                    rect.bottom = i27 + 250;
                } else {
                    int i28 = i17 - 1000;
                    rect.left = i28 - 250;
                    rect.right = i28 + 250;
                    int i29 = i18 - 1000;
                    rect.top = i29 - 250;
                    rect.bottom = i29 + 250;
                }
                android.hardware.Camera.Parameters parameters = aVar.f366656a.getParameters();
                if (rect.left < -1000) {
                    rect.left = -1000;
                }
                if (rect.right > 1000) {
                    rect.right = 1000;
                }
                if (rect.top < -1000) {
                    rect.top = -1000;
                }
                if (rect.bottom > 1000) {
                    rect.bottom = 1000;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "focus area " + rect);
                android.graphics.Rect rect2 = new android.graphics.Rect(rect);
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(new android.hardware.Camera.Area(rect2, 1000));
                    parameters.setMeteringAreas(arrayList2);
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(new android.hardware.Camera.Area(rect, 1000));
                        parameters.setFocusAreas(arrayList3);
                        aVar.f366656a.cancelAutoFocus();
                        if (aVar.f366656a != null && aVar.f366658c && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
                            java.lang.String focusMode = parameters.getFocusMode();
                            if (!(focusMode == null || focusMode.length() == 0) && !parameters.getFocusMode().equals("auto")) {
                                parameters.setFocusMode("auto");
                            }
                        }
                        aVar.f366656a.setParameters(parameters);
                        aVar.f366656a.autoFocus(v1Var);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea, camera not support area focus");
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea, camera not support set metering area");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea error: " + e17.getMessage());
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
