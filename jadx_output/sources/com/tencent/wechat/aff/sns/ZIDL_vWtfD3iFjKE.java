package com.tencent.wechat.aff.sns;

/* loaded from: classes4.dex */
class ZIDL_vWtfD3iFjKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217496a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_FI(int i17, int i18, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217496a;
        com.tencent.wechat.zlog.Zlog.a("SnsCoverLogicDBManagerKE", "onSnsCoverInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("SnsCoverLogicDBManagerKE", "onSnsCoverInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
