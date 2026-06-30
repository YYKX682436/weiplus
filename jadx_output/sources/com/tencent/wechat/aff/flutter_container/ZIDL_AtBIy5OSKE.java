package com.tencent.wechat.aff.flutter_container;

/* loaded from: classes4.dex */
class ZIDL_AtBIy5OSKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216883a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_BI(byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216883a;
        com.tencent.wechat.zlog.Zlog.a("FlutterContainerBusKE", "onPushEventEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("FlutterContainerBusKE", "onPushEventEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
