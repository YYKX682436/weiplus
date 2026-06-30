package ny4;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wevision2.modules.ocr.TextRecognizer f341465a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f341466b = new java.lang.Object();

    public g() {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.c0.i("MODEL_OCR_DET", "MODEL_OCR_REC_MODEL", "MODEL_OCR_REC_MAP"));
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f350688a;
        if (s3Var.a(arrayList)) {
            return;
        }
        s3Var.c(arrayList);
    }

    public final float a(java.nio.Buffer dataBuffer, int i17, int i18) {
        kotlin.jvm.internal.o.g(dataBuffer, "dataBuffer");
        synchronized (this.f341466b) {
            com.tencent.wevision2.modules.ocr.TextRecognizer textRecognizer = this.f341465a;
            if (textRecognizer == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeChatPicTranslateManager", "applyReq but handler is null");
                return 0.0f;
            }
            android.graphics.PointF[][] detect = textRecognizer.detect(new com.tencent.wevision2.base.PixelBuffer(i17, i18, 3, (java.nio.ByteBuffer) dataBuffer));
            boolean z17 = true;
            if (detect != null) {
                if (!(detect.length == 0)) {
                    z17 = false;
                }
            }
            return z17 ? 0.0f : 1.0f;
        }
    }

    public final int b() {
        if (this.f341465a != null) {
            return 0;
        }
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f350688a;
        java.lang.String b17 = s3Var.b("MODEL_OCR_DET");
        java.lang.String b18 = s3Var.b("MODEL_OCR_REC_MODEL");
        java.lang.String b19 = s3Var.b("MODEL_OCR_REC_MAP");
        if (!(b17 == null || b17.length() == 0)) {
            if (!(b18 == null || b18.length() == 0)) {
                if (!(b19 == null || b19.length() == 0)) {
                    synchronized (this.f341466b) {
                        com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions = new com.tencent.wevision2.dnn.DnnInferenceOptions();
                        dnnInferenceOptions.autoClearMemory = true;
                        this.f341465a = new com.tencent.wevision2.modules.ocr.TextRecognizer(b17, b18, b19, dnnInferenceOptions);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatPicTranslateManager", "init WeVision2.TextRecoginzer success");
                    }
                    return 0;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatPicTranslateManager", "ocr model is null");
        return 1;
    }
}
