package com.tencent.wechat.aff.brand_service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_eRuvB8TjKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216036a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216037b = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_AI(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216036a;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceManagerBridgeKE", "onRecV3DataChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceManagerBridgeKE", "onRecV3DataChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.brand_service.p pVar = (com.tencent.wechat.aff.brand_service.p) entry.getValue();
            com.tencent.wechat.mm.brand_service.o0 o0Var = (com.tencent.wechat.mm.brand_service.o0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.brand_service.o0.f219108o, bArr);
            ((dw.b) pVar).getClass();
            dw.f fVar = dw.f.f244070a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onDataChangeEventV3, eventType -> " + i17 + " recInfo isWaterfallFlow -> " + o0Var.f219116n);
            if (i17 == 2 && o0Var.f219116n) {
                ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347329z);
            }
            if (i17 == 7) {
                ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).f475951i = true;
                dw.f.f244070a.a();
            }
        }
    }

    private void ZIDL_EBI(boolean z17, byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216037b;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceManagerBridgeKE", "onCreationCenterInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BrandServiceManagerBridgeKE", "onCreationCenterInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
