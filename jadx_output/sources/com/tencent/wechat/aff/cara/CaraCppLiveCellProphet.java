package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraCppLiveCellProphet extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraCppLiveCellProphet.Destructor destructor;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraCppLiveCellProphet(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraCppLiveCellProphet(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraCppLiveCellProphet(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraCppLiveCellProphet(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraCppLiveCellProphet buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraCppLiveCellProphet(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraCppLiveCellProphet(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native void jnipredict(long j17, java.lang.String[] strArr, java.lang.String[] strArr2);

    private native void jnireportThatCellConsume(long j17, boolean[] zArr);

    private native void jnireportThatCellExpose(long j17, boolean[] zArr, java.lang.String[] strArr);

    private native void jnireportThatPreload(long j17, boolean[] zArr);

    public void predict(com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext caraNativeLiveCellProphetContext, com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallback caraNativeProphetPredictPositiveCallback) {
        jnipredict(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeLiveCellProphetContext), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeProphetPredictPositiveCallback));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraCppLiveCellProphet.Destructor destructor = new com.tencent.wechat.aff.cara.CaraCppLiveCellProphet.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void reportThatCellConsume(java.util.Optional<java.lang.Boolean> optional) {
        jnireportThatCellConsume(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional));
    }

    public void reportThatCellExpose(java.util.Optional<java.lang.Boolean> optional, com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContext caraNativeLiveCellProphetContext) {
        jnireportThatCellExpose(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni(caraNativeLiveCellProphetContext));
    }

    public void reportThatPreload(java.util.Optional<java.lang.Boolean> optional) {
        jnireportThatPreload(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(optional));
    }

    public CaraCppLiveCellProphet() {
        this.zidlCreateName = "cara.CaraCppLiveCellProphet@Create";
        jniCreateCaraCppLiveCellProphet("cara.CaraCppLiveCellProphet@Create", this.zidlSvrIdentity, null);
    }
}
