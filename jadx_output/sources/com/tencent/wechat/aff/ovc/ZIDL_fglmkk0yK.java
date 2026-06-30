package com.tencent.wechat.aff.ovc;

/* loaded from: classes4.dex */
class ZIDL_fglmkk0yK {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217471a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217472b = new java.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_CX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_DX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_EI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217471a;
        com.tencent.wechat.zlog.Zlog.a("OVCPermissionRequestUIK", "onAllowEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCPermissionRequestUIK", "onAllowEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_FI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217472b;
        com.tencent.wechat.zlog.Zlog.a("OVCPermissionRequestUIK", "onDenyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCPermissionRequestUIK", "onDenyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    public static native void ZIDL_fglmkk0yD(long j17, java.lang.String str, java.lang.String str2);

    public native boolean ZIDL_B(long j17);

    public native void ZIDL_CV(long j17, java.lang.Object obj);

    public native void ZIDL_DV(long j17, java.lang.Object obj);

    public native void ZIDL_fglmkk0yC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
