package com.tencent.youtu.sdkkitframework.framework;

/* loaded from: classes14.dex */
public abstract class YtFSMBaseState {
    private static final java.lang.String TAG = "YtFSMBaseState";
    protected boolean isFirstEnter = true;
    private long printFrameLogTime;
    protected java.util.HashMap<java.lang.String, java.lang.Object> stateData;
    protected java.lang.String stateName;
    protected java.lang.String stateSimpleName;

    public boolean containsKey(java.lang.String str) {
        return this.stateData.containsKey(str);
    }

    public void enter() {
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().enterState(this.stateSimpleName);
        if (this.isFirstEnter) {
            this.isFirstEnter = false;
            enterFirst();
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.stateName + " enter");
    }

    public abstract void enterFirst();

    public void exit() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.stateName + " exit");
    }

    public java.lang.Object getStateDataBy(java.lang.String str) {
        return this.stateData.get(str);
    }

    public java.lang.String getStateName() {
        return this.stateName;
    }

    public java.lang.String getStateSimpleName() {
        return this.stateSimpleName;
    }

    public void handleEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
    }

    public void handleStateAction(java.lang.String str, java.lang.Object obj) {
    }

    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        this.stateName = str;
        try {
            this.stateSimpleName = java.lang.Class.forName(str).getSimpleName();
        } catch (java.lang.Exception unused) {
            this.stateSimpleName = str.split("\\.")[r2.length - 1];
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "load " + this.stateSimpleName);
        this.stateData = new java.util.HashMap<>();
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().registerStateName(this.stateSimpleName);
    }

    public void moveToNextState() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.stateName + " move to next");
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void reset() {
        this.isFirstEnter = true;
        this.stateData.clear();
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.stateName + " reset");
    }

    public void unload() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "unload " + this.stateSimpleName);
        this.stateData.clear();
    }

    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().updateState(this.stateName);
        if (java.lang.System.currentTimeMillis() - this.printFrameLogTime > 3000) {
            this.printFrameLogTime = java.lang.System.currentTimeMillis();
            com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, this.stateName + " update bgr image width:" + i17 + ",height:" + i18);
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.stateName + " update image : " + i17 + "x" + i18 + " type " + i19);
    }

    public void updateDataBy(java.lang.String str, java.lang.Object obj) {
        this.stateData.put(str, obj);
    }

    public void updateSDKSetting(org.json.JSONObject jSONObject) {
    }
}
