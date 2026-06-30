package com.tencent.wechat.aff.ovc;

/* loaded from: classes4.dex */
class ZIDL_cLTOF8jHK {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217446a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217447b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217448c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217449d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217450e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217451f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217452g = new java.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_BX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_CI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217446a;
        com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onRoomIdReadyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onRoomIdReadyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_DI(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217447b;
        com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onTraceMsgIdReadyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onTraceMsgIdReadyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_EI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217448c;
        com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onNluCostReadyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onNluCostReadyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_FI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217449d;
        com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onLastAsrTimeReadyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onLastAsrTimeReadyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_GX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_HX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_IX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_JX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_KI(java.lang.String str, boolean z17, boolean z18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217450e;
        com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onAnswerEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onAnswerEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_LI(java.lang.String str, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217451f;
        com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onAsrStreamEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onAsrStreamEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_MI(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217452g;
        com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onEndEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCChatBotK", "onEndEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            if (i17 != -2) {
            }
            throw null;
        }
    }

    public static native void ZIDL_cLTOF8jHD(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_BV(long j17, java.lang.Object obj);

    public native void ZIDL_GV(long j17, java.lang.Object obj);

    public native void ZIDL_HV(long j17, java.lang.Object obj, boolean z17);

    public native void ZIDL_IV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_JV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_cLTOF8jHC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
