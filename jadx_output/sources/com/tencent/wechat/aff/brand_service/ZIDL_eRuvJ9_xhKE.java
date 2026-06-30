package com.tencent.wechat.aff.brand_service;

/* loaded from: classes4.dex */
class ZIDL_eRuvJ9_xhKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216038a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216039b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216040c = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_AI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216038a;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceDynamicCardMrgBridgeKE", "onAdServerInfoEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BrandServiceDynamicCardMrgBridgeKE", "onAdServerInfoEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_DI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216039b;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceDynamicCardMrgBridgeKE", "onRecFeedsAdServerInfoEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BrandServiceDynamicCardMrgBridgeKE", "onRecFeedsAdServerInfoEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_FI(int i17, long j17, byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216040c;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceDynamicCardMrgBridgeKE", "onDynamicCardInfoEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BrandServiceDynamicCardMrgBridgeKE", "onDynamicCardInfoEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
