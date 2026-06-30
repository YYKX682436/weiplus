package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class TextRecognizer {
    private long nativeObject;

    /* loaded from: classes14.dex */
    public static class Options {
    }

    static {
        int i17 = fx5.a.f267157a;
    }

    public TextRecognizer(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(str, str2, str3, dnnInferenceOptions);
    }

    private native long createNativeObject(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions);

    private native void destroyNativeObject(long j17);

    private native android.graphics.PointF[][] detect(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    private native android.graphics.PointF[][] locateKeyword(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer, java.lang.String str, int i17);

    private native com.tencent.wevision2.modules.ocr.Text[] recognize(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    private native java.lang.String recognizeText(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    private native java.lang.String[] recognizeTexts(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    private native void setOptions(long j17, com.tencent.wevision2.modules.ocr.TextRecognizer.Options options);

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }

    public android.graphics.PointF[][] detect(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return detect(this.nativeObject, pixelBuffer);
    }

    public android.graphics.PointF[][] locateKeyword(com.tencent.wevision2.base.PixelBuffer pixelBuffer, java.lang.String str, int i17) {
        return locateKeyword(this.nativeObject, pixelBuffer, str, i17);
    }

    public com.tencent.wevision2.modules.ocr.Text[] recognize(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return recognize(this.nativeObject, pixelBuffer);
    }

    public java.lang.String recognizeText(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return recognizeText(this.nativeObject, pixelBuffer);
    }

    public java.lang.String[] recognizeTexts(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return recognizeTexts(this.nativeObject, pixelBuffer);
    }

    public void setOptions(com.tencent.wevision2.modules.ocr.TextRecognizer.Options options) {
        setOptions(this.nativeObject, options);
    }
}
