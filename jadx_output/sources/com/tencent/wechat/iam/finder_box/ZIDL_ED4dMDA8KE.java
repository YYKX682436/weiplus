package com.tencent.wechat.iam.finder_box;

/* loaded from: classes4.dex */
class ZIDL_ED4dMDA8KE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217820a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217821b = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_OI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217820a;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_QI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217821b;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
