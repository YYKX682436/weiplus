package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeLiveReddotProphetContext extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeLiveReddotProphetContext(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeLiveReddotProphetContext(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeLiveReddotProphetContext(com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContextBase caraNativeLiveReddotProphetContextBase) {
        this.zidlCreateName = "cara.CaraNativeLiveReddotProphetContext@Attach";
        jniCreateCaraNativeLiveReddotProphetContext("cara.CaraNativeLiveReddotProphetContext@Attach", this.zidlSvrIdentity, caraNativeLiveReddotProphetContextBase);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeLiveReddotProphetContext(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native java.lang.String jnianchor(long j17);

    private native int jnienterAction(long j17);

    private native boolean jniisHomePageLoaded(long j17);

    private native boolean jniisReddotScoreValid(long j17);

    private native float jnipredictProbThreshold(long j17);

    private native int jnipreloadControlFlag(long j17);

    private native float jnireddotScore(long j17);

    public java.lang.String anchor() {
        return jnianchor(this.nativeHandler);
    }

    public int enterAction() {
        return jnienterAction(this.nativeHandler);
    }

    public boolean isHomePageLoaded() {
        return jniisHomePageLoaded(this.nativeHandler);
    }

    public boolean isReddotScoreValid() {
        return jniisReddotScoreValid(this.nativeHandler);
    }

    public float predictProbThreshold() {
        return jnipredictProbThreshold(this.nativeHandler);
    }

    public int preloadControlFlag() {
        return jnipreloadControlFlag(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContext.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public float reddotScore() {
        return jnireddotScore(this.nativeHandler);
    }

    public CaraNativeLiveReddotProphetContext(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeLiveReddotProphetContext(str, str2, null);
    }
}
