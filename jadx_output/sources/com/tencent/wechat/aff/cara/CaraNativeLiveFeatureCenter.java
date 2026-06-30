package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeLiveFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenter.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeLiveFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeLiveFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeLiveFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeLiveFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeLiveFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native int jnicurrentNetworkQuality(long j17);

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality currentNetworkQuality() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality.forNumber(jnicurrentNetworkQuality(this.nativeHandler));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public CaraNativeLiveFeatureCenter() {
        this.zidlCreateName = "cara.CaraNativeLiveFeatureCenter@Create";
        jniCreateCaraNativeLiveFeatureCenter("cara.CaraNativeLiveFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
