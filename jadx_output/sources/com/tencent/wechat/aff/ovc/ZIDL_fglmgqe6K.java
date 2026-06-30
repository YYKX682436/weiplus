package com.tencent.wechat.aff.ovc;

/* loaded from: classes4.dex */
class ZIDL_fglmgqe6K {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217468a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217469b = new java.util.concurrent.ConcurrentHashMap();

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

    private void ZIDL_FI(java.lang.String str, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217468a;
        com.tencent.wechat.zlog.Zlog.a("OVCMsgUIK", "onConfirmSendEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCMsgUIK", "onConfirmSendEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_GI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217469b;
        com.tencent.wechat.zlog.Zlog.a("OVCMsgUIK", "onDismissEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCMsgUIK", "onDismissEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    public static native void ZIDL_fglmgqe6D(long j17, java.lang.String str, java.lang.String str2);

    public native boolean ZIDL_B(long j17, java.lang.String str);

    public native void ZIDL_CV(long j17, java.lang.Object obj, java.lang.String str, java.lang.String str2);

    public native void ZIDL_DV(long j17, java.lang.Object obj);

    public native void ZIDL_E(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_fglmgqe6C(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
