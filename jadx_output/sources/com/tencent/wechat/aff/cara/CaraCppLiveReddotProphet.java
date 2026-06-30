package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraCppLiveReddotProphet extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCppLiveReddotProphet(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCppLiveReddotProphet(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraCppLiveReddotProphet(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraCppLiveReddotProphet(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraCppLiveReddotProphet(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native void jnipredict(long j17, java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    private native void jnireportThatPreload(long j17, java.lang.String str, boolean[] zArr);

    private native void jnireportThatReddotConsume(long j17, java.lang.String str, boolean[] zArr);

    private native void jnireportThatReddotExpose(long j17, java.lang.String str, boolean[] zArr, java.lang.String[] strArr);

    public void predict(java.lang.String str, com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext caraNativeLiveReddotProphetContext, com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback caraNativeProphetPredictPositiveCallback) {
        jnipredict(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeLiveReddotProphetContext), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeProphetPredictPositiveCallback));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void reportThatPreload(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        jnireportThatPreload(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional));
    }

    public void reportThatReddotConsume(java.lang.String str, java.util.Optional<java.lang.Boolean> optional) {
        jnireportThatReddotConsume(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional));
    }

    public void reportThatReddotExpose(java.lang.String str, java.util.Optional<java.lang.Boolean> optional, com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext caraNativeLiveReddotProphetContext) {
        jnireportThatReddotExpose(this.nativeHandler, str, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeLiveReddotProphetContext));
    }

    public CaraCppLiveReddotProphet() {
        this.zidlCreateName = "cara.CaraCppLiveReddotProphet@Create";
        jniCreateCaraCppLiveReddotProphet("cara.CaraCppLiveReddotProphet@Create", this.zidlSvrIdentity, null);
    }
}
