package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes14.dex */
public class YtSDKStats extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static com.tencent.youtu.sdkkitframework.common.YtSDKStats ytSDKStats;
    private java.lang.String currentAction;
    private long currentEnterTimeStampMS;
    private java.lang.String currentState;
    private java.lang.String preInfo;
    private java.lang.String preUpdateState;
    private java.util.HashMap<java.lang.String, java.lang.Object> stateNameMap = new java.util.HashMap<>();

    public static synchronized void clearInstance() {
        synchronized (com.tencent.youtu.sdkkitframework.common.YtSDKStats.class) {
            if (ytSDKStats != null) {
                ytSDKStats = null;
            }
        }
    }

    public static synchronized com.tencent.youtu.sdkkitframework.common.YtSDKStats getInstance() {
        synchronized (com.tencent.youtu.sdkkitframework.common.YtSDKStats.class) {
            com.tencent.youtu.sdkkitframework.common.YtSDKStats ytSDKStats2 = ytSDKStats;
            if (ytSDKStats2 != null) {
                return ytSDKStats2;
            }
            com.tencent.youtu.sdkkitframework.common.YtSDKStats ytSDKStats3 = new com.tencent.youtu.sdkkitframework.common.YtSDKStats();
            ytSDKStats = ytSDKStats3;
            return ytSDKStats3;
        }
    }

    public static java.lang.String getNowTimeStamp() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    private void makeReport(java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap2 = new java.util.HashMap<>();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("state_id", str);
        hashMap3.put("state_action", str2);
        if (hashMap != null) {
            hashMap3.put("state_error", hashMap);
        }
        if (str3 != null) {
            hashMap3.put("state_cost", str3);
        }
        if (str4 != null) {
            hashMap3.put("state_info", str4);
        }
        hashMap2.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.STATE_STATS, hashMap3);
        sendStateEvent(hashMap2);
    }

    private void sendStateEvent(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        if (hashMap != null) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    public void enterState(java.lang.String str) {
        java.lang.Object obj = this.stateNameMap.get(str);
        if (obj == null) {
            return;
        }
        this.currentAction = "enter";
        int intValue = ((java.lang.Integer) obj).intValue();
        if (intValue == 0) {
            exitState();
            if (this.currentAction != null) {
                this.currentEnterTimeStampMS = java.lang.System.currentTimeMillis();
                this.currentState = str;
                makeReport(str, this.currentAction, null, null, null);
            }
        }
        this.stateNameMap.put(str, java.lang.Integer.valueOf(intValue + 1));
    }

    public void exitState() {
        if (this.currentState != null) {
            makeReport(this.currentState, "exit", null, java.lang.Long.toString(java.lang.System.currentTimeMillis() - this.currentEnterTimeStampMS), null);
        }
    }

    public void registerStateName(java.lang.String str) {
        this.stateNameMap.put(str, 0);
    }

    public void reportError(int i17, java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(i17));
        hashMap.put("error_msg", str);
        makeReport(this.currentState, this.currentAction, hashMap, null, null);
    }

    public void reportInfo(java.lang.String str) {
        java.lang.String str2 = this.preInfo;
        if (str2 == null || !str2.equals(str)) {
            this.preInfo = str;
        }
        makeReport(this.currentState, this.currentAction, null, null, str);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        java.util.Iterator<java.lang.String> it = this.stateNameMap.keySet().iterator();
        while (it.hasNext()) {
            this.stateNameMap.put(it.next(), 0);
        }
        this.currentState = null;
        this.preUpdateState = null;
        this.preInfo = null;
    }

    public void updateState(java.lang.String str) {
        this.currentAction = "update";
        java.lang.String str2 = this.preUpdateState;
        if (str2 == null || !str2.equals(this.currentState)) {
            java.lang.String str3 = this.currentState;
            this.preUpdateState = str3;
            makeReport(str3, this.currentAction, null, null, null);
        }
    }
}
