package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class PaymentCodeDetector {
    private long nativeObject;

    static {
        int i17 = fx5.a.f267157a;
    }

    public PaymentCodeDetector(java.lang.String str, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(str, dnnInferenceOptions);
    }

    private native long createNativeObject(java.lang.String str, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions);

    private native void destroyNativeObject(long j17);

    private native com.tencent.wevision2.modules.ocr.PaymentCode detect(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }

    public com.tencent.wevision2.modules.ocr.PaymentCode detect(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return detect(this.nativeObject, pixelBuffer);
    }
}
