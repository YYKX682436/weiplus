package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeJoinLiveQualityProphetContext extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeJoinLiveQualityProphetContext(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeJoinLiveQualityProphetContext(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeJoinLiveQualityProphetContext(com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContextBase caraNativeJoinLiveQualityProphetContextBase) {
        this.zidlCreateName = "cara.CaraNativeJoinLiveQualityProphetContext@Attach";
        jniCreateCaraNativeJoinLiveQualityProphetContext("cara.CaraNativeJoinLiveQualityProphetContext@Attach", this.zidlSvrIdentity, caraNativeJoinLiveQualityProphetContextBase);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeJoinLiveQualityProphetContext(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native java.lang.String jniliveID(long j17);

    private native int jninetworkQuality(long j17);

    private native int jniscene(long j17);

    private native int jnivideoQuality(long j17);

    public java.lang.String liveID() {
        return jniliveID(this.nativeHandler);
    }

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality networkQuality() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality.forNumber(jninetworkQuality(this.nativeHandler));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContext.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public int scene() {
        return jniscene(this.nativeHandler);
    }

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality videoQuality() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality.forNumber(jnivideoQuality(this.nativeHandler));
    }

    public CaraNativeJoinLiveQualityProphetContext(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeJoinLiveQualityProphetContext(str, str2, null);
    }
}
