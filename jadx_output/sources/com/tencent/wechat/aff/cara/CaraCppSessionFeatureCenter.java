package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraCppSessionFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraCppSessionFeatureCenter.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCppSessionFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCppSessionFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraCppSessionFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraCppSessionFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraCppSessionFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraCppSessionFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraCppSessionFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native void jnireportThatConsumeSession(long j17, java.lang.String[] strArr);

    private native void jnireportThatSend(long j17, java.lang.String[] strArr);

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCppSessionFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCppSessionFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void reportThatConsumeSession(com.tencent.wechat.aff.cara.CaraNativeConsumeSession caraNativeConsumeSession) {
        jnireportThatConsumeSession(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeConsumeSession));
    }

    public void reportThatSend(com.tencent.wechat.aff.cara.CaraNativeContact caraNativeContact) {
        jnireportThatSend(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeContact));
    }

    public CaraCppSessionFeatureCenter() {
        this.zidlCreateName = "cara.CaraCppSessionFeatureCenter@Create";
        jniCreateCaraCppSessionFeatureCenter("cara.CaraCppSessionFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
