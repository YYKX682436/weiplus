package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_XqmGB1Os3KE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217720a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217721b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217722c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217723d = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_QI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217720a;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onLoginSuccessEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onLoginSuccessEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.tencent.wechat.iam.biz.y0) entry.getValue()).a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        }
    }

    private void ZIDL_SI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217721b;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onUnregisteredRedDotChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onUnregisteredRedDotChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_UI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217722c;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onBizClearedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onBizClearedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.tencent.wechat.iam.biz.r0) entry.getValue()).a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        }
    }

    private void ZIDL_WI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217723d;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onFailedRedDotChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManagerKE", "onFailedRedDotChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            pm0.v.X(new v01.n(((v01.o) ((com.tencent.wechat.iam.biz.t0) entry.getValue())).f432215a, z17));
        }
    }
}
