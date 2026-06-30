package com.tencent.wechat.aff;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class ZIDL_SoYkO8DQKE {
    private static final java.lang.String TAG = "IlinkAuthKeeperKE";
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.aff.IlinkAuthKeeper.RequireAuthCodeEvent> requireAuthCodeEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.aff.IlinkAuthKeeper.UploadLogCompleteEvent> uploadLogCompleteEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    private void ZIDL_CI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onRequireAuthCodeEvent size: " + this.requireAuthCodeEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.wechat.aff.IlinkAuthKeeper.RequireAuthCodeEvent> entry : this.requireAuthCodeEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onRequireAuthCodeEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    private void ZIDL_KI(int i17) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onUploadLogCompleteEvent size: " + this.uploadLogCompleteEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.wechat.aff.IlinkAuthKeeper.UploadLogCompleteEvent> entry : this.uploadLogCompleteEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onUploadLogCompleteEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(i17);
        }
    }

    public void subscribeRequireAuthCodeEvent(java.lang.String str, com.tencent.wechat.aff.IlinkAuthKeeper.RequireAuthCodeEvent requireAuthCodeEvent) {
        this.requireAuthCodeEventMap.put(str, requireAuthCodeEvent);
    }

    public void subscribeUploadLogCompleteEvent(java.lang.String str, com.tencent.wechat.aff.IlinkAuthKeeper.UploadLogCompleteEvent uploadLogCompleteEvent) {
        this.uploadLogCompleteEventMap.put(str, uploadLogCompleteEvent);
    }

    public void unsubscribeRequireAuthCodeEvent(java.lang.String str) {
        this.requireAuthCodeEventMap.remove(str);
    }

    public void unsubscribeUploadLogCompleteEvent(java.lang.String str) {
        this.uploadLogCompleteEventMap.remove(str);
    }
}
