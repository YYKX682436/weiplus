package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public class TMAssistantDownloadSDKMessageThread extends com.tencent.mm.sdk.platformtools.n3 {
    private static com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread mInstance = null;
    private static android.os.HandlerThread mMessagehandlerThread = null;
    private static final int postActionResult = 4;
    private static final int postSDKServiceInvalidMessage = 3;
    private static final int postTaskProgressChangedMessage = 2;
    private static final int postTaskStateChangedMessage = 1;

    private TMAssistantDownloadSDKMessageThread(xu5.b bVar) {
        super(bVar);
    }

    public static synchronized com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread getInstance() {
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread tMAssistantDownloadSDKMessageThread;
        synchronized (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread(xu5.b.a("TMAssistantDownloadSDKMessageThread"));
            }
            tMAssistantDownloadSDKMessageThread = mInstance;
        }
        return tMAssistantDownloadSDKMessageThread;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            com.tencent.tmassistantsdk.util.ParamPair paramPair = (com.tencent.tmassistantsdk.util.ParamPair) message.obj;
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient) paramPair.mFirstParam;
            com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener = (com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener) paramPair.mSecondParam;
            android.os.Bundle data = message.getData();
            java.lang.String string = data.getString("url");
            int i18 = data.getInt("state");
            int i19 = data.getInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            java.lang.String string2 = data.getString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
            boolean z17 = data.getBoolean("hasChangeUrl");
            boolean z18 = data.getBoolean("autoRetry");
            if (iTMAssistantDownloadSDKClientListener != null) {
                iTMAssistantDownloadSDKClientListener.OnDownloadSDKTaskStateChanged(tMAssistantDownloadSDKClient, string, i18, i19, string2, z17, z18);
                return;
            }
            return;
        }
        if (i17 == 2) {
            com.tencent.tmassistantsdk.util.ParamPair paramPair2 = (com.tencent.tmassistantsdk.util.ParamPair) message.obj;
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient2 = (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient) paramPair2.mFirstParam;
            com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener2 = (com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener) paramPair2.mSecondParam;
            android.os.Bundle data2 = message.getData();
            java.lang.String string3 = data2.getString("url");
            long j17 = data2.getLong("receiveDataLen");
            long j18 = data2.getLong("totalDataLen");
            if (iTMAssistantDownloadSDKClientListener2 != null) {
                iTMAssistantDownloadSDKClientListener2.OnDownloadSDKTaskProgressChanged(tMAssistantDownloadSDKClient2, string3, j17, j18);
                return;
            }
            return;
        }
        if (i17 == 3) {
            com.tencent.tmassistantsdk.util.ParamPair paramPair3 = (com.tencent.tmassistantsdk.util.ParamPair) message.obj;
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient3 = (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient) paramPair3.mFirstParam;
            com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener3 = (com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener) paramPair3.mSecondParam;
            if (iTMAssistantDownloadSDKClientListener3 != null) {
                iTMAssistantDownloadSDKClientListener3.OnDwonloadSDKServiceInvalid(tMAssistantDownloadSDKClient3);
                return;
            }
            return;
        }
        if (i17 != 4) {
            return;
        }
        com.tencent.tmassistantsdk.util.ParamPair paramPair4 = (com.tencent.tmassistantsdk.util.ParamPair) message.obj;
        byte[] bArr = (byte[]) paramPair4.mFirstParam;
        java.util.ArrayList arrayList = (java.util.ArrayList) paramPair4.mSecondParam;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener iAssistantOnActionListener = (com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener) it.next();
                if (iAssistantOnActionListener != null) {
                    iAssistantOnActionListener.onActionResult(bArr);
                }
            }
        }
    }

    public void postActionResult(byte[] bArr, java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener> arrayList) {
        if (bArr == null || arrayList == null) {
            return;
        }
        android.os.Message obtainMessage = getInstance().obtainMessage();
        obtainMessage.what = 4;
        obtainMessage.obj = new com.tencent.tmassistantsdk.util.ParamPair(bArr, arrayList);
        obtainMessage.sendToTarget();
    }

    public void postSDKServiceInvalidMessage(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener) {
        if (iTMAssistantDownloadSDKClientListener == null || tMAssistantDownloadSDKClient == null) {
            return;
        }
        android.os.Message obtainMessage = getInstance().obtainMessage();
        obtainMessage.what = 3;
        obtainMessage.obj = new com.tencent.tmassistantsdk.util.ParamPair(tMAssistantDownloadSDKClient, iTMAssistantDownloadSDKClientListener);
        obtainMessage.sendToTarget();
    }

    public void postTaskProgressChangedMessage(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener, java.lang.String str, long j17, long j18) {
        if (iTMAssistantDownloadSDKClientListener == null || tMAssistantDownloadSDKClient == null) {
            com.tencent.tmassistantsdk.util.TMLog.i("TMAssistantDownloadSDKMessageThread", "listenr:" + iTMAssistantDownloadSDKClientListener + " === sdkClient" + tMAssistantDownloadSDKClient);
            return;
        }
        android.os.Message obtainMessage = getInstance().obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.obj = new com.tencent.tmassistantsdk.util.ParamPair(tMAssistantDownloadSDKClient, iTMAssistantDownloadSDKClientListener);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str);
        bundle.putLong("receiveDataLen", j17);
        bundle.putLong("totalDataLen", j18);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public void postTaskStateChangedMessage(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        if (iTMAssistantDownloadSDKClientListener == null || tMAssistantDownloadSDKClient == null) {
            return;
        }
        android.os.Message obtainMessage = getInstance().obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = new com.tencent.tmassistantsdk.util.ParamPair(tMAssistantDownloadSDKClient, iTMAssistantDownloadSDKClientListener);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str);
        bundle.putInt("state", i17);
        bundle.putInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i18);
        bundle.putString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str2);
        bundle.putBoolean("hasChangeUrl", z17);
        bundle.putBoolean("autoRetry", z18);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }
}
