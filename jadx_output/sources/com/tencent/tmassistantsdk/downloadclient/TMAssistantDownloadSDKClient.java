package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public class TMAssistantDownloadSDKClient extends com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase {
    protected static final java.lang.String DOWNDLOADSDKSERVICENAME = "com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService";
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKClient";
    protected java.lang.ref.ReferenceQueue<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener> mListenerReferenceQueue;
    protected java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> mWeakListenerArrayList;

    public TMAssistantDownloadSDKClient(android.content.Context context, java.lang.String str) {
        super(context, str, DOWNDLOADSDKSERVICENAME);
        this.mListenerReferenceQueue = new java.lang.ref.ReferenceQueue<>();
        this.mWeakListenerArrayList = new java.util.ArrayList<>();
        this.mServiceCallback = new com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.Stub() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.1
            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback
            public void OnDownloadSDKServiceTaskProgressChanged(java.lang.String str2, java.lang.String str3, long j17, long j18) {
                com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.TAG, "OnDownloadProgressChanged,clientKey:" + str2 + ",receivedLen:" + j17 + ",totalLen:" + j18 + ",url:" + str3);
                java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> it = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.this.mWeakListenerArrayList.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener> next = it.next();
                    com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener = next.get();
                    if (iTMAssistantDownloadSDKClientListener == null) {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.TAG, " listener = " + iTMAssistantDownloadSDKClientListener + "   linstenerWeakReference :" + next);
                    }
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread.getInstance().postTaskProgressChangedMessage(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.this, iTMAssistantDownloadSDKClientListener, str3, j17, j18);
                }
            }

            @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback
            public void OnDownloadSDKServiceTaskStateChanged(java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, boolean z17, boolean z18) {
                com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.TAG, "OnDownloadStateChanged,clientKey:" + str2 + ",state:" + i17 + ", errorcode" + i18 + ",url:" + str3);
                java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> it = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.this.mWeakListenerArrayList.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener> next = it.next();
                    com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener = next.get();
                    if (iTMAssistantDownloadSDKClientListener == null) {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.TAG, " listener = " + iTMAssistantDownloadSDKClientListener + "   linstenerWeakReference :" + next);
                    }
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread.getInstance().postTaskStateChangedMessage(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.this, iTMAssistantDownloadSDKClientListener, str3, i17, i18, str4, z17, z18);
                }
            }
        };
    }

    public static java.lang.String about() {
        return "TMAssistantDownloadSDKClient_2014_03_06_11_20_release_25634";
    }

    public synchronized void cancelDownloadTask(java.lang.String str) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "cancelDownloadTask,clientKey:" + this.mClientKey + ",url:" + str);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
        }
        com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            iTMAssistantDownloadSDKServiceInterface.cancelDownloadTask(this.mClientKey, str);
        } else {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "cancelDownloadTask, serviceInterface is null");
            super.initTMAssistantDownloadSDK();
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public android.content.Intent getBindServiceIntent() {
        return new android.content.Intent(this.mContext, java.lang.Class.forName(this.mDwonloadServiceName));
    }

    public synchronized com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskState(java.lang.String str) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "getDownloadTaskState,clientKey:" + this.mClientKey + ",url:" + str);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.getDownloadTaskState url is null");
        }
        com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            return iTMAssistantDownloadSDKServiceInterface.getDownloadTaskInfo(this.mClientKey, str);
        }
        super.initTMAssistantDownloadSDK();
        return null;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void onDownloadSDKServiceInvalid() {
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread.getInstance().postSDKServiceInvalidMessage(this, it.next().get());
        }
    }

    public synchronized void pauseDownloadTask(java.lang.String str) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "pauseDownloadTask,clientKey:" + this.mClientKey + ",url:" + str);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
        }
        com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            iTMAssistantDownloadSDKServiceInterface.pauseDownloadTask(this.mClientKey, str);
        } else {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "pauseDownloadTask, serviceInterface is null");
            super.initTMAssistantDownloadSDK();
        }
    }

    public synchronized boolean registerDownloadTaskListener(com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener) {
        if (iTMAssistantDownloadSDKClientListener == null) {
            return false;
        }
        while (true) {
            java.lang.ref.Reference<? extends com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener> poll = this.mListenerReferenceQueue.poll();
            if (poll == null) {
                break;
            }
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "registerDownloadTaskListener removed listener!!!!");
            this.mWeakListenerArrayList.remove(poll);
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTMAssistantDownloadSDKClientListener) {
                return true;
            }
        }
        this.mWeakListenerArrayList.add(new java.lang.ref.WeakReference<>(iTMAssistantDownloadSDKClientListener, this.mListenerReferenceQueue));
        return true;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void registerServiceCallback() {
        ((com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).registerDownloadTaskCallback(this.mClientKey, (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }

    public synchronized int startDownloadTask(java.lang.String str, java.lang.String str2) {
        return startDownloadTask(str, "", 0L, 0, str2, null, true, null);
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void stubAsInterface(android.os.IBinder iBinder) {
        this.mServiceInterface = com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.Stub.asInterface(iBinder);
    }

    public synchronized boolean unRegisterDownloadTaskListener(com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener) {
        if (iTMAssistantDownloadSDKClientListener == null) {
            return false;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener> next = it.next();
            if (next.get() == iTMAssistantDownloadSDKClientListener) {
                this.mWeakListenerArrayList.remove(next);
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void unRegisterServiceCallback() {
        ((com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).unregisterDownloadTaskCallback(this.mClientKey, (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }

    public synchronized int startDownloadTask(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        return startDownloadTask(str, "", 0L, 0, str2, null, true, map);
    }

    public synchronized int startDownloadTask(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return startDownloadTask(str, "", 0L, 0, str2, str3, true, null);
    }

    public synchronized int startDownloadTask(java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.String str3, java.lang.String str4, boolean z17, java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownloadTask,clientKey:" + this.mClientKey + ",url:" + str + ",contentType:" + str3);
        if (str != null) {
            if (str3.equals("resource/tm.android.unknown") && android.text.TextUtils.isEmpty(str4)) {
                throw new java.lang.IllegalArgumentException("if contentType is others, filename shouldn't be null!");
            }
            com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
            if (iTMAssistantDownloadSDKServiceInterface != null) {
                iTMAssistantDownloadSDKServiceInterface.setServiceSetingIsDownloadWifiOnly(z17);
                return iTMAssistantDownloadSDKServiceInterface.startDownloadTask(this.mClientKey, str, str2, j17, 0, str3, str4, map);
            }
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownloadTask, serviceInterface is null");
            super.initTMAssistantDownloadSDK();
            return 0;
        }
        throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
    }
}
