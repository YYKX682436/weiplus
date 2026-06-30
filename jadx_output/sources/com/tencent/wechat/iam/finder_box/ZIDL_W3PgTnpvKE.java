package com.tencent.wechat.iam.finder_box;

/* loaded from: classes4.dex */
class ZIDL_W3PgTnpvKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217825a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_NI(boolean z17, byte[] bArr, boolean z18, byte[] bArr2, boolean z19, byte[] bArr3) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217825a;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizServiceProxyManagerKE", "onBizPhotoEnableUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizServiceProxyManagerKE", "onBizPhotoEnableUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
