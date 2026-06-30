package com.tencent.wechat.aff.websearch;

/* loaded from: classes16.dex */
public class WebSearchPlatformManager extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.websearch.WebSearchPlatformManager.Destructor destructor;
    com.tencent.wechat.aff.websearch.ZIDL_flS4gctrK jniCaller = new com.tencent.wechat.aff.websearch.ZIDL_flS4gctrK();
    com.tencent.wechat.aff.websearch.ZIDL_flS4gctrKE jniEventObj = new com.tencent.wechat.aff.websearch.ZIDL_flS4gctrKE();

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private static final java.lang.String TAG = "WebSearchPlatformManager.Destructor";
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.tencent.wechat.zlog.Zlog.a(TAG, "constructor WebSearchPlatformManager Destructor()", new java.lang.Object[0]);
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(TAG, "destructor WebSearchPlatformManager Destructor() id:" + this.zidlIdentity + "svrid: " + this.zidlSvrIdentity, new java.lang.Object[0]);
            com.tencent.wechat.aff.websearch.ZIDL_flS4gctrK.ZIDL_flS4gctrD(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    /* loaded from: classes16.dex */
    public interface GetWebViewPixelsCallback {
        void complete(byte[] bArr);
    }

    /* loaded from: classes11.dex */
    public interface NativeEventsEvent {
        void event(java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes16.dex */
    public interface NotifyFilterShowOrHideCallback {
        void complete(int i17);
    }

    public WebSearchPlatformManager(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_websearch", "aff_biz");
        this.jniCaller.ZIDL_flS4gctrC(this, this.jniEventObj, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public static com.tencent.wechat.aff.websearch.WebSearchPlatformManager buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return new com.tencent.wechat.aff.websearch.WebSearchPlatformManager(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2, j17);
    }

    public void createPlatformView(double d17, boolean z17) {
        this.jniCaller.ZIDL_B(this.nativeHandler, d17, z17);
    }

    public void dispose(int i17) {
        this.jniCaller.ZIDL_G(this.nativeHandler, i17);
    }

    public void getWebViewPixelsAsync(com.tencent.wechat.aff.websearch.WebSearchPlatformManager.GetWebViewPixelsCallback getWebViewPixelsCallback) {
        this.jniCaller.ZIDL_DV(this.nativeHandler, getWebViewPixelsCallback);
    }

    public void notifyFilterShowOrHideAsync(boolean z17, com.tencent.wechat.aff.websearch.WebSearchPlatformManager.NotifyFilterShowOrHideCallback notifyFilterShowOrHideCallback) {
        this.jniCaller.ZIDL_EV(this.nativeHandler, notifyFilterShowOrHideCallback, z17);
    }

    public void notifyFocusChanged(boolean z17) {
        this.jniCaller.ZIDL_C(this.nativeHandler, z17);
    }

    public void notifyH5BoxResult(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.jniCaller.ZIDL_F(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), str4.getBytes(java.nio.charset.StandardCharsets.UTF_8), str5.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.websearch.WebSearchPlatformManager.Destructor destructor = new com.tencent.wechat.aff.websearch.WebSearchPlatformManager.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void subscribeNativeEventsEvent(java.lang.String str, com.tencent.wechat.aff.websearch.WebSearchPlatformManager.NativeEventsEvent nativeEventsEvent) {
        this.jniEventObj.f217670a.put(str, nativeEventsEvent);
    }

    public void unsubscribeNativeEventsEvent(java.lang.String str) {
        this.jniEventObj.f217670a.remove(str);
    }

    public WebSearchPlatformManager() {
        this.zidlCreateName = "websearch.WebSearchPlatformManager@Create";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_websearch", "aff_biz");
        this.jniCaller.ZIDL_flS4gctrC(this, this.jniEventObj, this.zidlCreateName, this.zidlSvrIdentity, null);
    }
}
