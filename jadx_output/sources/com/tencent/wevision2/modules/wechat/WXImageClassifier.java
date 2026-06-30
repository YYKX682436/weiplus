package com.tencent.wevision2.modules.wechat;

/* loaded from: classes14.dex */
public class WXImageClassifier {
    public static final int SCENE_APP_BRAND = 0;
    public static final int SCENE_CAMERA = 1;
    private long nativeObject;

    static {
        int i17 = fx5.a.f267157a;
    }

    public WXImageClassifier(java.lang.String str, java.lang.String str2, int i17, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(str, str2, i17, dnnInferenceOptions);
    }

    private native com.tencent.wevision2.modules.wechat.WXImageInfo classify(long j17, com.tencent.wevision2.base.PixelBuffer pixelBuffer);

    private native long createNativeObject(java.lang.String str, java.lang.String str2, int i17, com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions);

    private native void destroyNativeObject(long j17);

    public com.tencent.wevision2.modules.wechat.WXImageInfo classify(com.tencent.wevision2.base.PixelBuffer pixelBuffer) {
        return classify(this.nativeObject, pixelBuffer);
    }

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }
}
