package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class CertificateDetector {
    private long nativeObject;

    static {
        int i17 = fx5.a.f267157a;
    }

    public CertificateDetector(int i17, java.lang.String str, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(i17, str, dnnInferenceOptions);
    }

    private native long createNativeObject(int i17, java.lang.String str, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions);

    private native void destroyNativeObject(long j17);

    private native com.tencent.wevision2.modules.ocr.Certificate detect(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    private native void setThreshold(long j17, int i17, int i18, int i19, int i27);

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }

    public com.tencent.wevision2.modules.ocr.Certificate detect(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return detect(this.nativeObject, pixelBuffer);
    }

    public void setThreshold(int i17, int i18, int i19, int i27) {
        setThreshold(this.nativeObject, i17, i18, i19, i27);
    }
}
