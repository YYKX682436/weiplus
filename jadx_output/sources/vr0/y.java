package vr0;

/* loaded from: classes14.dex */
public final class y extends androidx.camera.core.ImageCapture.OnImageCapturedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f439531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f439532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f439533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f439535f;

    public y(vr0.z zVar, long j17, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        this.f439530a = zVar;
        this.f439531b = j17;
        this.f439532c = i17;
        this.f439533d = i18;
        this.f439534e = i19;
        this.f439535f = continuation;
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureSuccess(androidx.camera.core.ImageProxy image) {
        kotlin.jvm.internal.o.g(image, "image");
        as0.a aVar = as0.a.f13425a;
        vr0.z zVar = this.f439530a;
        int i17 = zVar.f411430d;
        int width = image.getWidth();
        int height = image.getHeight();
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = aVar.a(i17);
        if (a17 != null) {
            a17.f55576y = width;
            a17.f55577z = height;
        }
        android.graphics.Rect cropRect = image.getCropRect();
        kotlin.jvm.internal.o.f(cropRect, "getCropRect(...)");
        android.graphics.Bitmap E = !(zVar.f411441r != 0) ? com.tencent.mm.sdk.platformtools.x.E(image.toBitmap(), cropRect.left, cropRect.top, cropRect.width(), cropRect.height(), false) : image.toBitmap();
        int rotationDegrees = image.getImageInfo().getRotationDegrees();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("takePictureAsync from imageCapture cost:");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f439531b;
        sb6.append(currentTimeMillis - j17);
        sb6.append(" size:[");
        sb6.append(E.getWidth());
        sb6.append(' ');
        sb6.append(E.getHeight());
        sb6.append("] screen rotation:");
        int i18 = this.f439532c;
        sb6.append(i18);
        sb6.append(" imageDegree:");
        sb6.append(rotationDegrees);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", sb6.toString());
        int i19 = this.f439533d;
        int i27 = this.f439534e;
        int i28 = rotationDegrees + i18;
        boolean z17 = zVar.f411437n.f456161c;
        zVar.getClass();
        android.graphics.Bitmap y17 = zVar.y(i19, i27, i28, E, !z17);
        image.close();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("takePictureAsync total cost:");
        sb7.append(currentTimeMillis2);
        sb7.append(" size:[");
        sb7.append(y17 != null ? java.lang.Integer.valueOf(y17.getWidth()) : null);
        sb7.append(' ');
        sb7.append(y17 != null ? java.lang.Integer.valueOf(y17.getHeight()) : null);
        sb7.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", sb7.toString());
        int i29 = zVar.f411430d;
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a18 = aVar.a(i29);
        if (a18 != null) {
            a18.f55572u = currentTimeMillis2;
        }
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a19 = aVar.a(i29);
        if (a19 != null) {
            a19.X = 1;
        }
        this.f439535f.resumeWith(kotlin.Result.m521constructorimpl(y17));
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onError(androidx.camera.core.ImageCaptureException exception) {
        kotlin.jvm.internal.o.g(exception, "exception");
        super.onError(exception);
        com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraXImpl", "takePictureAsync from imageCapture happen error:" + exception + " cost:" + (java.lang.System.currentTimeMillis() - this.f439531b));
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = as0.a.f13425a.a(this.f439530a.f411430d);
        if (a17 != null) {
            a17.X = 1;
        }
        this.f439535f.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
