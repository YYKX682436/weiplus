package com.tencent.youtu.sdkkitframework.framework;

/* loaded from: classes14.dex */
public class YtFSM {
    private static final java.lang.String TAG = "YtFSM";
    private static com.tencent.youtu.sdkkitframework.framework.YtFSM instance;
    private com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState currentState;
    private com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener eventListener;
    private java.lang.String firstStateName;
    private com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext sdkPlatformContex;
    public java.lang.String supportCodecJSONStr;
    private java.lang.Thread updateEventHandler;
    private com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode currentWorkMode = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
    private boolean isStarted = false;
    private boolean needEventHandler = false;
    private java.util.HashMap<java.lang.String, com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState> stateMap = new java.util.HashMap<>();
    private com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData currentData = new com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData();
    private java.util.concurrent.locks.Lock stateLock = new java.util.concurrent.locks.ReentrantLock();
    private java.util.concurrent.locks.Lock startStopLock = new java.util.concurrent.locks.ReentrantLock();
    private java.util.concurrent.ConcurrentLinkedQueue<com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData> updateQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
    private java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> eventQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();

    /* loaded from: classes14.dex */
    public class YtFSMFireEventData {
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType eventType;
        java.lang.Object extraData;

        public YtFSMFireEventData(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
            this.eventType = ytFrameworkFireEventType;
            this.extraData = obj;
        }
    }

    /* loaded from: classes14.dex */
    public class YtFSMUpdateData {
        byte[] imageData;
        int imageHeight;
        int imageType;
        int imageWidth;
        long timeStamp;

        private YtFSMUpdateData() {
        }
    }

    private YtFSM() {
    }

    public static synchronized void clearInstance() {
        synchronized (com.tencent.youtu.sdkkitframework.framework.YtFSM.class) {
            if (instance != null) {
                instance = null;
            }
        }
    }

    public static synchronized com.tencent.youtu.sdkkitframework.framework.YtFSM getInstance() {
        com.tencent.youtu.sdkkitframework.framework.YtFSM ytFSM;
        synchronized (com.tencent.youtu.sdkkitframework.framework.YtFSM.class) {
            if (instance == null) {
                instance = new com.tencent.youtu.sdkkitframework.framework.YtFSM();
            }
            ytFSM = instance;
        }
        return ytFSM;
    }

    public void cleanUpQueue() {
        this.updateQueue.clear();
    }

