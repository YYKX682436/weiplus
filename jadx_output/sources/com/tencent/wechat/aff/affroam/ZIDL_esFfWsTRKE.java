package com.tencent.wechat.aff.affroam;

/* loaded from: classes4.dex */
class ZIDL_esFfWsTRKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215733a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215734b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215735c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215736d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215737e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215738f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215739g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215740h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215741i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215742j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215743k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215744l = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215745m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215746n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215747o = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_ADI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215745m;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onCorruptTimeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onCorruptTimeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_BDI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215746n;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onFromTimeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onFromTimeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_CDI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215747o;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onGlobalSwitchEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onGlobalSwitchEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_OCI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215733a;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onFullDiffEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onFullDiffEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_PCI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215734b;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onShowErrorEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onShowErrorEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_QCI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215735c;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onIsOpenEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onIsOpenEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_RCI(float f17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215736d;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onProgressEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onProgressEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_SCI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215737e;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onRemainingTimeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onRemainingTimeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_TCI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215738f;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onSpeedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onSpeedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_UCI(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215739g;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onStateChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onStateChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            if (i17 == 0 || i17 == 1 || i17 == 2 || i17 != 3) {
            }
            throw null;
        }
    }

    private void ZIDL_VCI(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215740h;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onTypeChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onTypeChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_WCI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215741i;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onBackupSizeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onBackupSizeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_XCI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215742j;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onIsAutoCompressEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onIsAutoCompressEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_YCI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215743k;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onCurrentBackupSizeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onCurrentBackupSizeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_ZCI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215744l;
        com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onLastBackupTimeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("CloudRoamManagerKE", "onLastBackupTimeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
