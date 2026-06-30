package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
class ZIDL_esFfF5WM5KE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215728a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215729b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215730c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215731d = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_EI(long j17, float f17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215728a;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onProgressAndTransferStatsChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onProgressAndTransferStatsChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_FI(long j17, int i17, int i18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215729b;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onStateChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onStateChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_GI(long j17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215730c;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onConversationCompletedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onConversationCompletedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_HI(long j17, boolean z17, boolean z18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215731d;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onDowngradeScheduledEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskManagerKE", "onDowngradeScheduledEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
