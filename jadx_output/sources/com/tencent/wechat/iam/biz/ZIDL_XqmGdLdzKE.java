package com.tencent.wechat.iam.biz;

/* loaded from: classes4.dex */
class ZIDL_XqmGdLdzKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217728a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_II(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217728a;
        com.tencent.wechat.zlog.Zlog.a("BizInteractiveIdentityManagerKE", "onInteractiveIdentityChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BizInteractiveIdentityManagerKE", "onInteractiveIdentityChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
