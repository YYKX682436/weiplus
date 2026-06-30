package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeFeatureCenter.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public CaraNativeFeatureCenter() {
        this.zidlCreateName = "cara.CaraNativeFeatureCenter@Create";
        jniCreateCaraNativeFeatureCenter("cara.CaraNativeFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
