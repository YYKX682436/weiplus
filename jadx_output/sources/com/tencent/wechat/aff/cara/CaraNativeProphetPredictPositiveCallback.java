package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeProphetPredictPositiveCallback extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeProphetPredictPositiveCallback(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeProphetPredictPositiveCallback(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeProphetPredictPositiveCallback(com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallbackBase caraNativeProphetPredictPositiveCallbackBase) {
        this.zidlCreateName = "cara.CaraNativeProphetPredictPositiveCallback@Attach";
        jniCreateCaraNativeProphetPredictPositiveCallback("cara.CaraNativeProphetPredictPositiveCallback@Attach", this.zidlSvrIdentity, caraNativeProphetPredictPositiveCallbackBase);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeProphetPredictPositiveCallback(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native void jniinvoke(long j17, byte[] bArr);

    public void invoke(com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive caraPredictionPositive) {
        jniinvoke(this.nativeHandler, caraPredictionPositive.toByteArray());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public CaraNativeProphetPredictPositiveCallback(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeProphetPredictPositiveCallback(str, str2, null);
    }
}
