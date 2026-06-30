package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraCppConsumeSessionProphet extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraCppConsumeSessionProphet.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCppConsumeSessionProphet(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCppConsumeSessionProphet(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraCppConsumeSessionProphet(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraCppConsumeSessionProphet(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraCppConsumeSessionProphet buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraCppConsumeSessionProphet(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraCppConsumeSessionProphet(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native void jnireportThatConsumeSession(long j17, java.lang.String[] strArr);

    private native void jnireportThatLoadSessions(long j17, java.lang.String[] strArr);

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCppConsumeSessionProphet.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCppConsumeSessionProphet.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void reportThatConsumeSession(com.tencent.wechat.aff.cara.CaraNativeConsumeSession caraNativeConsumeSession) {
        jnireportThatConsumeSession(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeConsumeSession));
    }

    public void reportThatLoadSessions(java.util.ArrayList<java.lang.String> arrayList) {
        jnireportThatLoadSessions(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.stringListToArray(arrayList));
    }

    public CaraCppConsumeSessionProphet() {
        this.zidlCreateName = "cara.CaraCppConsumeSessionProphet@Create";
        jniCreateCaraCppConsumeSessionProphet("cara.CaraCppConsumeSessionProphet@Create", this.zidlSvrIdentity, null);
    }
}
