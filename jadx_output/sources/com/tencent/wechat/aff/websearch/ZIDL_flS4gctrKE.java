package com.tencent.wechat.aff.websearch;

/* loaded from: classes11.dex */
class ZIDL_flS4gctrKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217670a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_HI(byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217670a;
        com.tencent.wechat.zlog.Zlog.a("WebSearchPlatformManagerKE", "onNativeEventsEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("WebSearchPlatformManagerKE", "onNativeEventsEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.tencent.wechat.aff.websearch.WebSearchPlatformManager.NativeEventsEvent) entry.getValue()).event(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8));
        }
    }
}
