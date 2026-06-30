package com.tencent.wechat.mm.brand_service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_q1bTCHfwKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f218844a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f218845b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f218846c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f218847d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f218848e = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_JI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f218844a;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onNotiListReadEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onNotiListReadEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((ow.h) ((com.tencent.wechat.mm.brand_service.e0) entry.getValue())).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "onNotiListRead");
            new com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent().e();
        }
    }

    private void ZIDL_OI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f218845b;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onInsertNotiEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onInsertNotiEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.mm.brand_service.d0 d0Var = (com.tencent.wechat.mm.brand_service.d0) entry.getValue();
            ((ow.f) d0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "onInsertNotiEvent");
            new com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent().e();
        }
    }

    private void ZIDL_QI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f218846c;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onEditNotiEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onEditNotiEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.mm.brand_service.b0 b0Var = (com.tencent.wechat.mm.brand_service.b0) entry.getValue();
            ((ow.e) b0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "onEditNotiEvent");
            new com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent().e();
        }
    }

    private void ZIDL_SI(long j17, byte[] bArr, long j18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f218847d;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onDeleteNotiEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onDeleteNotiEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.mm.brand_service.a0 a0Var = (com.tencent.wechat.mm.brand_service.a0) entry.getValue();
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            ((ow.g) a0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "onDeleteNotiEvent");
            new com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent().e();
        }
    }

    private void ZIDL_UI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f218848e;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onUpdateNotiExpireTimeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNotiManagerBridgeKE", "onUpdateNotiExpireTimeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
