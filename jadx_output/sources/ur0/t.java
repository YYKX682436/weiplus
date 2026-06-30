package ur0;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.camera2.CaptureRequest.Builder f430337a;

    /* renamed from: b, reason: collision with root package name */
    public android.hardware.camera2.CameraCharacteristics f430338b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f430339c;

    public final boolean a(boolean z17) {
        android.graphics.Rect rect;
        if (this.f430339c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2ZoomHelper", "when zoomIn isZooming");
            return false;
        }
        android.hardware.camera2.CaptureRequest.Builder builder = this.f430337a;
        if (builder == null || this.f430338b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera2ZoomHelper", "when zoomIn but res is ready");
            return false;
        }
        this.f430339c = true;
        if (builder != null) {
            try {
                try {
                    rect = (android.graphics.Rect) builder.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Camera.Camera2ZoomHelper", e17, "onZoomIn error:", new java.lang.Object[0]);
                    this.f430339c = false;
                    return false;
                }
            } catch (java.lang.Throwable th6) {
                this.f430339c = false;
                throw th6;
            }
        } else {
            rect = null;
        }
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.f430338b;
        android.graphics.Rect rect2 = cameraCharacteristics != null ? (android.graphics.Rect) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) : null;
        kotlin.jvm.internal.o.d(rect2);
        float width = rect2.width();
        kotlin.jvm.internal.o.d(rect);
        float width2 = width / rect.width();
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics2 = this.f430338b;
        kotlin.jvm.internal.o.d(cameraCharacteristics2);
        java.lang.Float f17 = (java.lang.Float) cameraCharacteristics2.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f17 == null) {
            f17 = java.lang.Float.valueOf(0.0f);
        }
        float floatValue = f17.floatValue();
        if (width2 >= floatValue) {
            this.f430339c = false;
            return false;
        }
        if (z17) {
            float f18 = width2 + 0.1f;
            if (f18 < floatValue) {
                floatValue = f18;
            }
        } else {
            floatValue = 1.0f;
            if (width2 == 1.0f) {
                this.f430339c = false;
                return false;
            }
            float f19 = width2 - 0.1f;
            if (f19 > 1.0f) {
                floatValue = f19;
            }
        }
        float width3 = rect2.width() / floatValue;
        float height = rect2.height() / floatValue;
        float f27 = 2;
        float width4 = (rect2.width() - width3) / f27;
        float height2 = (rect2.height() - height) / f27;
        android.graphics.Rect rect3 = new android.graphics.Rect((int) width4, (int) height2, (int) (width4 + width3), (int) (height2 + height));
        android.hardware.camera2.CaptureRequest.Builder builder2 = this.f430337a;
        if (builder2 != null) {
            builder2.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, rect3);
        }
        this.f430339c = false;
        return true;
    }
}
