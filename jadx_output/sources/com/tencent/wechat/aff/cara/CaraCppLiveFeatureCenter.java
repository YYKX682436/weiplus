package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraCppLiveFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCppLiveFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCppLiveFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraCppLiveFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraCppLiveFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraCppLiveFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native void jnireportThatCellConsume(long j17);

    private native void jnireportThatCellExpose(long j17);

    private native void jnireportThatReddotConsume(long j17, java.lang.String str, java.lang.String str2, float[] fArr);

    private native void jnireportThatReddotExpose(long j17, java.lang.String str, java.lang.String str2, float[] fArr);

    private native void jnisetUserActiveLevel(long j17, int i17);

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void reportThatCellConsume() {
        jnireportThatCellConsume(this.nativeHandler);
    }

    public void reportThatCellExpose() {
        jnireportThatCellExpose(this.nativeHandler);
    }

    public void reportThatReddotConsume(java.lang.String str, java.lang.String str2, java.util.Optional<java.lang.Float> optional) {
        jnireportThatReddotConsume(this.nativeHandler, str, str2, com.tencent.wechat.zidl2.ZidlUtil.floatJavaToJniOptional(optional));
    }

    public void reportThatReddotExpose(java.lang.String str, java.lang.String str2, java.util.Optional<java.lang.Float> optional) {
        jnireportThatReddotExpose(this.nativeHandler, str, str2, com.tencent.wechat.zidl2.ZidlUtil.floatJavaToJniOptional(optional));
    }

    public void setUserActiveLevel(com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel caraLiveUserActiveLevel) {
        jnisetUserActiveLevel(this.nativeHandler, caraLiveUserActiveLevel.getNumber());
    }

    public CaraCppLiveFeatureCenter() {
        this.zidlCreateName = "cara.CaraCppLiveFeatureCenter@Create";
        jniCreateCaraCppLiveFeatureCenter("cara.CaraCppLiveFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
