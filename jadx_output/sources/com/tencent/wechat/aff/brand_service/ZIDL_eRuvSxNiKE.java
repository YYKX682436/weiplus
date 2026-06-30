package com.tencent.wechat.aff.brand_service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_eRuvSxNiKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216041a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216042b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216043c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216044d = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_AI(int i17) {
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onDataChangeEvent size: " + this.f216041a.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f216041a.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onDataChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((dw.a) ((com.tencent.wechat.aff.brand_service.w) entry.getValue())).getClass();
            dw.f fVar = dw.f.f244070a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onDataChangeEvent");
            dw.f.f244072c.getClass();
            ((ku5.t0) ku5.t0.f312615d).h(new zv.q0(i17), "BizFlutterDigestHelper");
        }
    }

    private void ZIDL_CI(boolean z17) {
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onInitDoneEvent size: " + this.f216042b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f216042b.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onInitDoneEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((dw.c) ((com.tencent.wechat.aff.brand_service.y) entry.getValue())).getClass();
            dw.f fVar = dw.f.f244070a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onInitDoneEvent");
            dw.f.f244072c.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceNativeNotifyBridgeReceiver", "onInitDoneEvent dbInitDone=" + z17);
            yw.a3.f466272g = z17;
            if (z17) {
                yw.a3.f466271f = true;
                yw.a3.f466274i = true;
                if (yw.a3.f466275j) {
                    yw.a3.f466275j = false;
                    new com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent().e();
                }
            }
            if (z17) {
                if (zv.m0.f476050v == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceMainCellExposeHelper", "do delayed expose nothing happened");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceMainCellExposeHelper", "do delayed expose delayedExposePos " + zv.m0.f476049u + " delayedExposeDesc " + zv.m0.f476048t);
                    ((ku5.t0) ku5.t0.f312615d).q(zv.h0.f475977d);
                }
            }
        }
    }

    private void ZIDL_EI(int i17, int i18, int i19) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216043c;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onIDKeyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onIDKeyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((dw.d) ((com.tencent.wechat.aff.brand_service.x) entry.getValue())).getClass();
            dw.f fVar = dw.f.f244070a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onIDKeyEvent");
            dw.f.f244072c.getClass();
            jx3.f.INSTANCE.w(i17, i18, i19);
        }
    }

    private void ZIDL_GI(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216044d;
        com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onKVEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("BrandServiceNativeNotifyBridgeKE", "onKVEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.brand_service.z zVar = (com.tencent.wechat.aff.brand_service.z) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            ((dw.e) zVar).getClass();
            dw.f fVar = dw.f.f244070a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent: onKVEvent");
            dw.f.f244072c.getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
        }
    }
}
