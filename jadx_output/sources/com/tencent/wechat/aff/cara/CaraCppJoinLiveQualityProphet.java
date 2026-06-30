package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraCppJoinLiveQualityProphet extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraCppJoinLiveQualityProphet.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCppJoinLiveQualityProphet(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCppJoinLiveQualityProphet(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraCppJoinLiveQualityProphet(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraCppJoinLiveQualityProphet(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraCppJoinLiveQualityProphet buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraCppJoinLiveQualityProphet(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraCppJoinLiveQualityProphet(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native byte[] jnigetPrediction(long j17);

    private native void jnireportThatJoinLive(long j17, boolean[] zArr, java.lang.String[] strArr);

    private native void jnireportThatLiveRoomLag(long j17, boolean[] zArr, java.lang.String[] strArr);

    private native void jnistartPredict(long j17);

    private native void jnistopPredict(long j17);

    public java.util.Optional<com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive> getPrediction() {
        return com.tencent.wechat.zidl2.ZidlUtil.messageJniToJavaOptional(com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.getDefaultInstance(), jnigetPrediction(this.nativeHandler));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCppJoinLiveQualityProphet.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCppJoinLiveQualityProphet.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void reportThatJoinLive(java.util.Optional<java.lang.Boolean> optional, com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext caraNativeJoinLiveQualityProphetContext) {
        jnireportThatJoinLive(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeJoinLiveQualityProphetContext));
    }

    public void reportThatLiveRoomLag(java.util.Optional<java.lang.Boolean> optional, com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext caraNativeJoinLiveQualityProphetContext) {
        jnireportThatLiveRoomLag(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeJoinLiveQualityProphetContext));
    }

    public void startPredict() {
        jnistartPredict(this.nativeHandler);
    }

    public void stopPredict() {
        jnistopPredict(this.nativeHandler);
    }

    public CaraCppJoinLiveQualityProphet() {
        this.zidlCreateName = "cara.CaraCppJoinLiveQualityProphet@Create";
        jniCreateCaraCppJoinLiveQualityProphet("cara.CaraCppJoinLiveQualityProphet@Create", this.zidlSvrIdentity, null);
    }
}
