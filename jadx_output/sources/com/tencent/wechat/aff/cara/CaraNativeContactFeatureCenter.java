package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeContactFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeContactFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeContactFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeContactFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeContactFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeContactFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native java.lang.String[] jnigetContactByUsername(long j17, java.lang.String str);

    public java.util.Optional<com.tencent.wechat.aff.cara.CaraNativeContact> getContactByUsername(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObjOptional(jnigetContactByUsername(this.nativeHandler, str), new com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter$$a());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public CaraNativeContactFeatureCenter() {
        this.zidlCreateName = "cara.CaraNativeContactFeatureCenter@Create";
        jniCreateCaraNativeContactFeatureCenter("cara.CaraNativeContactFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