    public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext getContext() {
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "YtFSM#getContext");
        if (this.sdkPlatformContex == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "sdkPlatformContex == null");
            this.sdkPlatformContex = new com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext();
        }
        return this.sdkPlatformContex;
    }

    public com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState getStateByName(java.lang.String str) {
        if (this.stateMap.containsKey(str)) {
            return this.stateMap.get(str);
        }
        return null;
    }

    public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode getWorkMode() {
        return this.currentWorkMode;
    }

    public void handleEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        try {
            this.eventQueue.add(new com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMFireEventData(ytFrameworkFireEventType, obj));
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Handle event failed:" + e17.getLocalizedMessage());
        }
    }

    public void handlePauseEvent() {
        java.util.Iterator<com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void handleResumeEvent() {
        java.util.Iterator<com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public int registerState(com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState ytFSMBaseState) {
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().registerStateName(ytFSMBaseState.getStateSimpleName());
        this.stateMap.put(ytFSMBaseState.getStateName(), ytFSMBaseState);
        return 0;
    }

    public void reset() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "FSM reset work mode " + this.currentWorkMode);
        this.supportCodecJSONStr = null;
        try {
            this.eventQueue.add("reset");
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "handle reset failed:" + e17.getLocalizedMessage());
        }
    }

    public void sendFSMEvent(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        if (this.eventListener == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Event listener not init");
            return;
        }
        if (hashMap.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT)) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "send framework event result: " + hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT) + " errorcode:" + hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE));
        }
        this.eventListener.onFrameworkEvent(hashMap);
    }

    public void sendNetworkRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (!android.text.TextUtils.isEmpty(this.supportCodecJSONStr)) {
            sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.2
                {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.framework.YtFSM.this.supportCodecJSONStr);
                        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_ACTION_VIDEO_CONSERVATION_SUCCESS);
                    } catch (org.json.JSONException unused) {
                    }
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.CONSERVATION_VIDEO_MESSAGE, jSONObject.toString());
                }
            });
        }
        if (this.eventListener == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Event listener not init");
        } else {
            sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.3
                final /* synthetic */ java.lang.String val$netType;

                {
                    this.val$netType = str;
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, str);
                }
            });
            this.eventListener.onNetworkRequestEvent(str2, str3, hashMap, iYtSDKKitNetResponseParser);
        }
    }

    public void setContext(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext) {
        this.sdkPlatformContex = ytSDKPlatformContext;
    }

    public void setEventListener(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        this.eventListener = iYtSDKKitFrameworkEventListener;
    }

    public void start(java.lang.String str, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, final int i17) {
        java.lang.String str2 = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str2, "FSM start use work mode " + ytSDKKitFrameworkWorkMode);
        try {
            try {
                this.startStopLock.lock();
                if (!this.isStarted) {
                    this.firstStateName = str;
                    this.currentWorkMode = ytSDKKitFrameworkWorkMode;
                    this.isStarted = true;
                    this.needEventHandler = true;
                    if (this.stateMap.containsKey(str)) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str2, "start set current state:" + str);
                        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState ytFSMBaseState = this.stateMap.get(this.firstStateName);
                        this.currentState = ytFSMBaseState;
                        ytFSMBaseState.enter();
                    } else {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(str2, "Start " + str + " failed which is not found");
                    }
                    this.updateQueue.clear();
                    java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.1
                        @Override // java.lang.Runnable
                        public void run() {
                            android.os.Process.setThreadPriority(i17);
                            while (com.tencent.youtu.sdkkitframework.framework.YtFSM.this.needEventHandler) {
                                if (com.tencent.youtu.sdkkitframework.framework.YtFSM.this.isStarted) {
                                    while (!com.tencent.youtu.sdkkitframework.framework.YtFSM.this.eventQueue.isEmpty()) {
                                        java.lang.Object poll = com.tencent.youtu.sdkkitframework.framework.YtFSM.this.eventQueue.poll();
                                        if (poll instanceof java.lang.String) {
                                            if (((java.lang.String) poll).equals("reset")) {
                                                java.util.Iterator it = com.tencent.youtu.sdkkitframework.framework.YtFSM.this.stateMap.values().iterator();
                                                while (it.hasNext()) {
                                                    ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) it.next()).reset();
                                                }
                                                if (com.tencent.youtu.sdkkitframework.framework.YtFSM.this.stateMap.containsKey(com.tencent.youtu.sdkkitframework.framework.YtFSM.this.firstStateName)) {
                                                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.framework.YtFSM.TAG, "reset set current state:" + com.tencent.youtu.sdkkitframework.framework.YtFSM.this.firstStateName);
                                                    com.tencent.youtu.sdkkitframework.framework.YtFSM ytFSM = com.tencent.youtu.sdkkitframework.framework.YtFSM.this;
                                                    ytFSM.currentState = (com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) ytFSM.stateMap.get(com.tencent.youtu.sdkkitframework.framework.YtFSM.this.firstStateName);
                                                    com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentState.enter();
                                                } else {
                                                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.framework.YtFSM.TAG, "reset failed: " + com.tencent.youtu.sdkkitframework.framework.YtFSM.this.firstStateName + " state is not found");
                                                }
                                                com.tencent.youtu.sdkkitframework.framework.YtFSM.this.updateQueue.clear();
                                            }
                                        } else if (poll instanceof com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMFireEventData) {
                                            com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMFireEventData ytFSMFireEventData = (com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMFireEventData) poll;
                                            com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.framework.YtFSM.TAG, "handleevent " + ytFSMFireEventData.eventType + " for all states");
                                            java.util.Iterator it6 = com.tencent.youtu.sdkkitframework.framework.YtFSM.this.stateMap.values().iterator();
                                            while (it6.hasNext()) {
                                                ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) it6.next()).handleEvent(ytFSMFireEventData.eventType, ytFSMFireEventData.extraData);
                                            }
                                        }
                                    }
                                    try {
                                        com.tencent.youtu.sdkkitframework.framework.YtFSM.this.stateLock.lock();
                                        com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData ytFSMUpdateData = (com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData) com.tencent.youtu.sdkkitframework.framework.YtFSM.this.updateQueue.poll();
                                        if (ytFSMUpdateData != null) {
                                            com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentData = ytFSMUpdateData;
                                            if (com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentState != null) {
                                                com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentState.update(com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentData.imageData, com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentData.imageWidth, com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentData.imageHeight, com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentData.imageType, com.tencent.youtu.sdkkitframework.framework.YtFSM.this.currentData.timeStamp);
                                            }
                                        }
                                    } finally {
                                        com.tencent.youtu.sdkkitframework.framework.YtFSM.this.stateLock.unlock();
                                    }
                                }
                                try {
                                    java.lang.Thread.sleep(5L);
                                } catch (java.lang.InterruptedException unused) {
                                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.framework.YtFSM.TAG, "sleep failed");
                                }
                            }
                        }
                    });
                    this.updateEventHandler = thread;
                    thread.setName("YtEventUpdateThread");
                    this.updateEventHandler.start();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getLocalizedMessage());
            }
        } finally {
            this.startStopLock.unlock();
        }
    }

    public void stop() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "FSM stop work mode " + this.currentWorkMode);
        try {
            try {
                this.startStopLock.lock();
                this.needEventHandler = false;
                java.lang.Thread thread = this.updateEventHandler;
                if (thread != null && thread.isAlive()) {
                    this.updateEventHandler.join();
                }
                if (this.isStarted) {
                    this.isStarted = false;
                    java.util.Iterator<com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState> it = this.stateMap.values().iterator();
                    while (it.hasNext()) {
                        it.next().unload();
                    }
                    this.stateMap.clear();
                    this.updateQueue.clear();
                }
            } catch (java.lang.InterruptedException e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getLocalizedMessage());
            }
        } finally {
            this.startStopLock.unlock();
        }
    }

    public int transitNextRound(java.lang.String str) {
        if (!this.stateMap.containsKey(str)) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "transitnextround faild:" + str + " state is not found");
            return -1;
        }
        this.currentState.exit();
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "transitnextround set current state:" + str);
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
        this.currentState = ytFSMBaseState;
        ytFSMBaseState.enter();
        return 0;
    }

    public int transitNow(java.lang.String str) {
        if (!this.stateMap.containsKey(str)) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "transitnow failed:" + str + " state is not found");
            return -1;
        }
        this.currentState.exit();
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "transitnow set current state:" + str);
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
        this.currentState = ytFSMBaseState;
        ytFSMBaseState.enter();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData ytFSMUpdateData = this.currentData;
        if (ytFSMUpdateData != null) {
            this.currentState.update(ytFSMUpdateData.imageData, ytFSMUpdateData.imageWidth, ytFSMUpdateData.imageHeight, ytFSMUpdateData.imageType, ytFSMUpdateData.timeStamp);
        }
        return 0;
    }

    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        if (this.isStarted) {
            if (bArr == null) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.w(TAG, "imageData == null");
                return;
            }
            if (bArr.length == 0) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.w(TAG, "imageData.length == 0");
                return;
            }
            if (!this.updateQueue.isEmpty()) {
                this.updateQueue.clear();
            }
            com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData ytFSMUpdateData = new com.tencent.youtu.sdkkitframework.framework.YtFSM.YtFSMUpdateData();
            ytFSMUpdateData.imageData = (byte[]) bArr.clone();
            ytFSMUpdateData.imageWidth = i17;
            ytFSMUpdateData.imageHeight = i18;
            ytFSMUpdateData.imageType = i19;
            ytFSMUpdateData.timeStamp = j17;
            this.updateQueue.add(ytFSMUpdateData);
        }
    }

    public void updateSDKSetting(org.json.JSONObject jSONObject) {
        java.util.Iterator<com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().updateSDKSetting(jSONObject);
        }
    }
}
