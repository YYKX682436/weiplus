package com.tencent.wechat.rtos;

/* loaded from: classes13.dex */
public class WeChatApi {
    private long nativeHandle = 0;
    private long callbackHandle = 0;

    /* loaded from: classes13.dex */
    public interface Callback {
        void onAnswerVoIPEvent();

        void onCancelLoginEvent();

        void onCannotLoginEvent();

        void onChannelHandshakeSuccessEvent();

        void onCloseChannelEvent(long j17);

        void onCloudHandShakeEvent(int i17, java.lang.String str);

        java.lang.String onGetExtSpamInfoEvent(int i17);

        int onGetLicenseEvent(java.lang.String str, java.lang.String str2);

        java.lang.String onGetLoginAvatarEvent();

        void onHangupVoIPEvent();

        boolean onIsForegroundEvent();

        boolean onIsPhysicalLinkConnectedEvent();

        void onListenServiceEvent(java.lang.String str);

        void onLoginResultEvent(int i17);

        void onLogoutEvent();

        boolean onRequestUseCloudHandShakeEvent();

        void onWriteChannelDataEvent(long j17, byte[] bArr);

        boolean onisNetworkConnectedEvent();
    }

    public WeChatApi() {
        jniCreateWeChatApi();
    }

    private native void jniCancelLogin();

    private native void jniCloudHandShakeEnd(int i17, int i18, java.lang.String str);

    private native void jniCreateWeChatApi();

    private native void jniCreateWeChatApi(long j17);

    private native void jniDestroyWeChatApi();

    private native void jniLogout();

    private native void jniNotifyChannelData(long j17, byte[] bArr);

    private native void jniNotifyChannelDisconnected(long j17);

    private native void jniNotifyForegroundChanged(boolean z17);

    private native void jniNotifyNetworkChanged();

    private native void jniNotifyNewChannelConnected(long j17, int i17);

    private native void jniNotifyNewMessage(java.lang.String str);

    private native void jniNotifyPhysicalLinkStateChanged(boolean z17);

    private native void jniNotifyUnbindWechat();

    private native void jniNotifyVoIPEvent(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18);

    private native void jniOnGetOAuthTicket(int i17, int i18, java.lang.String str, byte[] bArr);

    private native void jniRequireLogin(java.lang.String str);

    private native void jniSetCallback(java.lang.Object obj);

    private native void jniSetFastReplies(java.lang.String[] strArr);

    private native void jniStart(byte[] bArr);

    private native void jniStop();

    private native int jniTryAutoLogin(java.lang.String str);

    private native void jniUpdateDeviceName(java.lang.String str);

    private native void jniUploadXlog(int i17);

    public void cancelLogin() {
        jniCancelLogin();
    }

    public void cloudHandShakeEnd(int i17, int i18, java.lang.String str) {
        jniCloudHandShakeEnd(i17, i18, str);
    }

    public void logout() {
        jniLogout();
    }

    public void notifyChannelData(long j17, byte[] bArr) {
        jniNotifyChannelData(j17, bArr);
    }

    public void notifyChannelDisconnected(long j17) {
        jniNotifyChannelDisconnected(j17);
    }

    public void notifyForegroundChanged(boolean z17) {
        jniNotifyForegroundChanged(z17);
    }

    public void notifyNetworkChanged() {
        jniNotifyNetworkChanged();
    }

    public void notifyNewChannelConnected(long j17, int i17) {
        jniNotifyNewChannelConnected(j17, i17);
    }

    public void notifyNewMessage(java.lang.String str) {
        jniNotifyNewMessage(str);
    }

    public void notifyPhysicalLinkStateChanged(boolean z17) {
        jniNotifyPhysicalLinkStateChanged(z17);
    }

    public void notifyUnbindWechat() {
        jniNotifyUnbindWechat();
    }

    public void notifyVoIPEvent(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18) {
        jniNotifyVoIPEvent(i17, z17, str, str2, str3, z18);
    }

    public void onDestroy() {
        jniDestroyWeChatApi();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void onGetOAuthTicket(int i17, int i18, java.lang.String str, byte[] bArr) {
        jniOnGetOAuthTicket(i17, i18, str, bArr);
    }

    public void requireLogin(java.lang.String str) {
        jniRequireLogin(str);
    }

    public void setCallback(com.tencent.wechat.rtos.WeChatApi.Callback callback) {
        jniSetCallback(callback);
    }

    public void setFastReplies(java.lang.String[] strArr) {
        jniSetFastReplies(strArr);
    }

    public void start(byte[] bArr) {
        jniStart(bArr);
    }

    public void stop() {
        jniStop();
    }

    public int tryAutoLogin(java.lang.String str) {
        return jniTryAutoLogin(str);
    }

    public void updateDeviceName(java.lang.String str) {
        jniUpdateDeviceName(str);
    }

    public void uploadXlog(int i17) {
        jniUploadXlog(i17);
    }

    public WeChatApi(long j17) {
        jniCreateWeChatApi(j17);
    }
}
