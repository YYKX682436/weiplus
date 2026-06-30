package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public class TMAssistantDownloadOpenSDKClient extends com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase {
    protected static final java.lang.String TAG = "TMAssistantDownloadOpenSDKClient";
    private byte _hellAccFlag_;
    java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener> mListeners;
    protected boolean retryBindResult;
    protected int retryCount;

    public TMAssistantDownloadOpenSDKClient(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context, str, str2);
        this.retryBindResult = false;
        this.retryCount = 0;
        this.mListeners = new java.util.ArrayList<>();
        this.mServiceCallback = new com.tencent.assistant.sdk.remote.e() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.1
            @Override // com.tencent.assistant.sdk.remote.f
            public void onActionResult(byte[] bArr) {
                com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.TAG, "onActionResult  callBack data:" + bArr + "  mListeners.size:" + com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this.mListeners.size());
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread.getInstance().postActionResult(bArr, com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this.mListeners);
            }
        };
    }

    public static java.lang.String about() {
        return "TMAssistantDownloadOpenSDKClient_2014_03_06_11_20_release_25634";
    }

    public void addAssistantOnActionListener(com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener iAssistantOnActionListener) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "addAssistantOnActionListener");
        if (iAssistantOnActionListener == null || this.mListeners.contains(iAssistantOnActionListener)) {
            return;
        }
        this.mListeners.add(iAssistantOnActionListener);
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public android.content.Intent getBindServiceIntent() {
        android.content.Intent intent = new android.content.Intent(this.mDwonloadServiceName);
        intent.setPackage("com.tencent.android.qqdownloader");
        return intent;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public synchronized boolean initTMAssistantDownloadSDK() {
        boolean initTMAssistantDownloadSDK;
        initTMAssistantDownloadSDK = super.initTMAssistantDownloadSDK();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "initTMAssistantDownloadSDK bindResult:" + initTMAssistantDownloadSDK);
        if (!initTMAssistantDownloadSDK) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName("com.tencent.android.qqdownloader", "com.tencent.pangu.link.LinkProxyActivity");
                intent.addFlags(268435456);
                android.content.Context context = this.mContext;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient", "initTMAssistantDownloadSDK", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient", "initTMAssistantDownloadSDK", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, "retry bind service startActivity Exception:" + e17.toString());
            }
            final com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("retry_thread");
            n3Var.postDelayed(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        android.content.Intent bindServiceIntent = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this.getBindServiceIntent();
                        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this;
                        tMAssistantDownloadOpenSDKClient.retryBindResult = tMAssistantDownloadOpenSDKClient.mContext.bindService(bindServiceIntent, tMAssistantDownloadOpenSDKClient, 1);
                    } catch (java.lang.Exception e18) {
                        com.tencent.tmassistantsdk.util.TMLog.e(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.TAG, "retry bind service Exception:" + e18.toString());
                    }
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this.retryCount++;
                    com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.TAG, "retry bind service! retryBindResult:" + com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this.retryBindResult + ",retryCount:" + com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this.retryCount);
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient2 = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.this;
                    if (tMAssistantDownloadOpenSDKClient2.retryBindResult || tMAssistantDownloadOpenSDKClient2.retryCount >= 3) {
                        return;
                    }
                    n3Var.postDelayed(this, 1000L);
                }
            }, 1000L);
        }
        return initTMAssistantDownloadSDK;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void onDownloadSDKServiceInvalid() {
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator<com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener next = it.next();
            if (next != null) {
                next.onDownloadSDKServiceInvalid();
            }
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void registerServiceCallback() {
        java.lang.String encodeToString = com.tencent.tmassistantsdk.util.Base64.encodeToString(new com.tencent.tmassistantsdk.util.Cryptor().encrypt(java.lang.String.valueOf(java.lang.System.currentTimeMillis()).getBytes(), this.mClientKey.getBytes()), 0);
        com.tencent.assistant.sdk.remote.c cVar = (com.tencent.assistant.sdk.remote.c) this.mServiceInterface;
        java.lang.String str = this.mClientKey;
        com.tencent.assistant.sdk.remote.f fVar = (com.tencent.assistant.sdk.remote.f) this.mServiceCallback;
        com.tencent.assistant.sdk.remote.a aVar = (com.tencent.assistant.sdk.remote.a) cVar;
        aVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeString(str);
            obtain.writeString(encodeToString);
            obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
            aVar.f45845d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onServiceConnected,registerActionCallback:" + this.mClientKey + ",tokenString:" + encodeToString + ",threadId:" + java.lang.Thread.currentThread().getId() + ",mServiceCallback:" + this.mServiceCallback + ",registed result:" + readInt);
            if (readInt == 2) {
                onDownloadSDKServiceInvalid();
            }
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }

    public void sendAsyncData(byte[] bArr) {
        com.tencent.assistant.sdk.remote.c cVar;
        if (android.text.TextUtils.isEmpty(this.mClientKey) || (cVar = (com.tencent.assistant.sdk.remote.c) super.getServiceInterface()) == null) {
            return;
        }
        java.lang.String str = this.mClientKey;
        com.tencent.assistant.sdk.remote.a aVar = (com.tencent.assistant.sdk.remote.a) cVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            aVar.f45845d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public byte[] sendSyncData(byte[] bArr) {
        com.tencent.assistant.sdk.remote.c cVar;
        if (android.text.TextUtils.isEmpty(this.mClientKey) || (cVar = (com.tencent.assistant.sdk.remote.c) super.getServiceInterface()) == null) {
            return null;
        }
        java.lang.String str = this.mClientKey;
        com.tencent.assistant.sdk.remote.a aVar = (com.tencent.assistant.sdk.remote.a) cVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            aVar.f45845d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void stubAsInterface(android.os.IBinder iBinder) {
        com.tencent.assistant.sdk.remote.c aVar;
        int i17 = com.tencent.assistant.sdk.remote.b.f45846d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.assistant.sdk.BaseService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.assistant.sdk.remote.c)) ? new com.tencent.assistant.sdk.remote.a(iBinder) : (com.tencent.assistant.sdk.remote.c) queryLocalInterface;
        }
        this.mServiceInterface = aVar;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void unRegisterServiceCallback() {
        com.tencent.assistant.sdk.remote.c cVar = (com.tencent.assistant.sdk.remote.c) this.mServiceInterface;
        com.tencent.assistant.sdk.remote.f fVar = (com.tencent.assistant.sdk.remote.f) this.mServiceCallback;
        com.tencent.assistant.sdk.remote.a aVar = (com.tencent.assistant.sdk.remote.a) cVar;
        aVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
            aVar.f45845d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 2) {
                onDownloadSDKServiceInvalid();
            }
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
