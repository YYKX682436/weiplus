package com.tencent.wechat.aff.affroam;

/* loaded from: classes4.dex */
class ZIDL_esFfzitsKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215758a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215759b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215760c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215761d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215762e = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_II(byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215758a;
        com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onDeviceDiscoveredEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onDeviceDiscoveredEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_JI(long j17, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215759b;
        com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onAutoBackupEventEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onAutoBackupEventEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_KI(long j17, float f17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215760c;
        com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onDeleteBackupDataProgressEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onDeleteBackupDataProgressEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_LI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215761d;
        com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onResumeQuitedTaskEventEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onResumeQuitedTaskEventEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_MI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215762e;
        com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onDeviceStartConnectEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamManagerKE", "onDeviceStartConnectEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
