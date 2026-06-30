package com.tencent.wechat.aff.migration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_t1VLdSnZKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217384a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217385b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217386c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217387d = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_EBI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217384a;
        com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onCloseTaskDetailPageEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onCloseTaskDetailPageEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_FBI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217385b;
        com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onNotifyTaskProgressEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onNotifyTaskProgressEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_GBI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217386c;
        com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onNotifyTaskStatusEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onNotifyTaskStatusEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_HBI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217387d;
        com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onNotifyTaskSceneEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("MigrationManagerKE", "onNotifyTaskSceneEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
