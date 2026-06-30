package com.tencent.wechat.aff.ext_device;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL__wvRFproKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216685a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216686b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216687c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216688d = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_CI(boolean z17, byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216685a;
        com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onOnlineDeviceInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onOnlineDeviceInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.ext_device.o.f216711s, bArr);
            throw null;
        }
    }

    private void ZIDL_EI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216686b;
        com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onOnlineDeviceBannerInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onOnlineDeviceBannerInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_LI(byte[] bArr, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216687c;
        com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onSyncStatusChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onSyncStatusChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_MI(int i17) {
        com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onOverallSyncStatusChangedEvent size: " + this.f216688d.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f216688d.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("ExtDeviceStatusManagerKE", "onOverallSyncStatusChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.ext_device.k kVar = (com.tencent.wechat.aff.ext_device.k) entry.getValue();
            com.tencent.wechat.aff.ext_device.n a17 = com.tencent.wechat.aff.ext_device.n.a(i17);
            final com.tencent.mm.ui.conversation.banner.l0 l0Var = ((com.tencent.mm.ui.conversation.banner.l0$$a) kVar).f207547a;
            if (l0Var.f207546q != a17) {
                l0Var.f207546q = a17;
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.banner.l0$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.conversation.banner.l0.this.i();
                    }
                });
            }
        }
    }
}
