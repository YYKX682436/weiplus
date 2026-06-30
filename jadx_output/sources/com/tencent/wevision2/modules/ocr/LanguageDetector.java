package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class LanguageDetector {
    private long nativeObject;

    static {
        int i17 = fx5.a.f267157a;
    }

    public LanguageDetector(java.lang.String str, java.lang.String str2, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(str, str2, dnnInferenceOptions);
    }

    private native long createNativeObject(java.lang.String str, java.lang.String str2, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions);

    private native void destroyNativeObject(long j17);

    private native com.tencent.wevision2.modules.ocr.Language[] detect(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }

    public com.tencent.wevision2.modules.ocr.Language[] detect(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return detect(this.nativeObject, pixelBuffer);
    }
}
