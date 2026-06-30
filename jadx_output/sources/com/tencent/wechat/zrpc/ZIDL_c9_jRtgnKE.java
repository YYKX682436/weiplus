package com.tencent.wechat.zrpc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ZIDL_c9_jRtgnKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f220033a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_DI(byte[] bArr, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f220033a;
        com.tencent.wechat.zlog.Zlog.a("ExtChannelKE", "onReceiveEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("ExtChannelKE", "onReceiveEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
