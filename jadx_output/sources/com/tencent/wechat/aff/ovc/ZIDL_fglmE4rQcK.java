package com.tencent.wechat.aff.ovc;

/* loaded from: classes4.dex */
class ZIDL_fglmE4rQcK {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217464a = new java.util.concurrent.ConcurrentHashMap();

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

    private void ZIDL_EI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217464a;
        com.tencent.wechat.zlog.Zlog.a("OVCSelectContactUIK", "onDismissEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCSelectContactUIK", "onDismissEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    public static native void ZIDL_fglmE4rQcD(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_BV(long j17, java.lang.Object obj, java.lang.String[] strArr, java.lang.String str);

    public native void ZIDL_CV(long j17, java.lang.Object obj);

    public native void ZIDL_D(long j17, java.lang.String[] strArr, java.lang.String str);

    public native void ZIDL_fglmE4rQcC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
