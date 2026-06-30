package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeAccountFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenter.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeAccountFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeAccountFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeAccountFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeAccountFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeAccountFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native byte[] jnidiscoverTab(long j17);

    private native int jnigender(long j17);

    private native boolean jniisRegisteredInChina(long j17);

    private native int jnimomentPrivacy(long j17);

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab discoverTab() {
        return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.tencent.wechat.zidl2.ZidlUtil.pbUnSerialize(com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.getDefaultInstance(), jnidiscoverTab(this.nativeHandler));
    }

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender gender() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.forNumber(jnigender(this.nativeHandler));
    }

    public boolean isRegisteredInChina() {
        return jniisRegisteredInChina(this.nativeHandler);
    }

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy momentPrivacy() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.forNumber(jnimomentPrivacy(this.nativeHandler));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public CaraNativeAccountFeatureCenter() {
        this.zidlCreateName = "cara.CaraNativeAccountFeatureCenter@Create";
        jniCreateCaraNativeAccountFeatureCenter("cara.CaraNativeAccountFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
