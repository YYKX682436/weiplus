package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_XqmGHCCoKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217724a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217725b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217726c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217727d = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_ABI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217727d;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorRedPointUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorRedPointUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_PI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217724a;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onEnterWorksEntryTimestampChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onEnterWorksEntryTimestampChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((jr1.h) ((com.tencent.wechat.iam.biz.b1) entry.getValue())).getClass();
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).f349515m = j17;
            com.tencent.mars.xlog.Log.i("BizFans.BizFansUtil", "subscribeWorkEntryTimestampUpdated, timestamp: " + j17);
            rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), null, 5, false, 5, null);
        }
    }

    private void ZIDL_WI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217725b;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.tencent.wechat.iam.biz.g1) entry.getValue()).a((com.tencent.wechat.mm.biz.o4) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.o4.f218433f, bArr));
        }
    }

    private void ZIDL_YI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217726c;
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
