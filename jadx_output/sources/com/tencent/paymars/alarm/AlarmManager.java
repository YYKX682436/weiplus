package com.tencent.paymars.alarm;

/* loaded from: classes12.dex */
public class AlarmManager extends com.tencent.paymars.app.BaseManager {
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes12.dex */
    public interface CallBack {
        boolean startAlarm(int i17, int i18, int i19);

        boolean stopAlarm(int i17);
    }

    public AlarmManager(long j17) {
        OnJniCreateAlarmManagerFromHandle(j17);
    }

    public native void OnJniCreateAlarmManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateAlarmManagerFromHandle(long j17);

    public native void OnJniDestroyAlarmManager();

    public native void OnJniSetCallback(java.lang.Object obj);

    @Override // com.tencent.paymars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public void onDestroy() {
        OnJniDestroyAlarmManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void setCallback(com.tencent.paymars.alarm.AlarmManager.CallBack callBack) {
        OnJniSetCallback(callBack);
    }

    public AlarmManager(com.tencent.paymars.app.Context context) {
        OnJniCreateAlarmManagerFromContext(context);
    }
}
