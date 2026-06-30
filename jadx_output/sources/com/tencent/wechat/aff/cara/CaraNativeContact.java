package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeContact extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeContact.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeContact(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeContact(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeContact(com.tencent.wechat.aff.cara.CaraNativeContactBase caraNativeContactBase) {
        this.zidlCreateName = "cara.CaraNativeContact@Attach";
        jniCreateCaraNativeContact("cara.CaraNativeContact@Attach", this.zidlSvrIdentity, caraNativeContactBase);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeContact buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeContact(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeContact(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native java.lang.String jnigetDisplayName(long j17);

    private native boolean jniisGroup(long j17);

    private native boolean jniisMinimized(long j17);

    private native boolean jniisMute(long j17);

    private native boolean jniisOpenIM(long j17);

    private native boolean jniisPrivate(long j17);

    private native boolean jniisSessionStickyOnTop(long j17);

    private native java.lang.String jniusername(long j17);

    public java.lang.String getDisplayName() {
        return jnigetDisplayName(this.nativeHandler);
    }

    public boolean isGroup() {
        return jniisGroup(this.nativeHandler);
    }

    public boolean isMinimized() {
        return jniisMinimized(this.nativeHandler);
    }

    public boolean isMute() {
        return jniisMute(this.nativeHandler);
    }

    public boolean isOpenIM() {
        return jniisOpenIM(this.nativeHandler);
    }

    public boolean isPrivate() {
        return jniisPrivate(this.nativeHandler);
    }

    public boolean isSessionStickyOnTop() {
        return jniisSessionStickyOnTop(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeContact.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeContact.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public java.lang.String username() {
        return jniusername(this.nativeHandler);
    }

    public CaraNativeContact(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeContact(str, str2, null);
    }
}
