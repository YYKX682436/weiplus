package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeLiveCellProphetContext extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeLiveCellProphetContext(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeLiveCellProphetContext(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeLiveCellProphetContext(com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContextBase caraNativeLiveCellProphetContextBase) {
        this.zidlCreateName = "cara.CaraNativeLiveCellProphetContext@Attach";
        jniCreateCaraNativeLiveCellProphetContext("cara.CaraNativeLiveCellProphetContext@Attach", this.zidlSvrIdentity, caraNativeLiveCellProphetContextBase);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeLiveCellProphetContext(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native boolean jniisHomePageLoaded(long j17);

    private native boolean jniisInHomePage(long j17);

    private native float jnipredictProbThreshold(long j17);

    public boolean isHomePageLoaded() {
        return jniisHomePageLoaded(this.nativeHandler);
    }

    public boolean isInHomePage() {
        return jniisInHomePage(this.nativeHandler);
    }

    public float predictProbThreshold() {
        return jnipredictProbThreshold(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public CaraNativeLiveCellProphetContext(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeLiveCellProphetContext(str, str2, null);
    }
}
