package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class Reporter {
    private long nativeObject;

    static {
        int i17 = fx5.a.f267157a;
    }

    public Reporter(int i17) {
        this.nativeObject = 0L;
        this.nativeObject = createNativeObject(i17);
    }

    private native long createNativeObject(int i17);

    private native void destroyNativeObject(long j17);

    private native java.lang.String purgeData(long j17);

    public void destroy() {
        destroyNativeObject(this.nativeObject);
        this.nativeObject = 0L;
    }

    public java.lang.String purgeData() {
        return purgeData(this.nativeObject);
    }
}
