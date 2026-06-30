package com.tencent.wechat.aff.ovc;

/* loaded from: classes16.dex */
class ZIDL_fglmYCPBK {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217466a = new java.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_BX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_CX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_DI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217466a;
        com.tencent.wechat.zlog.Zlog.a("OVCLoadingUIK", "onDismissEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCLoadingUIK", "onDismissEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    public static native void ZIDL_fglmYCPBD(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_BV(long j17, java.lang.Object obj);

    public native void ZIDL_CV(long j17, java.lang.Object obj);

    public native void ZIDL_fglmYCPBC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
