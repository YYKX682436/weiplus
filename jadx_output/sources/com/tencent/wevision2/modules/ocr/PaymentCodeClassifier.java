package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class PaymentCodeClassifier {
    private long nativeObject;

    static {
        int i17 = fx5.a.f267157a;
    }

    public PaymentCodeClassifier(java.lang.String str, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(str, dnnInferenceOptions);
    }

    private native com.tencent.wevision2.modules.ocr.PaymentCode classify(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer, android.graphics.PointF[] pointFArr);

    private native long createNativeObject(java.lang.String str, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions);

    private native void destroyNativeObject(long j17);

    public com.tencent.wevision2.modules.ocr.PaymentCode classify(com.tencent.wevision2.base.PixelBuffer pixelBuffer, android.graphics.PointF[] pointFArr) {
        return classify(this.nativeObject, pixelBuffer, pointFArr);
    }

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }
}
