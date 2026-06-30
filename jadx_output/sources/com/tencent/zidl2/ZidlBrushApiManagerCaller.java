package com.tencent.zidl2;

/* loaded from: classes7.dex */
public class ZidlBrushApiManagerCaller {
    private static com.tencent.zidl2.ZidlBrushApiManagerCaller instance = new com.tencent.zidl2.ZidlBrushApiManagerCaller();

    public ZidlBrushApiManagerCaller() {
        jniCreateZidlBrushApiManager();
    }

    public static com.tencent.zidl2.ZidlBrushApiManagerCaller getInstance() {
        return instance;
    }

    private native void jniCreateZidlBrushApiManager();

    private native java.lang.Object jniGetPropMagicBrushRequest();

    private native java.lang.Object jniGetPropMagicBrushResponse();

    private native java.lang.Object jniGetPropMagicSclBizFlutterApi();

    private native java.lang.Object jniGetPropMagicSclBizHostApi();

    private native java.lang.Object jniGetPropMagicSclRequest();

    private native void jniSetPropMagicBrushRequest(java.lang.Object obj);

    private native void jniSetPropMagicBrushResponse(java.lang.Object obj);

    private native void jniSetPropMagicSclBizFlutterApi(java.lang.Object obj);

    private native void jniSetPropMagicSclBizHostApi(java.lang.Object obj);

    private native void jniSetPropMagicSclRequest(java.lang.Object obj);

    public <T> T getPropMagicBrushRequest() {
        return (T) jniGetPropMagicBrushRequest();
    }

    public <T> T getPropMagicBrushResponse() {
        return (T) jniGetPropMagicBrushResponse();
    }

    public <T> T getPropMagicSclBizFlutterApi() {
        return (T) jniGetPropMagicSclBizFlutterApi();
    }

    public <T> T getPropMagicSclBizHostApi() {
        return (T) jniGetPropMagicSclBizHostApi();
    }

    public <T> T getPropMagicSclRequest() {
        return (T) jniGetPropMagicSclRequest();
    }

    public void setPropMagicBrushRequest(java.lang.Object obj) {
        jniSetPropMagicBrushRequest(obj);
    }

    public void setPropMagicBrushResponse(java.lang.Object obj) {
        jniSetPropMagicBrushResponse(obj);
    }

    public void setPropMagicSclBizFlutterApi(java.lang.Object obj) {
        jniSetPropMagicSclBizFlutterApi(obj);
    }

    public void setPropMagicSclBizHostApi(java.lang.Object obj) {
        jniSetPropMagicSclBizHostApi(obj);
    }

    public void setPropMagicSclRequest(java.lang.Object obj) {
        jniSetPropMagicSclRequest(obj);
    }
}
