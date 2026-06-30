package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeFinderFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenter.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeFinderFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeFinderFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeFinderFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeFinderFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeFinderFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native int jniauthIconType(long j17);

    private native int jnifansCount(long j17);

    private native boolean jnihasFinderAccount(long j17);

    private native boolean jniisRealName(long j17);

    private native int jnipostFeedCount(long j17);

    private native boolean jniwxPayAuthorization(long j17);

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType authIconType() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType.forNumber(jniauthIconType(this.nativeHandler));
    }

    public int fansCount() {
        return jnifansCount(this.nativeHandler);
    }

    public boolean hasFinderAccount() {
        return jnihasFinderAccount(this.nativeHandler);
    }

    public boolean isRealName() {
        return jniisRealName(this.nativeHandler);
    }

    public int postFeedCount() {
        return jnipostFeedCount(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public boolean wxPayAuthorization() {
        return jniwxPayAuthorization(this.nativeHandler);
    }

    public CaraNativeFinderFeatureCenter() {
        this.zidlCreateName = "cara.CaraNativeFinderFeatureCenter@Create";
        jniCreateCaraNativeFinderFeatureCenter("cara.CaraNativeFinderFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
