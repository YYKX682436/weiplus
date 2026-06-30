package com.tencent.wechat.iam.finder_box;

/* loaded from: classes4.dex */
class ZIDL_KTN5zD9_KE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217823a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217824b = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_BI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217823a;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizInteractiveNativeToCppManagerKE", "onNotifyFetchMeTabRedPointEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizInteractiveNativeToCppManagerKE", "onNotifyFetchMeTabRedPointEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_HI(byte[] bArr, byte[] bArr2, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217824b;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizInteractiveNativeToCppManagerKE", "onNotificationDigestUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizInteractiveNativeToCppManagerKE", "onNotificationDigestUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
