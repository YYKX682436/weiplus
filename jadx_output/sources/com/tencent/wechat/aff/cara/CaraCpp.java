package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraCpp extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private static com.tencent.wechat.aff.cara.CaraCpp instance = new com.tencent.wechat.aff.cara.CaraCpp();
    private com.tencent.wechat.aff.cara.CaraCpp.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCpp(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCpp(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    private CaraCpp() {
        this.zidlCreateName = "cara.CaraCpp@Get";
        jniCreateCaraCpp("cara.CaraCpp@Get", this.zidlSvrIdentity);
    }

    public static com.tencent.wechat.aff.cara.CaraCpp buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return getInstance();
    }

    public static com.tencent.wechat.aff.cara.CaraCpp getInstance() {
        return instance;
    }

    private native void jniCreateCaraCpp(java.lang.String str, java.lang.String str2);

    private native void jnilaunch(long j17);

    public void launch() {
        jnilaunch(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCpp.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCpp.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }
}
