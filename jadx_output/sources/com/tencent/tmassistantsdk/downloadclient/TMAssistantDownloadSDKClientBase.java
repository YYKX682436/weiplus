package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public abstract class TMAssistantDownloadSDKClientBase implements android.content.ServiceConnection {
    public static final java.lang.String CONNTECTSTATE_CONNECTING = "CONNECTING";
    public static final java.lang.String CONNTECTSTATE_FINISH = "FINISH";
    public static final java.lang.String CONNTECTSTATE_INIT = "INIT";
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKClient";
    public java.lang.String mClientKey;
    protected android.content.Context mContext;
    protected java.lang.String mDwonloadServiceName;
    protected java.lang.String connectState = CONNTECTSTATE_INIT;
    protected android.os.IInterface mServiceInterface = null;
    protected android.os.IInterface mServiceCallback = null;
    protected final java.lang.Object mThreadlock = new java.lang.Object();

    public TMAssistantDownloadSDKClientBase(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.mContext = context;
        this.mClientKey = str;
        this.mDwonloadServiceName = str2;
    }

    public abstract android.content.Intent getBindServiceIntent();

    public android.os.IInterface getServiceInterface() {
        android.content.Context context = this.mContext;
        if (context != null && context.getMainLooper().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            throw new java.lang.Exception("TMAssistantDownloadSDKClient must be called in other Thread(no MainThread)");
        }
        if (this.mServiceInterface == null) {
            initTMAssistantDownloadSDK();
            this.connectState = CONNTECTSTATE_CONNECTING;
            synchronized (this.mThreadlock) {
                this.mThreadlock.wait(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            }
        }
        android.os.IInterface iInterface = this.mServiceInterface;
        if (iInterface != null) {
            return iInterface;
        }
        throw new java.lang.Exception("TMAssistantDownloadSDKClient ServiceInterface is null");
    }

    public synchronized boolean initTMAssistantDownloadSDK() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "connectState = " + this.connectState);
        if (this.connectState != CONNTECTSTATE_INIT) {
            return true;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "initTMAssistantDownloadSDK,clientKey:" + this.mClientKey + ",mServiceInterface:" + this.mServiceInterface + ",threadId:" + java.lang.Thread.currentThread().getId());
        this.connectState = CONNTECTSTATE_INIT;
        if (this.mServiceInterface != null) {
            this.connectState = CONNTECTSTATE_FINISH;
            return true;
        }
        boolean z17 = false;
        if (this.mContext != null && this.mDwonloadServiceName != null) {
            try {
                z17 = this.mContext.bindService(getBindServiceIntent(), this, 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "initTMAssistantDownloadSDK bindResult:" + z17);
        }
        return z17;
    }

    public abstract void onDownloadSDKServiceInvalid();

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        stubAsInterface(iBinder);
        this.connectState = CONNTECTSTATE_FINISH;
        synchronized (this.mThreadlock) {
            this.mThreadlock.notifyAll();
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onServiceConnected,clientKey:" + this.mClientKey + ",mServiceInterface:" + this.mServiceInterface + ",IBinder:" + iBinder + ",threadId:" + java.lang.Thread.currentThread().getId());
        try {
            if (this.mServiceInterface == null || this.mServiceCallback == null) {
                return;
            }
            registerServiceCallback();
        } catch (android.os.RemoteException e17) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onServiceConnected, exception : " + e17.getMessage());
            onDownloadSDKServiceInvalid();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onServiceDisconnected,clientKey:" + this.mClientKey);
        synchronized (this) {
            this.mServiceInterface = null;
            this.connectState = CONNTECTSTATE_INIT;
            synchronized (this.mThreadlock) {
                this.mThreadlock.notifyAll();
            }
            onDownloadSDKServiceInvalid();
        }
    }

    public abstract void registerServiceCallback();

    public abstract void stubAsInterface(android.os.IBinder iBinder);

    public synchronized void unInitTMAssistantDownloadSDK() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "unInitTMAssistantDownloadSDK,clientKey:" + this.mClientKey + ",mServiceInterface:" + this.mServiceInterface + ",threadId:" + java.lang.Thread.currentThread().getId());
        if (this.mServiceInterface != null && this.mServiceCallback != null) {
            try {
                unRegisterServiceCallback();
            } catch (android.os.RemoteException unused) {
            }
        }
        android.content.Context context = this.mContext;
        if (context != null && this.mServiceInterface != null) {
            context.unbindService(this);
        }
        this.mServiceInterface = null;
        this.mServiceCallback = null;
        this.connectState = CONNTECTSTATE_INIT;
    }

    public abstract void unRegisterServiceCallback();
}
