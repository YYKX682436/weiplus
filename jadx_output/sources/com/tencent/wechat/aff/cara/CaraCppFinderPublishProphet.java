package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraCppFinderPublishProphet extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraCppFinderPublishProphet.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCppFinderPublishProphet(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCppFinderPublishProphet(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraCppFinderPublishProphet(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraCppFinderPublishProphet(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraCppFinderPublishProphet buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraCppFinderPublishProphet(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraCppFinderPublishProphet(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native void jnipredict(long j17, java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    private native void jnireportThatConsume(long j17, java.lang.String str, boolean[] zArr);

    private native void jnireportThatExpose(long j17, java.lang.String str, java.lang.String[] strArr, boolean[] zArr);

    private native void jnireportThatPreload(long j17, java.lang.String str, boolean[] zArr);

    public void predict(java.lang.String str, com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext caraNativeFinderPublishProphetContext, com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback caraNativeProphetPredictPositiveCallback) {
        jnipredict(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeFinderPublishProphetContext), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeProphetPredictPositiveCallback));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCppFinderPublishProphet.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCppFinderPublishProphet.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void reportThatConsume(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        jnireportThatConsume(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional));
    }

    public void reportThatExpose(java.lang.String str, com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext caraNativeFinderPublishProphetContext, java.util.Optional<java.lang.Boolean> optional) {
        jnireportThatExpose(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeFinderPublishProphetContext), com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional));
    }

    public void reportThatPreload(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        jnireportThatPreload(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional));
    }

    public CaraCppFinderPublishProphet() {
        this.zidlCreateName = "cara.CaraCppFinderPublishProphet@Create";
        jniCreateCaraCppFinderPublishProphet("cara.CaraCppFinderPublishProphet@Create", this.zidlSvrIdentity, null);
    }
}
