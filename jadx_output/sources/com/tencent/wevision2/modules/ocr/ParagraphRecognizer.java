package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class ParagraphRecognizer {
    private long nativeObject;

    static {
        int i17 = fx5.a.f267157a;
    }

    public ParagraphRecognizer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(str, str2, str3, str4, dnnInferenceOptions);
    }

    private native long createNativeObject(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions);

    private native void destroyNativeObject(long j17);

    private native com.tencent.wevision2.modules.ocr.Paragraph[] recognize(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }

    public com.tencent.wevision2.modules.ocr.Paragraph[] recognize(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return recognize(this.nativeObject, pixelBuffer);
    }
}
